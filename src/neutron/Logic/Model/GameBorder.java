package neutron.Logic.Model;

import neutron.Logic.Interfaces.BorderElementType;
import neutron.Logic.Interfaces.IGameBorder;
import neutron.Utils.Position;

/**
 * @author Marcin
 */
public class GameBorder implements IGameBorder {
    
    private BorderElementType[][] border;
    
    public GameBorder(BorderElementType[][] border){
        this.border = border;
    }

    @Override
    public BorderElementType[][] getBorder() {
        return border;
    }

    @Override
    public Position getNeutronPosition() {
        
        for(int i = 0; i < border.length; ++i) {
            for(int j = 0; j < border.length; ++j) {
                if(border[i][j] == BorderElementType.Neutron) {
                    return new Position(i, j);
                }
            }
        }
        
        throw new IllegalStateException();
    }

    @Override
    public int getBorderSize() {
        return border.length;
    }

    @Override
    public BorderElementType getElement(int i, int j) {
        return border[i][j];
    }

    @Override
    public BorderElementType[][] copyBorder() {
    
        BorderElementType[][] b = new BorderElementType[border.length][border.length];
        
        for(int i = 0; i < border.length; ++i) {
            for(int j = 0; j < border.length; ++j) {
                b[i][j] = border[i][j];
            }
        }
        
        return b;
    }

    @Override
    public void write() {
        for(int i = 0; i < border.length; ++i) {
            for(int j = 0; j < border.length; ++j) {
                System.out.printf("%s ", border[i][j]);
            }
            System.out.println();
        }
    }
}
