package neutron.Logic.Interfaces;

/**
 * In general IGameState describes specific state of the game.
 * @author Marcin
 */
public interface IGameState {
    IGameBorder getGameBorder();
    void setBorder(IGameBorder gameBorder);
    
    IPlayer getActualPlayer();
    IPlayer getNextPlayer();
    void changePlayers();
}
