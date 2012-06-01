package neutron.Logic.Exceptions;

import neutron.Logic.Interfaces.IGameState;

/**
 *
 * @author Marcin
 */
public class GameStateException extends Exception {

    private String message;
    private IGameState gameState;
    
    public GameStateException(String message, IGameState gameState) {
        this.message = message;
        this.gameState = gameState;
    }
    
    @Override
    public String getMessage() {
        return message;
    }
    
    public IGameState getGameState() {
        return gameState;
    }
}
