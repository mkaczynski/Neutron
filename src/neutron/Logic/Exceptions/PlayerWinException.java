package neutron.Logic.Exceptions;

import neutron.Logic.Interfaces.IGameState;

/**
 * @author Marcin
 */
public class PlayerWinException extends Exception {

    private IGameState gameState;
    
    public PlayerWinException(IGameState gameState) {
        this.gameState = gameState;
    }
    
    public IGameState getGameState() {
        return gameState;
    }
}
