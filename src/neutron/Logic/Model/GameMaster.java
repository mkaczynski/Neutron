package neutron.Logic.Model;

import neutron.Logic.Exceptions.GameStateException;
import neutron.Logic.Interfaces.*;
import neutron.Logic.Model.Moves.NMove;
import neutron.Logic.Model.Moves.SMove;
import neutron.Utils.Position;

/**
 * @author Marcin
 */
public class GameMaster implements IGameMaster {

    @Override
    public void InitializeGame(IGameState gameState) {
        
        if(gameState.getActualPlayer().getPawnsColor() == BorderElementType.White) {
            IMove m = new SMove();
            m.Move(gameState.getGameBorder(), BorderElementType.White, new Position(0,1));
        }
        else {
            IMove m = new NMove();
            m.Move(gameState.getGameBorder(), BorderElementType.Black, 
                    new Position(gameState.getGameBorder().getBorderSize() - 1, 1));
        }
    
        gameState.changePlayers();
    }
    
    @Override
    public IGameState makeMove(IGameState gameState) throws GameStateException {
        
        IPlayer actualPlayer = gameState.getActualPlayer();
        return actualPlayer.getAlgorithm().makeMove(gameState);
        //@note: kolejnosc graczy w nowym IGameState jest juz dobrze ustalona
    }
}
