package neutron.Logic.Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import neutron.Logic.Exceptions.GameStateException;
import neutron.Logic.Interfaces.*;

/**
 * @author Marcin
 */
public class Algorithm implements IAlgorithm {

    private IHeuristics heuristics;
    private IGameStateGenerator gameStateGenerator;
    private ILogger logger;
    
    public Algorithm(IHeuristics heuristics, IGameStateGenerator gameStateGenerator, ILogger logger) {
        this.heuristics = heuristics;
        this.gameStateGenerator = gameStateGenerator;
        this.logger = logger;
    }
    
    @Override
    public IGameState makeMove(IGameState gameState) throws GameStateException {
        
        logger.writeMessage("Obliczenie ruchu dla stanu gry:");
        logger.writeMessage(gameState.toString());

        // pierwsza iteracja jest tym samym co posortowanie 
        // wygenerowanych ruchow wg heurystyki
        List<IGameState> moves = gameStateGenerator.getNexts(gameState);
        if(moves == null || moves.isEmpty()) {
            String msg = "Nie można wykonać kolejnych ruchów.";
            throw new GameStateException(msg);
        }        
        List<GameStateEvaluation> em = ToGameStateEvaluations(moves);
        IGameState bestState = em.get(0).getGameState();
        
        for(int i = 0; i < 2; ++i) { //iteracyjne poglebianie na stala glebokosc
            Collections.sort(em, new GameStateEvaluationComparator());
            bestState = alfabeta(gameState, em, 2 + i); 
        }
        
        return bestState;
    }
    
    private IGameState alfabeta(IGameState gameState, List<GameStateEvaluation> moves, int depth) throws GameStateException {        
                
        double alpha = moves.get(0).getEvaluation(); //Double.MIN_VALUE;
        IGameState bestState = null;
        
        for(GameStateEvaluation gs : moves) {
            
            double val = Math.max(alpha, alfabeta(gs.getGameState(), 0, 
                depth - 1, alpha, Double.MAX_VALUE));

            gs.setEvaluation(val);
            
            if(val >= alpha) {                
                bestState = gs.getGameState();
                alpha = val;
            }
        }

        logger.writeMessage("Najlepszy znaleziony ruch dla gracza to:");
        logger.writeMessage(bestState.toString()); // null argument exception nie ma prawa sie wydarzyc

        return bestState;
    }
    
    private List<GameStateEvaluation> ToGameStateEvaluations(List<IGameState> list) {
        
        List<GameStateEvaluation> result = new ArrayList<GameStateEvaluation>();
        for(IGameState gs : list) {
            double e = heuristics.heuristicsValue(gs);
            GameStateEvaluation gse = new GameStateEvaluation(gs, e);
            result.add(gse);
        }
        return result;
    }
    
    private double alfabeta(IGameState gameState, int player, int depth, double alpha, double beta) {

        if(depth == 0) {
            logger.writeMessage("Osiągnięto maksymalną głębokość przeszukiwania.");
            return heuristics.heuristicsValue(gameState);
        }
        
        List<IGameState> moves = gameStateGenerator.getNexts(gameState);
        if(moves == null || moves.isEmpty()) {
            logger.writeMessage("Nie ma więcej ruchów do przeglądania.");
            return heuristics.heuristicsValue(gameState);
        }

        if(player % 2 == 1) {
            logger.writeMessage("Ruch przeciwnika.");
            for(IGameState gs : moves) {
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
