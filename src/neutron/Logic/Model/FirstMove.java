package neutron.Logic.Model;

import neutron.Logic.Interfaces.*;
import neutron.Utils.Position;

/**
 * @author Marcin
 */
public class FirstMove implements IFirstMove {
    
    private BorderElementType playerColor;
    private IMove move;
    private String description;
    private Position position;
    
    public FirstMove(BorderElementType playerColor, Position position, IMove move, String description) {
        this.playerColor = playerColor;
        this.move = move;
        this.description = description;
        this.position = position;
    }
    
    @Override
    public IPlayer getFirstPlayer(IAlgorithm algorithm) {
        return new Player(PlayerNumber.Player1, playerColor, algorithm); 
    }
    
    @Override
    public IPlayer getSecondPlayer(IAlgorithm algorithm) {
        
        BorderElementType t = playerColor == BorderElementType.White ?
                BorderElementType.Black :
                BorderElementType.White;
        
        return new Player(PlayerNumber.Player2, t, algorithm); 
    }

    @Override
    public IMove getFirstMove() {
        return move;
    }
    
    @Override
    public String toString() {
        return description;
    }
    
    @Override
    public IGameBorder executeFirstMove(IGameBorder gameBorder) {
        return move.Move(gameBorder, playerColor, position);
    }
}
