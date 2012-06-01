package neutron.Logic.Model;

import java.security.InvalidParameterException;
import neutron.Logic.Interfaces.IGameState;

/**
 * @author Marcin
 */
public class GameStateEvaluation {

    private IGameState gameState;
    private double evaluation;
    
    public GameStateEvaluation(IGameState gameState, double evaluation) {
    
        if(gameState == null) {
            throw new InvalidParameterException();
        }
        
        this.gameState = gameState;
        this.evaluation = evaluation;
    }
    
    public IGameState getGameState() {
        return gameState;
    }
    
    public double getEvaluation() {
        return evaluation;
    }
}
