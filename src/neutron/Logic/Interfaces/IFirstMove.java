package neutron.Logic.Interfaces;

/**
 * @author Marcin
 */
public interface IFirstMove {

    IPlayer getFirstPlayer(IAlgorithm algorithm);
    IPlayer getSecondPlayer(IAlgorithm algorithm);        
    IMove getFirstMove();
    IGameBorder executeFirstMove(IGameBorder gameBorder);
}
