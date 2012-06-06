/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package neutron.Logic.Model;

import neutron.Logic.Interfaces.*;
import neutron.Logic.Model.Heuristics.Heuristic;
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
        IGameState result = instance.makeMove(gameState, 2);
        
        assertNotNull(result);
        //assertEquals(expResult, result);
    }
    
    /*
    @Test
    public void tmp() throws Exception {
        
        //test sprawdza tylko 1 ruch
        IGameBorderGenerator gbg = new GameBorderGenerator();
        BorderElementType[][] gbe = new BorderElementType[5][5];
        
        //Blank Blank White White White 
        //Blank Blank Blank Black Neutron 
        //Blank Blank Blank Black Blank 
        //White White Blank Blank Blank 
        //Blank Black Black Blank Black 

        gbe[0][0] = BorderElementType.Blank;
        gbe[0][1] = BorderElementType.Blank;
        gbe[0][2] = BorderElementType.White;
        gbe[0][3] = BorderElementType.White;
        gbe[0][4] = BorderElementType.White;
        
        gbe[1][0] = BorderElementType.Blank;
        gbe[1][1] = BorderElementType.Blank;
        gbe[1][2] = BorderElementType.Blank;
        gbe[1][3] = BorderElementType.Black;
        gbe[1][4] = BorderElementType.Neutron;
       
        gbe[2][0] = BorderElementType.Blank;
        gbe[2][1] = BorderElementType.Blank;
        gbe[2][2] = BorderElementType.Blank;
        gbe[2][3] = BorderElementType.Black;
        gbe[2][4] = BorderElementType.Blank;
       
        gbe[3][0] = BorderElementType.White;
        gbe[3][1] = BorderElementType.White;
        gbe[3][2] = BorderElementType.Blank;
        gbe[3][3] = BorderElementType.Blank;
        gbe[3][4] = BorderElementType.Blank;
       
        //Blank Black Black Blank Black 
        gbe[4][0] = BorderElementType.Blank;
        gbe[4][1] = BorderElementType.Black;
        gbe[4][2] = BorderElementType.Black;
        gbe[4][3] = BorderElementType.Blank;
        gbe[4][4] = BorderElementType.Black;
       
        IGameBorder gb = new GameBorder(gbe);
        gb.write();
         
        IPlayer p1 = new Player(PlayerNumber.Player1, BorderElementType.White, null);
        IPlayer p2 = new Player(PlayerNumber.Player2, BorderElementType.Black, null);
        
        IGameState gameState = new GameState(gb, p1, p2);
        
        IHeuristics heuristics = new Heuristic();
        IGameStateGenerator gameStateGenerator = new GameStateGenerator();
        ILogger logger = new FakeLogger();
        
        IAlgorithm instance = new Algorithm(heuristics, gameStateGenerator, logger);
        
        //IGameState expResult = null;
        IGameState result = instance.makeMove(gameState, 150);
        
        assertNotNull(result);
        //assertEquals(expResult, result);
        
    }
    
    @Test
    public void tmp1() throws Exception {
        
        //test sprawdza tylko 1 ruch
        IGameBorderGenerator gbg = new GameBorderGenerator();
        BorderElementType[][] gbe = new BorderElementType[5][5];
        
        //Blank Blank White White White 
        //Blank Blank Blank Black Neutron 
        //Blank Blank Blank Black Blank 
        //White White Blank Blank Blank 
        //Blank Black Black Blank Black 

        gbe[0][0] = BorderElementType.Blank;
        gbe[0][1] = BorderElementType.Blank;
        gbe[0][2] = BorderElementType.White;
        gbe[0][3] = BorderElementType.White;
        gbe[0][4] = BorderElementType.Blank;
        
        gbe[1][0] = BorderElementType.Blank;
        gbe[1][1] = BorderElementType.Blank;
        gbe[1][2] = BorderElementType.Blank;
        gbe[1][3] = BorderElementType.Black;
        gbe[1][4] = BorderElementType.Blank;
       
        gbe[2][0] = BorderElementType.Blank;
        gbe[2][1] = BorderElementType.Blank;
        gbe[2][2] = BorderElementType.Blank;
        gbe[2][3] = BorderElementType.Black;
        gbe[2][4] = BorderElementType.White;
       
        gbe[3][0] = BorderElementType.White;
        gbe[3][1] = BorderElementType.White;
        gbe[3][2] = BorderElementType.Blank;
        gbe[3][3] = BorderElementType.Blank;
        gbe[3][4] = BorderElementType.Neutron;
       
        //Blank Black Black Blank Black 
        gbe[4][0] = BorderElementType.Blank;
        gbe[4][1] = BorderElementType.Black;
        gbe[4][2] = BorderElementType.Black;
        gbe[4][3] = BorderElementType.Blank;
        gbe[4][4] = BorderElementType.Black;
       
        IGameBorder gb = new GameBorder(gbe);
        gb.write();
         
        IPlayer p1 = new Player(PlayerNumber.Player1, BorderElementType.Black, null);
        IPlayer p2 = new Player(PlayerNumber.Player2, BorderElementType.White, null);
        
        IGameState gameState = new GameState(gb, p1, p2);
        
        IHeuristics heuristics = new Heuristic();
        IGameStateGenerator gameStateGenerator = new GameStateGenerator();
        ILogger logger = new FakeLogger();
        
        IAlgorithm instance = new Algorithm(heuristics, gameStateGenerator, logger);
        
        //IGameState expResult = null;
        IGameState result = instance.makeMove(gameState, 150);
        
        assertNotNull(result);
        //assertEquals(expResult, result);
        
    }
    
    @Test
    public void tmp2() throws Exception {
        
        //test sprawdza tylko 1 ruch
        IGameBorderGenerator gbg = new GameBorderGenerator();
        BorderElementType[][] gbe = new BorderElementType[5][5];
        
        //Blank Blank White White White 
        //Blank Blank Blank Black Neutron 
        //Blank Blank Blank Black Blank 
        //White White Blank Blank Blank 
        //Blank Black Black Blank Black 

        gbe[0][0] = BorderElementType.White;
        gbe[0][1] = BorderElementType.White;
        gbe[0][2] = BorderElementType.White;
        gbe[0][3] = BorderElementType.White;
        gbe[0][4] = BorderElementType.White;
        
        gbe[1][0] = BorderElementType.White;
        gbe[1][1] = BorderElementType.White;
        gbe[1][2] = BorderElementType.White;
        gbe[1][3] = BorderElementType.Black;
        gbe[1][4] = BorderElementType.Neutron;
       
        gbe[2][0] = BorderElementType.White;
        gbe[2][1] = BorderElementType.White;
        gbe[2][2] = BorderElementType.White;
        gbe[2][3] = BorderElementType.Black;
        gbe[2][4] = BorderElementType.Blank;
       
        gbe[3][0] = BorderElementType.White;
        gbe[3][1] = BorderElementType.White;
        gbe[3][2] = BorderElementType.White;
        gbe[3][3] = BorderElementType.White;
        gbe[3][4] = BorderElementType.Blank;
       
        //Blank Black Black Blank Black 
        gbe[4][0] = BorderElementType.White;
        gbe[4][1] = BorderElementType.Black;
        gbe[4][2] = BorderElementType.Black;
        gbe[4][3] = BorderElementType.Blank;
        gbe[4][4] = BorderElementType.Black;
       
        IGameBorder gb = new GameBorder(gbe);
        gb.write();
         
        IPlayer p1 = new Player(PlayerNumber.Player1, BorderElementType.White, null);
        IPlayer p2 = new Player(PlayerNumber.Player2, BorderElementType.Black, null);
        
        IGameState gameState = new GameState(gb, p1, p2);
        
        IHeuristics heuristics = new Heuristic();
        IGameStateGenerator gameStateGenerator = new GameStateGenerator();
        ILogger logger = new FakeLogger();
        
        IAlgorithm instance = new Algorithm(heuristics, gameStateGenerator, logger);
        
        //IGameState expResult = null;
        IGameState result = instance.makeMove(gameState, 15000);
        
        assertNotNull(result);
        //assertEquals(expResult, result);
        
    }*/
}
