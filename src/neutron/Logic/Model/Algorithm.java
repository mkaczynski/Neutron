package neutron.Logic.Model;

import java.util.*;
import java.util.concurrent.TimeoutException;
import neutron.Logic.Exceptions.GameStateException;
import neutron.Logic.Interfaces.*;

/**
 * @author Marcin
 */
public class Algorithm implements IAlgorithm {

    private IHeuristics heuristics;
    private IGameStateGenerator gameStateGenerator;
    private ILogger logger;
    private Timer timer;
    private boolean canExecute;
    
    public Algorithm(IHeuristics heuristics, IGameStateGenerator gameStateGenerator, ILogger logger) {
        this.heuristics = heuristics;
        this.gameStateGenerator = gameStateGenerator;
        this.logger = logger;
        
        timer = new Timer();
    }
    
    private class StopCalculation extends TimerTask {
        @Override
        public void run() {
            canExecute = false;
        }
    }
    
    @Override
    public IGameState makeMove(IGameState gameState, int time) throws GameStateException {
        
        canExecute = true;
        timer.schedule(new StopCalculation(), time * 1000);
        
        logger.writeMessage("Obliczenie ruchu dla stanu gry:");
        logger.writeMessage(gameState.toString());

        // pierwsza iteracja jest tym samym co posortowanie 
        // wygenerowanych ruchow wg heurystyki
        List<IGameState> moves = gameStateGenerator.getNexts(gameState);
                
        if(moves == null || moves.isEmpty()) {
            String msg = "Nie można wykonać kolejnych ruchów.";
            throw new GameStateException(msg, gameState);
        }
        
        List<GameStateEvaluation> em = ToGameStateEvaluations(moves);
        GameStateEvaluation bestState = null;// = em.get(0);

        int i = -1;
        while(true) { 
            
            if(!canExecute) {
                break;
            }
            
            Collections.sort(em, new GameStateEvaluationComparator());
            try {
                bestState = alfabeta(em, i += 2);                 

                System.out.print("\nWybrano best state na poziomie ");
                System.out.print(i);
                System.out.print(" ");
                System.out.println(bestState.getEvaluation());
            
                bestState.getGameState().getGameBorder().write();
            }
            catch(TimeoutException ex) {
                break;
            }            
        }
        
        return bestState.getGameState();
    }
    
    private GameStateEvaluation alfabeta(List<GameStateEvaluation> moves, int depth) 
            throws GameStateException, TimeoutException {        
                
        double alpha = Double.MIN_VALUE*-1; //moves.get(0).getEvaluation(); //Double.MIN_VALUE;
        GameStateEvaluation bestState = null;//moves.get(0);
        
        for(GameStateEvaluation gs : moves) {
                 
            double val = /*Math.max(alpha,*/ alfabeta(gs.getGameState(), 1, 
                depth - 1, Double.MIN_VALUE*-1, Double.MAX_VALUE);//); //@todo - czy to jest dobrze?

            gs.setEvaluation(val);
            
            if(val > alpha) {                
                bestState = gs;
                alpha = val;
            }
        }

        logger.writeMessage("Najlepszy znaleziony ruch dla gracza to:");
        logger.writeMessage(bestState.toString()); // null argument exception nie ma prawa sie wydarzyc

        //for(GameStateEvaluation gs : moves) {
        //    System.out.print(gs.getEvaluation());
        //    System.out.print(" ");
        //}
        
        return bestState;
    }
    
    private List<GameStateEvaluation> ToGameStateEvaluations(List<IGameState> list) {
        
        List<GameStateEvaluation> result = new ArrayList<GameStateEvaluation>();
        for(IGameState gs : list) {
            gs.changePlayers();
            double e = heuristics.heuristicsValue(gs);
            gs.changePlayers();
            GameStateEvaluation gse = new GameStateEvaluation(gs, e);
            result.add(gse);
        }
        return result;
    }
    
    private double alfabeta(IGameState gameState, int player, int depth, double alpha, double beta) 
            throws TimeoutException {

        if(!canExecute) {
            throw new TimeoutException();
        }
        
        if(depth == 0) {
            logger.writeMessage("Osiągnięto maksymalną głębokość przeszukiwania.");
            gameState.changePlayers();
            double d = heuristics.heuristicsValue(gameState);
            gameState.changePlayers();
            return d;
        }
        
        if(gameState.isNeutronOnBaseField()) {
            logger.writeMessage("Gra jest skonczona - neutron znajduje sie w jednym z pol bazowych.");
            gameState.changePlayers();
            double d = heuristics.heuristicsValue(gameState);
            gameState.changePlayers();
            return d;
        }
        
        List<IGameState> moves = gameStateGenerator.getNexts(gameState);
        if(moves == null || moves.isEmpty()) {
            logger.writeMessage("Nie ma więcej ruchów do przeglądania.");
            gameState.changePlayers();
            double d = heuristics.heuristicsValue(gameState);
            gameState.changePlayers();
            return d;
        }

        if(player % 2 == 1) {
            logger.writeMessage("Ruch przeciwnika.");
            for(IGameState gs : moves) {
                
                //gs.getGameBorder().write();
                
                beta = Math.min(beta, alfabeta(gs, (player + 1) % 2, depth - 1, alpha, beta));
                if(alpha >= beta)
                {
                    logger.writeMessage("Alfa-obcięcie.");
                    return alpha;
                }
            }
            return beta;
        }
        else {
            logger.writeMessage("Ruch aktualnego gracza.");
            for(IGameState gs : moves) {
                alpha = Math.max(alpha, alfabeta(gs, (player + 1) % 2, depth - 1, alpha, beta));
                if(alpha >= beta)
                {
                    logger.writeMessage("Beta-obcięcie.");
                    return beta;
                }
            }
            return alpha;
        }
    }
}
