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
public class GameStateEvaluationTest {
    
    public GameStateEvaluationTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Test
    public void get_game_state() {

        IGameBorderGenerator gbg = new GameBorderGenerator();
        IGameBorder gb = gbg.generateNewGame(5);
        
        IPlayer p1 = new Player(PlayerNumber.Player1, BorderElementType.White, null);
        IPlayer p2 = new Player(PlayerNumber.Player2, BorderElementType.Black, null);
        
        IGameState expResult = new GameState(gb, p1, p2);
        
        GameStateEvaluation instance = new GameStateEvaluation(expResult, 1.0);
        IGameState result = instance.getGameState();
        assertEquals(expResult, result);
    }

    @Test
    public void get_evaluation() {
        IGameBorderGenerator gbg = new GameBorderGenerator();
        IGameBorder gb = gbg.generateNewGame(5);
        
        IPlayer p1 = new Player(PlayerNumber.Player1, BorderElementType.White, null);
        IPlayer p2 = new Player(PlayerNumber.Player2, BorderElementType.Black, null);
        
        IGameState gs = new GameState(gb, p1, p2);
        double expResult = 12.0;
        
        GameStateEvaluation instance = new GameStateEvaluation(gs, expResult);
        double result = instance.getEvaluation();
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void try_create_invalid() {
    
        boolean wasException = false;
        
        try {
            GameStateEvaluation instance = new GameStateEvaluation(null, 1.0);        
        }
        catch(InvalidParameterException ex) {
            wasException = true;
        }
        
        assertEquals(true, wasException);
    
    }
}
