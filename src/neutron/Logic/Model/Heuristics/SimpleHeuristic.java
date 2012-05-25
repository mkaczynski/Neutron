package neutron.Logic.Model.Heuristics;

import java.util.List;
import neutron.Logic.Interfaces.IGameState;
import neutron.Logic.Interfaces.IGameStateGenerator;
import neutron.Logic.Interfaces.IHeuristics;
import neutron.Logic.Interfaces.IPlayer;
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
    public double heuristicsValue(IGameState gameState) {
        
        // trzeba mieć na uwadze, ze ta heurystyka jest bardzo slaba, bo
        // patrzy tylko na 1 najblizszy ruch
        // slaboscia sama w sobie jest rozwijanie drzewa w heurystyce
        
        IPlayer nextPlayer = gameState.getNextPlayer();
        IPlayer currentPlayer = gameState.getActualPlayer();
        
        IGameState gs = new GameState(gameState.getGameBorder(), nextPlayer, currentPlayer);
                
        IGameStateGenerator gsg = new GameStateGenerator();
        List results = gsg.getNexts(gs);
       
        if(results == null) {
            return maxValue; // nastepny gracz nie moze wykonac ruchu
        }
        
        return ((double)results.size() / 95) * 100; // znormalizowana liczba ruchow, 95 dlatego ze
                                            // tyle jest ruchow dla pustej planszy
    }
    
}
