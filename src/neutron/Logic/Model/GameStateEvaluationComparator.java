package neutron.Logic.Model;

import java.util.Comparator;

/**
 * @author Marcin
 */
public class GameStateEvaluationComparator implements Comparator<GameStateEvaluation> {

    @Override
    public int compare(GameStateEvaluation o1, GameStateEvaluation o2) {
        return Double.compare(o1.getEvaluation(), o2.getEvaluation()) * -1;
    }
}
