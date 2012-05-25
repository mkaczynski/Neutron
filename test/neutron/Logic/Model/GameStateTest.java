/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package neutron.Logic.Model;

import java.security.InvalidParameterException;
import neutron.Logic.Interfaces.*;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

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
}
