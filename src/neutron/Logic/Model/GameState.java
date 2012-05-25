package neutron.Logic.Model;

import java.security.InvalidParameterException;
import neutron.Logic.Interfaces.IGameBorder;
import neutron.Logic.Interfaces.IGameState;
import neutron.Logic.Interfaces.IPlayer;

/**
 * @author Marcin
 */
public class GameState implements IGameState {

    private IGameBorder gameBorder;
    private IPlayer actualPlayer;
    private IPlayer nextPlayer;
    
    public GameState(IGameBorder gameBorder, IPlayer actualPlayer, IPlayer nextPlayer) {
        
        if(actualPlayer.getPlayerNumber() == nextPlayer.getPlayerNumber() ||
                actualPlayer.getPawnsColor() == nextPlayer.getPawnsColor()) {
            throw new InvalidParameterException();
        }
        
        this.gameBorder = gameBorder;
        this.actualPlayer = actualPlayer;
        this.nextPlayer = nextPlayer;
    }
    
    @Override
    public IGameBorder getGameBorder() {
        return gameBorder;
    }

    @Override
    public IPlayer getActualPlayer() {
        return actualPlayer;
    }    
    
    @Override
    public IPlayer getNextPlayer() {
        return nextPlayer;
    }

    @Override
    public void changePlayers() {
        IPlayer tmp = actualPlayer;
        actualPlayer = nextPlayer;
        nextPlayer = tmp;
    }

    @Override
    public void setBorder(IGameBorder gameBorder) {
        this.gameBorder = gameBorder;
    }

}
