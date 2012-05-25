/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package neutron.Logic.Model;

import java.util.List;
import neutron.Logic.Interfaces.*;
import neutron.Logic.Model.Moves.NWMove;
import neutron.Logic.Model.Moves.SMove;
import neutron.Utils.Position;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Marcin
 */
public class GameStateGeneratorTest {
    
    public GameStateGeneratorTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Test
    public void new_game_generate_possible_moves() throws Exception {
        
        IGameBorderGenerator gbg = new GameBorderGenerator();
        IGameStateGenerator instance = new GameStateGenerator();
        IGameBorder game = gbg.generateNewGame(5);

        IPlayer p1 = new Player(PlayerNumber.Player1, BorderElementType.White);
        IPlayer p2 = new Player(PlayerNumber.Player2, BorderElementType.Black);
        
        IGameState gs = new GameState(game, p1, p2);
        
        List result = instance.getNexts(gs);

        // wszystkich wygenerowanych ruchow powinno byc 95
        assertEquals(95, result.size());
    }
    
    @Test
    public void ruch_czarnych_zablokowany() throws Exception {
        
        IGameStateGenerator instance = new GameStateGenerator();
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
        
        IPlayer p1 = new Player(PlayerNumber.Player1, BorderElementType.Black);
        IPlayer p2 = new Player(PlayerNumber.Player2, BorderElementType.White);
        
        IGameState gs = new GameState(game, p1, p2);
        List result = instance.getNexts(gs);
         
        assertNull(result);
    }
}
