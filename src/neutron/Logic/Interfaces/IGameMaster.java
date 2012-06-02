package neutron.Logic.Interfaces;

import neutron.Logic.Exceptions.GameStateException;
import neutron.Logic.Exceptions.PlayerWinException;

/*
 * Inspects the game course.
 * 
 * @author Marcin
 */
public interface IGameMaster {
    
    void initializeGame(IGameState gameState, IFirstMove firstMove);
    
    IGameState makeMove(IGameState gameState, int time) throws GameStateException, PlayerWinException;
}
