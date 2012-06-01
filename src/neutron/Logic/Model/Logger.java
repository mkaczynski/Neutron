package neutron.Logic.Model;

import neutron.GUI.MainWindow;
import neutron.Logic.Interfaces.ILogger;

/**
 * @author Marcin
 */
public class Logger implements ILogger {
   
    @Override
    public void writeMessage(String message) {
        MainWindow.showLog(message);
        System.out.println(message);       
    }
    
}
