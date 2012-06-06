package neutron.Logic.Model.Heuristics;

import neutron.Logic.Interfaces.*;
import neutron.Utils.Position;


/**
 * @author Marcin
 */
public class Heuristic3 implements IHeuristics {

    @Override
    public double heuristicsValue(IGameState gameState, BorderElementType playmaker) {
    
       //-neutron u przeciwnika
       int y = gameState.getGameBorder().getNeutronPosition().getX();
       if(y == ((playmaker == BorderElementType.Black) ?  0 : 4))
           return 0;
       if(y == ((playmaker == BorderElementType.Black) ? 4 : 0))
            return 100;     
                      
       //w kazdym innym przypadku
       return 50;
    }
    
}
