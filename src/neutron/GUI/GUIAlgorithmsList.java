package neutron.GUI;

import java.util.ArrayList;
import java.util.List;
import neutron.Logic.Model.Algorithm;
import neutron.Logic.Model.FakeLogger;
import neutron.Logic.Model.GameStateGenerator;
import neutron.Logic.Model.Heuristics.Heuristic;
import neutron.Logic.Model.Heuristics.Heuristic2;
import neutron.Logic.Model.Heuristics.SimpleHeuristic;

/**
 * @author Marcin
 */
public class GUIAlgorithmsList {

    private List<GUIAlgorithm> list;
    
    public GUIAlgorithmsList() {
        this.list = new ArrayList<GUIAlgorithm>();
        RegisterAlgorithms(); //normalnie to bylo by w jakims bootstraperze
    }
    
    public List<GUIAlgorithm> getList() {
        return list;
    }
    
    private void RegisterAlgorithms() {
        
        // tutaj dodac kolejne implementacje za pomoca ktorych moze byc prowadzona rozgrywaka
        
        list.add(new GUIAlgorithm(
                new Algorithm(new SimpleHeuristic(), new GameStateGenerator(), new FakeLogger()), 
                "Prosta heurystyka"));
        
                list.add(new GUIAlgorithm(
                new Algorithm(new Heuristic(), new GameStateGenerator(), new FakeLogger()), 
                "H1"));
                
                list.add(new GUIAlgorithm(
                new Algorithm(new Heuristic2(), new GameStateGenerator(), new FakeLogger()), 
                "H2"));
        
    }
}
