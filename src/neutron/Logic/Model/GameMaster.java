package neutron.Logic.Model;

import neutron.Logic.Exceptions.GameStateException;
import neutron.Logic.Exceptions.PlayerWinException;
import neutron.Logic.Interfaces.*;
import neutron.Logic.Model.Moves.NMove;
import neutron.Logic.Model.Moves.SMove;
import neutron.Utils.Position;

/**
 * @author Marcin
 */
public class GameMaster implements IGameMaster {

    @Override
    public void initializeGame(IGameState gameState) {
        
        IGameBorder gb;
        if(gameState.getActualPlayer().getPawnsColor() == BorderElementType.White) {
            IMove m = new SMove();
            gb = m.Move(gameState.getGameBorder(), BorderElementType.White, new Position(0,1));
        }
        else {
            IMove m = new NMove();
            gb = m.Move(gameState.getGameBorder(), BorderElementType.Black, 
                    new Position(gameState.getGameBorder().getBorderSize() - 1, 1));
        }
        
        gameState.setBorder(gb);
        gameState.changePlayers();
    }
    
    @Override
    public IGameState makeMove(IGameState gameState) throws GameStateException, PlayerWinException {
        
        IPlayer actualPlayer = gameState.getActualPlayer();
        IGameState newGameState = actualPlayer.getAlgorithm().makeMove(gameState);
        //@note: kolejnosc graczy w nowym IGameState jest juz dobrze ustalona
    
        if(gameIsOver(newGameState)) {
            throw new PlayerWinException(newGameState);
        }
        
        return newGameState;
    }
    
    private boolean gameIsOver(IGameState gameState) {
        return gameState.isNeutronOnBaseField();
    }
}
