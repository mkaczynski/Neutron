
package neutron.GUI;

import neutron.Logic.Exceptions.GameStateException;
import neutron.Logic.Exceptions.PlayerWinException;
import neutron.Logic.Interfaces.*;
import neutron.Logic.Model.*;
import neutron.Logic.Model.Heuristics.SimpleHeuristic;

/**
 * Glowna klasa,tutaj bedzie uruchamiana gra itd.
 * @author Marcin
 */
public class Neutron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StartWindow.showWindow();
        
    }
}
