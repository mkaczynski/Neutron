package neutron.GUI;

import neutron.Logic.Exceptions.GameStateException;
import neutron.Logic.Exceptions.PlayerWinException;
import neutron.Logic.Interfaces.*;
import neutron.Logic.Model.GameBorderGenerator;
import neutron.Logic.Model.GameMaster;
import neutron.Logic.Model.GameState;
import neutron.Logic.Model.Player;

/**
 * @author Marcin
 */
public class GameRunner implements Runnable {
 
    private IAlgorithm firstPlayer;
    private IAlgorithm secondPlayer;
    private BorderDrawer drawer;
    
    public GameRunner(IAlgorithm firstPlayer, IAlgorithm secondPlayer, BorderDrawer drawer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
        this.drawer = drawer;
    }

    @Override
    public void run() {
        startGame();
    }
    
    private void startGame(){
        
        //obydwaj gracze graja alfa - beta
        IPlayer p1 = new Player(PlayerNumber.Player1, BorderElementType.White, firstPlayer);
        IPlayer p2 = new Player(PlayerNumber.Player2, BorderElementType.Black, secondPlayer);
        
        IGameBorderGenerator gbg = new GameBorderGenerator();
        IGameBorder gameBorder = gbg.generateNewGame(5);
        
        IGameState gameState = new GameState(gameBorder, p1, p2);
        
        IGameMaster instance = new GameMaster();
    
        instance.initializeGame(gameState);
        gameState.getGameBorder().write();
        
        IGameBorder gb = gameState.getGameBorder();
        drawer.displayGameBorder(gb);
        
        while(true) {
            try {

                gameState = instance.makeMove(gameState);
                drawer.displayGameBorder(gameState.getGameBorder());
                
            } catch (GameStateException ex) {
                //@todo komunikat konca gry
                break;
            } catch (PlayerWinException ex) {
                //@todo komunikat konca gry
                break;
            }
        }
    }
}
