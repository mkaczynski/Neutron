package neutron.Logic.Model;

import java.security.InvalidParameterException;
import neutron.Logic.Interfaces.BorderElementType;
import neutron.Logic.Interfaces.IAlgorithm;
import neutron.Logic.Interfaces.IPlayer;
import neutron.Logic.Interfaces.PlayerNumber;

/**
 * @author Marcin
 */
public class Player implements IPlayer {

    private PlayerNumber playerNumber;
    private BorderElementType playerColor;
    private IAlgorithm algorithm;
    
    public Player(PlayerNumber playerNumber, BorderElementType playerColor, IAlgorithm algorithm) {
        
        if(playerColor != BorderElementType.Black &&
                playerColor != BorderElementType.White) {
            throw new InvalidParameterException();
        }
        
        this.playerNumber = playerNumber;
        this.playerColor = playerColor;
        this.algorithm = algorithm;
    }
    
    @Override
    public PlayerNumber getPlayerNumber() {
        return playerNumber;
    }

    @Override
    public BorderElementType getPawnsColor() {
        return playerColor;
    }

    @Override
    public IAlgorithm getAlgorithm() {
        return algorithm;
    }
}
