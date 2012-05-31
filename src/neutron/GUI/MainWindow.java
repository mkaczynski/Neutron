package neutron.GUI;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import neutron.Logic.Interfaces.BorderElementType;
import neutron.Logic.Model.GameBorder;

/**
 *
 * @author Marcin
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        howMuchTime = new javax.swing.JTextField();
        setT = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        errorLab = new javax.swing.JLabel();
        errorLab.setVisible(false);
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        images = new JLabel[5][5];
        JLabel jlab;
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Neutron");
        setMaximumSize(new java.awt.Dimension(1647, 1647));
        setName("mainWindow");
        setPreferredSize(new java.awt.Dimension(600, 500));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Panel parametrów"));
        jPanel2.setMaximumSize(new java.awt.Dimension(150, 32767));
        jPanel2.setMinimumSize(new java.awt.Dimension(150, 100));
        jPanel2.setPreferredSize(new java.awt.Dimension(150, 311));

        jLabel1.setText("Podaj czas na działanie algorytmu: ");

        setT.setText("Ustaw");
        setT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setTActionPerformed(evt);
            }
        });

        jLabel2.setText("sekund");

        errorLab.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        errorLab.setText("Podaj poprawnę dane!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jLabel1))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(howMuchTime, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(setT))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(errorLab)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(howMuchTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(setT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(errorLab)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Panel gry"));

        for(int i=0;i<5;i++)
        for(int j=0;j<5;j++){
            jlab = new JLabel();
            if(i==0)
            jlab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neutron/GUI/player.png")));
            else if(i==2&&j==2)
            jlab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neutron/GUI/neutron.png")));
            else if(i==4)
            jlab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neutron/GUI/enemy.png")));
            else
            jlab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neutron/GUI/blank.png")));
            images[i][j]=jlab;
            jPanel4.add(jlab);
        }
        jPanel4.setLayout(new java.awt.GridLayout(5, 5));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Panel informacji"));
        jPanel3.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel3.setOpaque(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 89, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setTActionPerformed
        if(!howMuchTime.getText().equals("")){
            errorLab.setVisible(false);
            if(howMuchTime.getText().matches("\\d+")){               
                secForAlgorithm = Integer.parseInt(this.howMuchTime.getText());
                howMuchTime.setText("");
            }
            else{
                errorLab.setVisible(true);
                howMuchTime.setText("");
            }
        }
    }//GEN-LAST:event_setTActionPerformed

    /*
    * Create and display the form
    */
    public void showWindow(){
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MainWindow().setVisible(true);
                
            }
        });
    }
    
    /*
     * Get display from the game border
     */
    public void borderToDisplay(neutron.Logic.Model.GameBorder gb){
        for(int i=0;i<5;i++)
            for(int j=0;j<5;j++){
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
    
    public GameBorder displayToBorder(){
        BorderElementType[][] bet = new BorderElementType[5][5];
        for(int i=0;i<5;i++)
            for(int j=0;j<5;j++){
                if(images[i][j].getIcon().equals(new ImageIcon(getClass().getResource("/neutron/GUI/player.png"))))
                    bet[i][j] = BorderElementType.White;
                if(images[i][j].getIcon().equals(new ImageIcon(getClass().getResource("/neutron/GUI/enemy.png"))))
                    bet[i][j] = BorderElementType.Black;
                if(images[i][j].getIcon().equals(new ImageIcon(getClass().getResource("/neutron/GUI/neutron.png"))))
                    bet[i][j] = BorderElementType.Neutron;
                if(images[i][j].getIcon().equals(new ImageIcon(getClass().getResource("/neutron/GUI/blank.png"))))
                    bet[i][j] = BorderElementType.Blank;
            }
        GameBorder ret = new GameBorder(bet);
        return ret;
    }
    
    int secForAlgorithm = 0;
    JLabel[][] images;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel errorLab;
    private javax.swing.JTextField howMuchTime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton setT;
    // End of variables declaration//GEN-END:variables
}
