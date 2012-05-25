/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package neutron.Logic.Model;

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
        
        IGameState instance = new GameState(expResult, null, null);
        IGameBorder result = instance.getGameBorder();
        assertEquals(expResult, result);
    }

    @Test
    public void get_actual_player() {
        IPlayer expResult = new Player(PlayerNumber.Player1, BorderElementType.White, null);
        IGameState instance = new GameState(null, expResult, null);
        
        IPlayer result = instance.getActualPlayer();
        assertEquals(expResult, result);
    }

    @Test
    public void get_next_player() {
        IPlayer expResult = new Player(PlayerNumber.Player1, BorderElementType.White, null);
        IGameState instance = new GameState(null, null, expResult);
        
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
}
