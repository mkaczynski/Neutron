/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package neutron.Logic.Model;

import java.util.logging.Level;
import java.util.logging.Logger;
import neutron.Logic.Exceptions.GameStateException;
import neutron.Logic.Interfaces.*;
import neutron.Logic.Model.Heuristics.SimpleHeuristic;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 * @author Marcin
 */
public class GameMasterTest {
    
    public GameMasterTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Test
    public void initialize_game_test() {
        IHeuristics heuristics = new SimpleHeuristic();
        IGameStateGenerator gsg = new GameStateGenerator();
        ILogger logger = new FakeLogger();
        IAlgorithm algorithm = new Algorithm(heuristics, gsg, logger);
        
        //obydwaj gracze graja alfa - beta
        IPlayer p1 = new Player(PlayerNumber.Player1, BorderElementType.White, algorithm);
        IPlayer p2 = new Player(PlayerNumber.Player2, BorderElementType.Black, algorithm);
        
        IGameBorderGenerator gbg = new GameBorderGenerator();
        IGameBorder gameBorder = gbg.generateNewGame(5);
        
        IGameState gameState = new GameState(gameBorder, p1, p2);
        
        IGameMaster instance = new GameMaster();
    
        instance.InitializeGame(gameState);
        
        assertEquals(p2, gameState.getActualPlayer());
        assertEquals(p1, gameState.getNextPlayer());
        
        // zmienili sie gracze
        // zmienilo sie ustawieni na planszy - na to na razie nie ma assercji
        
        gameState.getGameBorder().write();
    }
    
    @Test
    //w output mozna zobaczyc jak wyglada prowadzona rozgrywka (kilka pierwszych ruchow)
    public void smoke_test() {

        IHeuristics heuristics = new SimpleHeuristic();
        IGameStateGenerator gsg = new GameStateGenerator();
        ILogger logger = new FakeLogger();
        IAlgorithm algorithm = new Algorithm(heuristics, gsg, logger);
        
        //obydwaj gracze graja alfa - beta
        IPlayer p1 = new Player(PlayerNumber.Player1, BorderElementType.White, algorithm);
        IPlayer p2 = new Player(PlayerNumber.Player2, BorderElementType.Black, algorithm);
        
        IGameBorderGenerator gbg = new GameBorderGenerator();
        IGameBorder gameBorder = gbg.generateNewGame(5);
        
        IGameState gameState = new GameState(gameBorder, p1, p2);
        
        IGameMaster instance = new GameMaster();
    
        instance.InitializeGame(gameState);
        System.out.println();
        try {
            
            gameState = instance.makeMove(gameState);
            gameState.getGameBorder().write();
            System.out.println();
            
            gameState = instance.makeMove(gameState);
            gameState.getGameBorder().write();
            System.out.println();
            
            gameState = instance.makeMove(gameState);
            gameState.getGameBorder().write();
            System.out.println();
            
            gameState = instance.makeMove(gameState);
            gameState.getGameBorder().write();
            System.out.println();
        } catch (GameStateException ex) {
        
        }
    }
    
}
