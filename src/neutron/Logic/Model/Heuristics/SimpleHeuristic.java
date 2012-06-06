package neutron.Logic.Model.Heuristics;

import java.util.List;
import neutron.Logic.Interfaces.*;
import neutron.Logic.Model.GameState;
import neutron.Logic.Model.GameStateGenerator;

/**
 * @author Marcin
 */
public class SimpleHeuristic implements IHeuristics {

    public static int minValue = 0;
    public static int maxValue = 100;
    
    /*
     * The value of this heuristic is a number of possible moves of the next player.
     */
    @Override
    public double heuristicsValue(IGameState gameState, BorderElementType playmaker) {
        
        // slaboscia sama w sobie jest rozwijanie drzewa w heurystyce - ogolnie to rozwijanie jest bez
        // sensu, ale heurystyka znacznie rozni sie od innych
        
       int x = gameState.getGameBorder().getNeutronPosition().getX();

       if(x == ((playmaker == BorderElementType.Black) ?  0 : 4))
           return 0;
       else if(x == ((playmaker == BorderElementType.Black) ? 4 : 0))
            return 100;
 
        
        IPlayer nextPlayer = gameState.getNextPlayer();
        IPlayer currentPlayer = gameState.getActualPlayer();
        
        IGameState gs = new GameState(gameState.getGameBorder(), nextPlayer, currentPlayer);
                
        IGameStateGenerator gsg = new GameStateGenerator();
        List results = gsg.getNexts(gs);
       
        if(results == null) {
            return maxValue; // nastepny gracz nie moze wykonac ruchu
        }
        
        return ((double)results.size() / 200) * 100; // znormalizowana liczba ruchow
    }
    
}
