package neutron.GUI;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import neutron.Logic.Interfaces.BorderElementType;
import neutron.Logic.Interfaces.IGameBorder;

/**
 * @author Marcin
 */
public class BorderDrawer {

    private JLabel[][] images;
    
    public BorderDrawer(JLabel[][] images) {
        this.images = images;
    }
    
    /*
     * Get display from the game border
     */
    public void displayGameBorder(IGameBorder gb){
        for(int i=0; i < images.length; i++)
            for(int j=0; j < images[i].length; j++){
                if(gb.getElement(i, j).equals(BorderElementType.White))
                    images[i][j].setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/player.png")));
                if(gb.getElement(i, j).equals(BorderElementType.Black))
                    images[i][j].setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/enemy.png")));
                if(gb.getElement(i, j).equals(BorderElementType.Neutron))
                    images[i][j].setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/neutron.png")));
                if(gb.getElement(i, j).equals(BorderElementType.Blank))
                    images[i][j].setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/blank.png")));      
            }
     }
}
