package neutron.Logic.Interfaces;

import neutron.Logic.Exceptions.GameStateException;

/*
 * Inspects the game course.
 * 
 * @author Marcin
 */
public interface IGameMaster {
    
    void InitializeGame(IGameState gameState);
    
    IGameState makeMove(IGameState gameState) throws GameStateException;
}
