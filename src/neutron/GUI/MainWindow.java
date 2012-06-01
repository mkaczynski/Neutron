package neutron.GUI;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import neutron.Logic.Interfaces.*;
import neutron.Logic.Model.GameBorder;

/**
 *
 * @author Marcin
 */
public class MainWindow extends javax.swing.JFrame {
    
    /**
     * Creates new form MainWindow
     */
    public MainWindow(){
        initComponents();
        
        howMuchTime.setText("30");
        GUIAlgorithmsList algorithms = new GUIAlgorithmsList();
        for(GUIAlgorithm a: algorithms.getList()) {
            firstPlayerAlgorithms.addItem(a);
            secondPlayerAlgorithms.addItem(a);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        howMuchTime = new javax.swing.JTextField();
        errorLab = new javax.swing.JLabel();
        errorLab.setVisible(false);
        startButton = new javax.swing.JButton();
        firstPlayerAlgorithms = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        secondPlayerAlgorithms = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        images = new JLabel[5][5];
        JLabel jlab;

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Neutron");
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1647, 1647));
        setName("mainWindow");
        setPreferredSize(new java.awt.Dimension(560, 340));
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Panel parametrów"));
        jPanel2.setMaximumSize(new java.awt.Dimension(150, 32767));
        jPanel2.setMinimumSize(new java.awt.Dimension(150, 100));
        jPanel2.setPreferredSize(new java.awt.Dimension(150, 311));

        jLabel1.setText("Czas trwania rundy (s):");

        errorLab.setFont(new java.awt.Font("Ubuntu", 1, 10)); // NOI18N
        errorLab.setForeground(new java.awt.Color(255, 0, 0));
        errorLab.setText("Czas musi być dodatnią liczbą natualną.");

        startButton.setText("Start");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Gracz pierwszy:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Gracz drugi:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(startButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstPlayerAlgorithms, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(howMuchTime))
                            .addComponent(secondPlayerAlgorithms, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(errorLab)
                        .addGap(0, 39, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(howMuchTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(errorLab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(firstPlayerAlgorithms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(secondPlayerAlgorithms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(startButton)
                .addContainerGap())
        );

        errorLab.getAccessibleContext().setAccessibleName("Czas musi być dodatnią liczbą naturalną.");

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
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed

        int value = 0;
        boolean ok = true;
        try {
            value = Integer.parseInt(howMuchTime.getText());
            if(value <= 0) {
                ok = false;
            }
        }
        catch(NumberFormatException ex) {
            ok = false;
        }
        
        errorLab.setVisible(!ok);
        if(ok == false) {
            return;
        }
        
        GUIAlgorithm fp = (GUIAlgorithm)firstPlayerAlgorithms.getSelectedItem();
        GUIAlgorithm sp = (GUIAlgorithm)secondPlayerAlgorithms.getSelectedItem();
        BorderDrawer drawer = new BorderDrawer(images);
        
        GameRunner gr = new GameRunner(fp.getAlgorithm(), sp.getAlgorithm(), drawer);
        Thread t = new Thread(gr);
        t.start();
        startButton.setEnabled(false);
    }//GEN-LAST:event_startButtonActionPerformed
    
    private boolean TryParseTime(int value)
    {
        try {
            value = Integer.parseInt(howMuchTime.getText());
            if(value < 0) {
                return false;
            }
        }
        catch(NumberFormatException ex)
        {
            return false;
        }
        
        return false;
    }
    
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
        
    //@todo - jezeli bedziesz chcial z tego skorzystac (pewnie przy trybir gry recznej)
    //to najpierw przenies metode do oddzielnej klasy, kod bedzie solidniejszy
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
    
    IHeuristics heuristics;
    IGameStateGenerator gsg;
    ILogger logger;
    IAlgorithm algorithm;
                
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel errorLab;
    private javax.swing.JComboBox firstPlayerAlgorithms;
    private javax.swing.JTextField howMuchTime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JComboBox secondPlayerAlgorithms;
    private javax.swing.JButton startButton;
    // End of variables declaration//GEN-END:variables
}


