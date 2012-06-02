package neutron.GUI;

import java.util.Timer;
import java.util.TimerTask;
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
    private Timer timer; 
    private IResetGame reset;
    private IFirstMove move;
    
    private int counter;
    private int time;
    
    public GameRunner(IAlgorithm firstPlayer, IAlgorithm secondPlayer, 
            int time, IFirstMove move, BorderDrawer drawer, IResetGame reset) {
        
        this.move = move;
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
        this.drawer = drawer;
        this.time = time;
        this.reset = reset;
        
        timer = new Timer();
    }

    private class ProgressSetter extends TimerTask {
        
        public ProgressSetter() {
            counter = 0;
        }
        
        @Override
        public void run() {
            ++counter;
            drawer.setProgress((int)((double)counter / time * 100));
        }    
    }
    
    @Override
    public void run() {
        startGame();
    }
        
    private void startGame(){
        
        //IPlayer p1 = new Player(PlayerNumber.Player1, BorderElementType.White, firstPlayer);
        //IPlayer p2 = new Player(PlayerNumber.Player2, BorderElementType.Black, secondPlayer);
        
        IPlayer p1 = move.getFirstPlayer(firstPlayer);
        IPlayer p2 = move.getSecondPlayer(secondPlayer);
        
        IGameBorderGenerator gbg = new GameBorderGenerator();
        IGameBorder gameBorder = gbg.generateNewGame(5);
        
        IGameState gameState = new GameState(gameBorder, p1, p2);
        IGameMaster instance = new GameMaster();
    
        instance.initializeGame(gameState, move);
        gameState.getGameBorder().write();
        
        IGameBorder gb = gameState.getGameBorder();
        drawer.displayGameBorder(gb);
        timer.schedule(new ProgressSetter(), 0, 1000);
                
        while(true) {
            try {

                gameState = instance.makeMove(gameState, time);
                drawer.displayGameBorder(gameState.getGameBorder());
                counter = 0;
                
            } catch (GameStateException ex) {
                reset.reset();
                break;
            } catch (PlayerWinException ex) {
                
                drawer.displayGameBorder(ex.getGameState().getGameBorder());
                reset.reset();
                break;
            }
        }
        
        counter = 0;
        timer.cancel();
    }
}
