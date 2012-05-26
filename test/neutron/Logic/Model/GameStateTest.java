/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package neutron.Logic.Model;

import java.security.InvalidParameterException;
import neutron.Logic.Interfaces.*;
import neutron.Logic.Model.Moves.NEMove;
import neutron.Logic.Model.Moves.NMove;
import neutron.Logic.Model.Moves.SEMove;
import neutron.Logic.Model.Moves.SMove;
import neutron.Utils.Position;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Marcin
 */
public class GameStateTest {
    
    public GameStateTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Test
    public void get_game_border() {
        
        IGameBorderGenerator gbg = new GameBorderGenerator();
        IGameBorder expResult = gbg.generateNewGame(5);
        
        IPlayer p1 = new Player(PlayerNumber.Player1, BorderElementType.White, null);
        IPlayer p2 = new Player(PlayerNumber.Player2, BorderElementType.Black, null);
        
        IGameState instance = new GameState(expResult, p1, p2);
        IGameBorder result = instance.getGameBorder();
        assertEquals(expResult, result);
    }

    @Test
    public void get_actual_player() {
        IPlayer expResult = new Player(PlayerNumber.Player1, BorderElementType.White, null);
        IPlayer p2 = new Player(PlayerNumber.Player2, BorderElementType.Black, null);
        
        IGameState instance = new GameState(null, expResult, p2);
        
        IPlayer result = instance.getActualPlayer();
        assertEquals(expResult, result);
    }

    @Test
    public void get_next_player() {
        IPlayer p2 = new Player(PlayerNumber.Player2, BorderElementType.Black, null);
        IPlayer expResult = new Player(PlayerNumber.Player1, BorderElementType.White, null);
        
        IGameState instance = new GameState(null, p2, expResult);
        
        IPlayer result = instance.getNextPlayer();
        assertEquals(expResult, result);
    }

    @Test
    public void change_players_test() {

        IPlayer p1 = new Player(PlayerNumber.Player1, BorderElementType.White, null);
        IPlayer p2 = new Player(PlayerNumber.Player2, BorderElementType.Black, null);
        
        IGameState instance = new GameState(null, p1, p2);

        IPlayer result = instance.getActualPlayer();
        assertEquals(p1, result);

        result = instance.getNextPlayer();
        assertEquals(p2, result);
        
        instance.changePlayers();

        result = instance.getActualPlayer();
        assertEquals(p2, result);

        result = instance.getNextPlayer();
        assertEquals(p1, result);
    }
    
    @Test
    public void try_create_invalid_game_state() {
    
        IPlayer p1 = new Player(PlayerNumber.Player1, BorderElementType.White, null);
        boolean wasException = false;
        
        try {
            IGameState instance = new GameState(null, p1, p1);
        }
        catch(InvalidParameterException ex) {
            wasException = true;
        }
        
        assertEquals(true, wasException);
    }

    @Test
    public void try_create_invalid_game_state_wrong_player_color() {
        boolean wasException = false;
        IPlayer p1 = new Player(PlayerNumber.Player1, BorderElementType.White, null);
        IPlayer p2 = new Player(PlayerNumber.Player2, BorderElementType.White, null);
        
        try {
            IGameState instance = new GameState(null, p1, p2);
        }
        catch(InvalidParameterException ex) {
            wasException = true;
        }
        assertEquals(true, wasException);
    }
    
    @Test
    public void try_create_invalid_game_state_wrong_player_number() {
        boolean wasException = false;
        IPlayer p1 = new Player(PlayerNumber.Player2, BorderElementType.White, null);
        IPlayer p2 = new Player(PlayerNumber.Player2, BorderElementType.Black, null);
        
        try {
            IGameState instance = new GameState(null, p1, p2);
        }
        catch(InvalidParameterException ex) {
            wasException = true;
        }
        assertEquals(true, wasException);
    }
    
    @Test
    public void set_border() {
        
        IGameBorderGenerator gbg = new GameBorderGenerator();
        IGameBorder gb = gbg.generateNewGame(5);
        
        IPlayer p1 = new Player(PlayerNumber.Player1, BorderElementType.White, null);
        IPlayer p2 = new Player(PlayerNumber.Player2, BorderElementType.Black, null);
        
        IGameState gs = new GameState(gb, p1, p2);
        
        IGameBorder expectedResult = gbg.generateNewGame(7);
        gs.setBorder(expectedResult);
        
        IGameBorder ngb = gs.getGameBorder();
        assertEquals(expectedResult, ngb);
    }
    
    @Test
    public void is_neutron_on_white_base_field() {
        
        IGameBorderGenerator gbg = new GameBorderGenerator();
        IGameBorder gb = gbg.generateNewGame(5);
        
        IPlayer p1 = new Player(PlayerNumber.Player1, BorderElementType.White, null);
        IPlayer p2 = new Player(PlayerNumber.Player2, BorderElementType.Black, null);
        
        IMove m = new SEMove();
        gb = m.Move(gb, BorderElementType.White, new Position(0, 2));
        
        m = new NMove();
        gb = m.Move(gb, BorderElementType.Neutron, new Position(2, 2));
    
        gb.write();
        
        IGameState gs = new GameState(gb, p1, p2);
        boolean result = gs.isNeutronOnBaseField();
        
        assertEquals(true, result);
    }
    
    @Test
    public void is_neutron_on_black_base_field() {
        
        IGameBorderGenerator gbg = new GameBorderGenerator();
        IGameBorder gb = gbg.generateNewGame(5);
        
        IPlayer p1 = new Player(PlayerNumber.Player1, BorderElementType.White, null);
        IPlayer p2 = new Player(PlayerNumber.Player2, BorderElementType.Black, null);
        
        IMove m = new NEMove();
        gb = m.Move(gb, BorderElementType.Black, new Position(4, 2));
        
        m = new SMove();
        gb = m.Move(gb, BorderElementType.Neutron, new Position(2, 2));
        
        IGameState gs = new GameState(gb, p1, p2);
        boolean result = gs.isNeutronOnBaseField();
        
        assertEquals(true, result);
    }
     
    @Test
    public void is_neutron_not_on_base_field() {
        
        IGameBorderGenerator gbg = new GameBorderGenerator();
        IGameBorder gb = gbg.generateNewGame(5);
        
        IPlayer p1 = new Player(PlayerNumber.Player1, BorderElementType.White, null);
        IPlayer p2 = new Player(PlayerNumber.Player2, BorderElementType.Black, null);
        
        IGameState gs = new GameState(gb, p1, p2);
        boolean result = gs.isNeutronOnBaseField();
        
        assertEquals(false, result);
                
        IMove m = new SMove();
        gb = m.Move(gb, BorderElementType.Neutron, new Position(2, 2));
        
        gs = new GameState(gb, p1, p2);
        result = gs.isNeutronOnBaseField();
        
        assertEquals(false, result);
        
        m = new NEMove();
        gb = m.Move(gb, BorderElementType.Neutron, new Position(3, 2));
        
        gs = new GameState(gb, p1, p2);
        result = gs.isNeutronOnBaseField();
        
        assertEquals(false, result);
    } 
}
