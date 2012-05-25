/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package neutron.Logic.Model.Heuristics;

import java.text.DecimalFormat;
import neutron.Logic.Interfaces.*;
import neutron.Logic.Model.*;
import neutron.Logic.Model.Moves.NWMove;
import neutron.Logic.Model.Moves.SMove;
import neutron.Utils.Position;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author Marcin
 */
public class SimpleHeuristicTest {
    
    public SimpleHeuristicTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Test
    public void simple_heuristic_value() {

        IGameBorderGenerator gbg = new GameBorderGenerator();
        IGameBorder gameBorder = gbg.generateNewGame(5);
        
        IMove m = new SMove();
        gameBorder = m.Move(gameBorder, BorderElementType.Neutron, new Position(2,2));
        gameBorder = m.Move(gameBorder, BorderElementType.White, new Position(0,0));
        
        IPlayer p1 = new Player(PlayerNumber.Player1, BorderElementType.White);
        IPlayer p2 = new Player(PlayerNumber.Player2, BorderElementType.Black);
        
        IGameState gameState = new GameState(gameBorder, p1, p2);
        
        // bialy wykonal potencjalny ruch i teraz nalezy go ocenic
        
        IHeuristics instance = new SimpleHeuristic();
        
        double expResult = 52.63; //wyznaczono eksperymentalnie - nie ma pewnosci czy to jest dobrze!
        double result = round(instance.heuristicsValue(gameState));
        assertEquals(expResult,  result, 0.0);   
    }
    
    @Test
    public void simple_heuristic_max_value() {

        // po wykonaniu ruchu bialych, czarna sa zablokowane
        
        IGameBorderGenerator gbg = new GameBorderGenerator();
        IGameBorder game = gbg.generateNewGame(5);
        
        IMove m = new SMove();
        game = m.Move(game, BorderElementType.White, new Position(0, 0));
        game = m.Move(game, BorderElementType.White, new Position(0, 1));
        
        IMove nw = new NWMove();
        game = nw.Move(game, BorderElementType.Neutron, new Position(2, 2));
        
        game = m.Move(game, BorderElementType.White, new Position(0, 2));
        game = m.Move(game, BorderElementType.White, new Position(0, 3));
        game = m.Move(game, BorderElementType.White, new Position(0, 4));
        
        game.write();
        
        IPlayer p1 = new Player(PlayerNumber.Player1, BorderElementType.White);
        IPlayer p2 = new Player(PlayerNumber.Player2, BorderElementType.Black);
        
        IGameState gs = new GameState(game, p1, p2);
        
        // bialy wykonal potencjalny ruch i teraz nalezy go ocenic
        
        IHeuristics instance = new SimpleHeuristic();
        
        double expResult = SimpleHeuristic.maxValue;
        double result = round(instance.heuristicsValue(gs));
        assertEquals(expResult, result, 0.0);   
    }
    
    static double round(double d) {
        int ix = (int)(d * 100.0); // scale it 
        return ((double)ix)/100.0;
    }
}
