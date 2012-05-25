package neutron.Logic.Interfaces;

import neutron.Logic.Exceptions.GameStateException;

/**
 * @author Marcin
 */
public interface IAlgorithm {
    /*
     * Calculates new game state.
     * 
     * gameState - initial game state
     */
    IGameState makeMove(IGameState gameState) throws GameStateException;
}
