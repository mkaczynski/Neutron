package neutron.Logic.Model;

import neutron.Logic.Interfaces.BorderElementType;
import neutron.Logic.Interfaces.IGameMaster;
import neutron.Logic.Interfaces.IGameState;
import neutron.Logic.Interfaces.IMove;
import neutron.Logic.Model.Moves.NMove;
import neutron.Logic.Model.Moves.SMove;
import neutron.Utils.Position;

/**
 * @author Marcin
 */
public class GameMaster implements IGameMaster {
    
    private IGameState gameState;

    public void InitializeGame(IGameState gameState) {
        
        if(gameState.getActualPlayer().getPawnsColor() == BorderElementType.White) {
            IMove m = new SMove();
            m.Move(gameState.getGameBorder(), BorderElementType.White, new Position(0,1));
        }
        else {
            IMove m = new NMove();
            m.Move(gameState.getGameBorder(), BorderElementType.Black, 
                    new Position(gameState.getGameBorder().getBorderSize() - 1,1));
        }
    
        
    }
}
