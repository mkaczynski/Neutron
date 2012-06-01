package neutron.GUI;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import neutron.Logic.Interfaces.BorderElementType;
import neutron.Logic.Interfaces.IGameBorder;

/**
 * @author Marcin
 */
public class BorderDrawer {

    private JLabel[][] images;
    private JProgressBar progressBar;
    
    public BorderDrawer(JLabel[][] images, JProgressBar progressBar) {
        this.images = images;
        this.progressBar = progressBar;
    
        progressBar.setMinimum(0);
        progressBar.setMaximum(100);
    }
    
    public void setProgress(int value) {
        progressBar.setValue(value);
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
