package neutron.Logic.Model;

import neutron.Logic.Interfaces.ILogger;

/**
 * @author Marcin
 */
public class FakeLogger implements ILogger {

    @Override
    public void writeMessage(String message) {
        // nic z tym nie robic
    }
    
}
