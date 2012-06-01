package neutron.GUI;

import neutron.Logic.Interfaces.IAlgorithm;

/**
 * @author Marcin
 */
public class GUIAlgorithm {
    
    private String name;
    private IAlgorithm algorithm;
    
    public GUIAlgorithm(IAlgorithm algorithm, String name) {
        this.algorithm = algorithm;
        this.name = name;
    }
    
    public IAlgorithm getAlgorithm() {
        return algorithm;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
