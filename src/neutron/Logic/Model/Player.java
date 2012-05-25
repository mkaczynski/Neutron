package neutron.Logic.Model;

import java.security.InvalidParameterException;
import neutron.Logic.Interfaces.BorderElementType;
import neutron.Logic.Interfaces.IPlayer;
import neutron.Logic.Interfaces.PlayerNumber;

/**
 * @author Marcin
 */
public class Player implements IPlayer {

    private PlayerNumber playerNumber;
    private BorderElementType playerColor;
    
    public Player(PlayerNumber playerNumber, BorderElementType playerColor) {
        
        if(playerColor != BorderElementType.Black &&
                playerColor != BorderElementType.White) {
            throw new InvalidParameterException();
        }
        
        this.playerNumber = playerNumber;
        this.playerColor = playerColor;
    }
    
    @Override
    public PlayerNumber getPlayerNumber() {
        return playerNumber;
    }

    @Override
    public BorderElementType getPawnsColor() {
        return playerColor;
    }
    
}
