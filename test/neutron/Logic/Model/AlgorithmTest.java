/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package neutron.Logic.Model;

import neutron.Logic.Interfaces.*;
import neutron.Logic.Model.Heuristics.SimpleHeuristic;
import neutron.Logic.Model.Moves.SMove;
import neutron.Utils.Position;
import org.junit.AfterClass;
import static org.junit.Assert.assertNotNull;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Marcin
 */
public class AlgorithmTest {
    
    public AlgorithmTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Test
    public void prosty_alfa_beta() throws Exception {
        
        //test sprawdza tylko 1 ruch
        IGameBorderGenerator gbg = new GameBorderGenerator();
        IGameBorder gameBorder = gbg.generateNewGame(5);
        
        IMove m = new SMove();
        gameBorder = m.Move(gameBorder, BorderElementType.White, new Position(0, 0));

        IPlayer p1 = new Player(PlayerNumber.Player1, BorderElementType.Black, null);
        IPlayer p2 = new Player(PlayerNumber.Player2, BorderElementType.White, null);
        
        IGameState gameState = new GameState(gameBorder, p1, p2);
        
        IHeuristics heuristics = new SimpleHeuristic();
        IGameStateGenerator gameStateGenerator = new GameStateGenerator();
        ILogger logger = new FakeLogger();
        
        IAlgorithm instance = new Algorithm(heuristics, gameStateGenerator, logger);
        
        //IGameState expResult = null;
        IGameState result = instance.mekeMove(gameState);
        
        assertNotNull(result);
        //assertEquals(expResult, result);
    }
}
