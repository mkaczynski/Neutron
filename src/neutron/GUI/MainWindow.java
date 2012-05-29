package neutron.GUI;

import java.util.regex.Pattern;
import javax.swing.ImageIcon;
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
        pos00 = new javax.swing.JLabel();
        pos10 = new javax.swing.JLabel();
        pos20 = new javax.swing.JLabel();
        pos30 = new javax.swing.JLabel();
        pos40 = new javax.swing.JLabel();
        pos31 = new javax.swing.JLabel();
        pos41 = new javax.swing.JLabel();
        pos11 = new javax.swing.JLabel();
        pos21 = new javax.swing.JLabel();
        pos01 = new javax.swing.JLabel();
        pos32 = new javax.swing.JLabel();
        pos42 = new javax.swing.JLabel();
        pos12 = new javax.swing.JLabel();
        pos22 = new javax.swing.JLabel();
        pos02 = new javax.swing.JLabel();
        pos33 = new javax.swing.JLabel();
        pos43 = new javax.swing.JLabel();
        pos13 = new javax.swing.JLabel();
        pos23 = new javax.swing.JLabel();
        pos03 = new javax.swing.JLabel();
        pos34 = new javax.swing.JLabel();
        pos44 = new javax.swing.JLabel();
        pos14 = new javax.swing.JLabel();
        pos24 = new javax.swing.JLabel();
        pos04 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Neutron");
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
                .addGap(0, 2, Short.MAX_VALUE)
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
                .addContainerGap(447, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Panel gry"));

        pos00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neutron/GUI/player.png"))); // NOI18N

        pos10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neutron/GUI/player.png"))); // NOI18N

        pos20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neutron/GUI/player.png"))); // NOI18N

        pos30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neutron/GUI/player.png"))); // NOI18N

        pos40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neutron/GUI/player.png"))); // NOI18N

        pos31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neutron/GUI/blank.png"))); // NOI18N

        pos41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neutron/GUI/blank.png"))); // NOI18N

        pos11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neutron/GUI/blank.png"))); // NOI18N

        pos21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neutron/GUI/blank.png"))); // NOI18N

        pos01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neutron/GUI/blank.png"))); // NOI18N

        pos32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neutron/GUI/blank.png"))); // NOI18N

        pos42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neutron/GUI/blank.png"))); // NOI18N

        pos12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neutron/GUI/blank.png"))); // NOI18N

        pos22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neutron/GUI/neutron.png"))); // NOI18N

        pos02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neutron/GUI/blank.png"))); // NOI18N

        pos33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neutron/GUI/blank.png"))); // NOI18N

        pos43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neutron/GUI/blank.png"))); // NOI18N

        pos13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neutron/GUI/blank.png"))); // NOI18N

        pos23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neutron/GUI/blank.png"))); // NOI18N

        pos03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neutron/GUI/blank.png"))); // NOI18N

        pos34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neutron/GUI/enemy.png"))); // NOI18N

        pos44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neutron/GUI/enemy.png"))); // NOI18N

        pos14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neutron/GUI/enemy.png"))); // NOI18N

        pos24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neutron/GUI/enemy.png"))); // NOI18N

        pos04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neutron/GUI/enemy.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pos00)
                        .addGap(0, 0, 0)
                        .addComponent(pos10)
                        .addGap(0, 0, 0)
                        .addComponent(pos20)
                        .addGap(0, 0, 0)
                        .addComponent(pos30)
                        .addGap(0, 0, 0)
                        .addComponent(pos40))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pos01)
                        .addGap(0, 0, 0)
                        .addComponent(pos11)
                        .addGap(0, 0, 0)
                        .addComponent(pos21)
                        .addGap(0, 0, 0)
                        .addComponent(pos31)
                        .addGap(0, 0, 0)
                        .addComponent(pos41))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pos02)
                        .addGap(0, 0, 0)
                        .addComponent(pos12)
                        .addGap(0, 0, 0)
                        .addComponent(pos22)
                        .addGap(0, 0, 0)
                        .addComponent(pos32)
                        .addGap(0, 0, 0)
                        .addComponent(pos42))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pos03)
                        .addGap(0, 0, 0)
                        .addComponent(pos13)
                        .addGap(0, 0, 0)
                        .addComponent(pos23)
                        .addGap(0, 0, 0)
                        .addComponent(pos33)
                        .addGap(0, 0, 0)
                        .addComponent(pos43))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pos04)
                        .addGap(0, 0, 0)
                        .addComponent(pos14)
                        .addGap(0, 0, 0)
                        .addComponent(pos24)
                        .addGap(0, 0, 0)
                        .addComponent(pos34)
                        .addGap(0, 0, 0)
                        .addComponent(pos44)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pos30)
                    .addComponent(pos40)
                    .addComponent(pos00)
                    .addComponent(pos10)
                    .addComponent(pos20))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pos31)
                    .addComponent(pos41)
                    .addComponent(pos01)
                    .addComponent(pos11)
                    .addComponent(pos21))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pos32)
                    .addComponent(pos42)
                    .addComponent(pos02)
                    .addComponent(pos12)
                    .addComponent(pos22))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pos33)
                    .addComponent(pos43)
                    .addComponent(pos03)
                    .addComponent(pos13)
                    .addComponent(pos23))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pos34)
                    .addComponent(pos44)
                    .addComponent(pos04)
                    .addComponent(pos14)
                    .addComponent(pos24))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Panel informacji"));
        jPanel3.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel3.setOpaque(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 553, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 155, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        
        /*
         *  if Blank:
         */
        if(gb.getElement(0,0).equals(BorderElementType.Blank))
            pos00.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/blank.png")));
        if(gb.getElement(1,0).equals(BorderElementType.Blank))
            pos10.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/blank.png")));
        if(gb.getElement(2,0).equals(BorderElementType.Blank))
            pos20.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/blank.png")));
        if(gb.getElement(3,0).equals(BorderElementType.Blank))
            pos30.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/blank.png")));
        if(gb.getElement(4,0).equals(BorderElementType.Blank))
            pos40.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/blank.png")));
        if(gb.getElement(0,1).equals(BorderElementType.Blank))
            pos01.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/blank.png")));
        if(gb.getElement(1,1).equals(BorderElementType.Blank))
            pos11.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/blank.png")));
        if(gb.getElement(2,1).equals(BorderElementType.Blank))
            pos21.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/blank.png")));
        if(gb.getElement(3,1).equals(BorderElementType.Blank))
            pos31.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/blank.png")));
        if(gb.getElement(4,1).equals(BorderElementType.Blank))
            pos41.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/blank.png")));
        if(gb.getElement(0,2).equals(BorderElementType.Blank))
            pos02.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/blank.png")));
        if(gb.getElement(1,2).equals(BorderElementType.Blank))
            pos12.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/blank.png")));
        if(gb.getElement(2,2).equals(BorderElementType.Blank))
            pos22.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/blank.png")));
        if(gb.getElement(3,2).equals(BorderElementType.Blank))
            pos32.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/blank.png")));
        if(gb.getElement(4,2).equals(BorderElementType.Blank))
            pos42.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/blank.png")));
        if(gb.getElement(0,3).equals(BorderElementType.Blank))
            pos03.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/blank.png")));
        if(gb.getElement(1,3).equals(BorderElementType.Blank))
            pos13.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/blank.png")));
        if(gb.getElement(2,3).equals(BorderElementType.Blank))
            pos23.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/blank.png")));
        if(gb.getElement(3,3).equals(BorderElementType.Blank))
            pos33.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/blank.png")));
        if(gb.getElement(4,3).equals(BorderElementType.Blank))
            pos43.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/blank.png")));
        if(gb.getElement(0,4).equals(BorderElementType.Blank))
            pos04.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/blank.png")));
        if(gb.getElement(1,4).equals(BorderElementType.Blank))
            pos14.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/blank.png")));
        if(gb.getElement(2,4).equals(BorderElementType.Blank))
            pos24.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/blank.png")));
        if(gb.getElement(3,4).equals(BorderElementType.Blank))
            pos34.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/blank.png")));
        if(gb.getElement(4,4).equals(BorderElementType.Blank))
            pos44.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/blank.png")));
        
        
        /*
         *  if White:
         */
        if(gb.getElement(0,0).equals(BorderElementType.White))
            pos00.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/player.png")));
        if(gb.getElement(1,0).equals(BorderElementType.White))
            pos10.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/player.png")));
        if(gb.getElement(2,0).equals(BorderElementType.White))
            pos20.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/player.png")));
        if(gb.getElement(3,0).equals(BorderElementType.White))
            pos30.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/player.png")));
        if(gb.getElement(4,0).equals(BorderElementType.White))
            pos40.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/player.png")));
        if(gb.getElement(0,1).equals(BorderElementType.White))
            pos01.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/player.png")));
        if(gb.getElement(1,1).equals(BorderElementType.White))
            pos11.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/player.png")));
        if(gb.getElement(2,1).equals(BorderElementType.White))
            pos21.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/player.png")));
        if(gb.getElement(3,1).equals(BorderElementType.White))
            pos31.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/player.png")));
        if(gb.getElement(4,1).equals(BorderElementType.White))
            pos41.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/player.png")));
        if(gb.getElement(0,2).equals(BorderElementType.White))
            pos02.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/player.png")));
        if(gb.getElement(1,2).equals(BorderElementType.White))
            pos12.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/player.png")));
        if(gb.getElement(2,2).equals(BorderElementType.White))
            pos22.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/player.png")));
        if(gb.getElement(3,2).equals(BorderElementType.White))
            pos32.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/player.png")));
        if(gb.getElement(4,2).equals(BorderElementType.White))
            pos42.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/player.png")));
        if(gb.getElement(0,3).equals(BorderElementType.White))
            pos03.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/player.png")));
        if(gb.getElement(1,3).equals(BorderElementType.White))
            pos13.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/player.png")));
        if(gb.getElement(2,3).equals(BorderElementType.White))
            pos23.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/player.png")));
        if(gb.getElement(3,3).equals(BorderElementType.White))
            pos33.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/player.png")));
        if(gb.getElement(4,3).equals(BorderElementType.White))
            pos43.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/player.png")));
        if(gb.getElement(0,4).equals(BorderElementType.White))
            pos04.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/player.png")));
        if(gb.getElement(1,4).equals(BorderElementType.White))
            pos14.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/player.png")));
        if(gb.getElement(2,4).equals(BorderElementType.White))
            pos24.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/player.png")));
        if(gb.getElement(3,4).equals(BorderElementType.White))
            pos34.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/player.png")));
        if(gb.getElement(4,4).equals(BorderElementType.White))
            pos44.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/player.png")));
       

         /*
         *  if Black:
         */
        if(gb.getElement(0,0).equals(BorderElementType.Black))
            pos00.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/enemy.png")));
        if(gb.getElement(1,0).equals(BorderElementType.Black))
            pos10.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/enemy.png")));
        if(gb.getElement(2,0).equals(BorderElementType.Black))
            pos20.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/enemy.png")));
        if(gb.getElement(3,0).equals(BorderElementType.Black))
            pos30.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/enemy.png")));
        if(gb.getElement(4,0).equals(BorderElementType.Black))
            pos40.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/enemy.png")));
        if(gb.getElement(0,1).equals(BorderElementType.Black))
            pos01.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/enemy.png")));
        if(gb.getElement(1,1).equals(BorderElementType.Black))
            pos11.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/enemy.png")));
        if(gb.getElement(2,1).equals(BorderElementType.Black))
            pos21.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/enemy.png")));
        if(gb.getElement(3,1).equals(BorderElementType.Black))
            pos31.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/enemy.png")));
        if(gb.getElement(4,1).equals(BorderElementType.Black))
            pos41.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/enemy.png")));
        if(gb.getElement(0,2).equals(BorderElementType.Black))
            pos02.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/enemy.png")));
        if(gb.getElement(1,2).equals(BorderElementType.Black))
            pos12.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/enemy.png")));
        if(gb.getElement(2,2).equals(BorderElementType.Black))
            pos22.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/enemy.png")));
        if(gb.getElement(3,2).equals(BorderElementType.Black))
            pos32.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/enemy.png")));
        if(gb.getElement(4,2).equals(BorderElementType.Black))
            pos42.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/enemy.png")));
        if(gb.getElement(0,3).equals(BorderElementType.Black))
            pos03.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/enemy.png")));
        if(gb.getElement(1,3).equals(BorderElementType.Black))
            pos13.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/enemy.png")));
        if(gb.getElement(2,3).equals(BorderElementType.Black))
            pos23.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/enemy.png")));
        if(gb.getElement(3,3).equals(BorderElementType.Black))
            pos33.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/enemy.png")));
        if(gb.getElement(4,3).equals(BorderElementType.Black))
            pos43.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/enemy.png")));
        if(gb.getElement(0,4).equals(BorderElementType.Black))
            pos04.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/enemy.png")));
        if(gb.getElement(1,4).equals(BorderElementType.Black))
            pos14.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/enemy.png")));
        if(gb.getElement(2,4).equals(BorderElementType.Black))
            pos24.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/enemy.png")));
        if(gb.getElement(3,4).equals(BorderElementType.Black))
            pos34.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/enemy.png")));
        if(gb.getElement(4,4).equals(BorderElementType.Black))
            pos44.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/enemy.png")));
        
        
        /*
         *  if Neutron:
         */
        if(gb.getElement(0,0).equals(BorderElementType.Neutron))
            pos00.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/neutron.png")));
        if(gb.getElement(1,0).equals(BorderElementType.Neutron))
            pos10.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/neutron.png")));
        if(gb.getElement(2,0).equals(BorderElementType.Neutron))
            pos20.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/neutron.png")));
        if(gb.getElement(3,0).equals(BorderElementType.Neutron))
            pos30.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/neutron.png")));
        if(gb.getElement(4,0).equals(BorderElementType.Neutron))
            pos40.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/neutron.png")));
        if(gb.getElement(0,1).equals(BorderElementType.Neutron))
            pos01.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/neutron.png")));
        if(gb.getElement(1,1).equals(BorderElementType.Neutron))
            pos11.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/neutron.png")));
        if(gb.getElement(2,1).equals(BorderElementType.Neutron))
            pos21.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/neutron.png")));
        if(gb.getElement(3,1).equals(BorderElementType.Neutron))
            pos31.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/neutron.png")));
        if(gb.getElement(4,1).equals(BorderElementType.Neutron))
            pos41.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/neutron.png")));
        if(gb.getElement(0,2).equals(BorderElementType.Neutron))
            pos02.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/neutron.png")));
        if(gb.getElement(1,2).equals(BorderElementType.Neutron))
            pos12.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/neutron.png")));
        if(gb.getElement(2,2).equals(BorderElementType.Neutron))
            pos22.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/neutron.png")));
        if(gb.getElement(3,2).equals(BorderElementType.Neutron))
            pos32.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/neutron.png")));
        if(gb.getElement(4,2).equals(BorderElementType.Neutron))
            pos42.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/neutron.png")));
        if(gb.getElement(0,3).equals(BorderElementType.Neutron))
            pos03.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/neutron.png")));
        if(gb.getElement(1,3).equals(BorderElementType.Neutron))
            pos13.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/neutron.png")));
        if(gb.getElement(2,3).equals(BorderElementType.Neutron))
            pos23.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/neutron.png")));
        if(gb.getElement(3,3).equals(BorderElementType.Neutron))
            pos33.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/neutron.png")));
        if(gb.getElement(4,3).equals(BorderElementType.Neutron))
            pos43.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/neutron.png")));
        if(gb.getElement(0,4).equals(BorderElementType.Neutron))
            pos04.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/neutron.png")));
        if(gb.getElement(1,4).equals(BorderElementType.Neutron))
            pos14.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/neutron.png")));
        if(gb.getElement(2,4).equals(BorderElementType.Neutron))
            pos24.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/neutron.png")));
        if(gb.getElement(3,4).equals(BorderElementType.Neutron))
            pos34.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/neutron.png")));
        if(gb.getElement(4,4).equals(BorderElementType.Neutron))
            pos44.setIcon(new ImageIcon(getClass().getResource("/neutron/GUI/neutron.png")));           
    }
    
    public GameBorder displayToBorder(){
        BorderElementType[][] bet = new BorderElementType[5][5];
        
        /*
         * if neutron.png:
         */
        if(pos00.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/neutron.png")))
            bet[0][0]=BorderElementType.Neutron;
        if(pos10.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/neutron.png")))
            bet[1][0]=BorderElementType.Neutron;
        if(pos20.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/neutron.png")))
            bet[2][0]=BorderElementType.Neutron;
        if(pos30.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/neutron.png")))
            bet[3][0]=BorderElementType.Neutron;
        if(pos40.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/neutron.png")))
            bet[4][0]=BorderElementType.Neutron;
        if(pos01.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/neutron.png")))
            bet[0][1]=BorderElementType.Neutron;
        if(pos11.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/neutron.png")))
            bet[1][1]=BorderElementType.Neutron;
        if(pos21.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/neutron.png")))
            bet[2][1]=BorderElementType.Neutron;
        if(pos31.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/neutron.png")))
            bet[3][1]=BorderElementType.Neutron;
        if(pos41.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/neutron.png")))
            bet[4][1]=BorderElementType.Neutron;
        if(pos02.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/neutron.png")))
            bet[0][2]=BorderElementType.Neutron;
        if(pos12.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/neutron.png")))
            bet[1][2]=BorderElementType.Neutron;
        if(pos22.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/neutron.png")))
            bet[2][2]=BorderElementType.Neutron;
        if(pos32.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/neutron.png")))
            bet[3][2]=BorderElementType.Neutron;
        if(pos42.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/neutron.png")))
            bet[4][2]=BorderElementType.Neutron;
        if(pos03.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/neutron.png")))
            bet[0][3]=BorderElementType.Neutron;
        if(pos13.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/neutron.png")))
            bet[1][3]=BorderElementType.Neutron;
        if(pos23.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/neutron.png")))
            bet[2][3]=BorderElementType.Neutron;
        if(pos33.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/neutron.png")))
            bet[3][3]=BorderElementType.Neutron;
        if(pos43.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/neutron.png")))
            bet[4][3]=BorderElementType.Neutron;
        if(pos04.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/neutron.png")))
            bet[0][4]=BorderElementType.Neutron;
        if(pos14.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/neutron.png")))
            bet[1][4]=BorderElementType.Neutron;
        if(pos24.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/neutron.png")))
            bet[2][4]=BorderElementType.Neutron;
        if(pos34.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/neutron.png")))
            bet[3][4]=BorderElementType.Neutron;
        if(pos44.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/neutron.png")))
            bet[4][4]=BorderElementType.Neutron;
        
        
        /*
         * if blank.png:
         */
        if(pos00.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/blank.png")))
            bet[0][0]=BorderElementType.Blank;
        if(pos10.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/blank.png")))
            bet[1][0]=BorderElementType.Blank;
        if(pos20.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/blank.png")))
            bet[2][0]=BorderElementType.Blank;
        if(pos30.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/blank.png")))
            bet[3][0]=BorderElementType.Blank;
        if(pos40.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/blank.png")))
            bet[4][0]=BorderElementType.Blank;
        if(pos01.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/blank.png")))
            bet[0][1]=BorderElementType.Blank;
        if(pos11.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/blank.png")))
            bet[1][1]=BorderElementType.Blank;
        if(pos21.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/blank.png")))
            bet[2][1]=BorderElementType.Blank;
        if(pos31.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/blank.png")))
            bet[3][1]=BorderElementType.Blank;
        if(pos41.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/blank.png")))
            bet[4][1]=BorderElementType.Blank;
        if(pos02.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/blank.png")))
            bet[0][2]=BorderElementType.Blank;
        if(pos12.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/blank.png")))
            bet[1][2]=BorderElementType.Blank;
        if(pos22.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/blank.png")))
            bet[2][2]=BorderElementType.Blank;
        if(pos32.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/blank.png")))
            bet[3][2]=BorderElementType.Blank;
        if(pos42.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/blank.png")))
            bet[4][2]=BorderElementType.Blank;
        if(pos03.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/blank.png")))
            bet[0][3]=BorderElementType.Blank;
        if(pos13.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/blank.png")))
            bet[1][3]=BorderElementType.Blank;
        if(pos23.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/blank.png")))
            bet[2][3]=BorderElementType.Blank;
        if(pos33.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/blank.png")))
            bet[3][3]=BorderElementType.Blank;
        if(pos43.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/blank.png")))
            bet[4][3]=BorderElementType.Blank;
        if(pos04.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/blank.png")))
            bet[0][4]=BorderElementType.Blank;
        if(pos14.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/blank.png")))
            bet[1][4]=BorderElementType.Blank;
        if(pos24.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/blank.png")))
            bet[2][4]=BorderElementType.Blank;
        if(pos34.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/blank.png")))
            bet[3][4]=BorderElementType.Blank;
        if(pos44.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/blank.png")))
            bet[4][4]=BorderElementType.Blank;
        
        
        /*
         * if enemy.png:
         */
        if(pos00.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/enemy.png")))
            bet[0][0]=BorderElementType.Black;
        if(pos10.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/enemy.png")))
            bet[1][0]=BorderElementType.Black;
        if(pos20.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/enemy.png")))
            bet[2][0]=BorderElementType.Black;
        if(pos30.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/enemy.png")))
            bet[3][0]=BorderElementType.Black;
        if(pos40.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/enemy.png")))
            bet[4][0]=BorderElementType.Black;
        if(pos01.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/enemy.png")))
            bet[0][1]=BorderElementType.Black;
        if(pos11.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/enemy.png")))
            bet[1][1]=BorderElementType.Black;
        if(pos21.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/enemy.png")))
            bet[2][1]=BorderElementType.Black;
        if(pos31.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/enemy.png")))
            bet[3][1]=BorderElementType.Black;
        if(pos41.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/enemy.png")))
            bet[4][1]=BorderElementType.Black;
        if(pos02.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/enemy.png")))
            bet[0][2]=BorderElementType.Black;
        if(pos12.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/enemy.png")))
            bet[1][2]=BorderElementType.Black;
        if(pos22.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/enemy.png")))
            bet[2][2]=BorderElementType.Black;
        if(pos32.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/enemy.png")))
            bet[3][2]=BorderElementType.Black;
        if(pos42.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/enemy.png")))
            bet[4][2]=BorderElementType.Black;
        if(pos03.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/enemy.png")))
            bet[0][3]=BorderElementType.Black;
        if(pos13.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/enemy.png")))
            bet[1][3]=BorderElementType.Black;
        if(pos23.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/enemy.png")))
            bet[2][3]=BorderElementType.Black;
        if(pos33.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/enemy.png")))
            bet[3][3]=BorderElementType.Black;
        if(pos43.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/enemy.png")))
            bet[4][3]=BorderElementType.Black;
        if(pos04.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/enemy.png")))
            bet[0][4]=BorderElementType.Black;
        if(pos14.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/enemy.png")))
            bet[1][4]=BorderElementType.Black;
        if(pos24.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/enemy.png")))
            bet[2][4]=BorderElementType.Black;
        if(pos34.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/enemy.png")))
            bet[3][4]=BorderElementType.Black;
        if(pos44.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/enemy.png")))
            bet[4][4]=BorderElementType.Black;
        
        
        /*
         * if player.png:
         */
        if(pos00.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/player.png")))
            bet[0][0]=BorderElementType.White;
        if(pos10.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/player.png")))
            bet[1][0]=BorderElementType.White;
        if(pos20.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/player.png")))
            bet[2][0]=BorderElementType.White;
        if(pos30.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/player.png")))
            bet[3][0]=BorderElementType.White;
        if(pos40.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/player.png")))
            bet[4][0]=BorderElementType.White;
        if(pos01.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/player.png")))
            bet[0][1]=BorderElementType.White;
        if(pos11.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/player.png")))
            bet[1][1]=BorderElementType.White;
        if(pos21.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/player.png")))
            bet[2][1]=BorderElementType.White;
        if(pos31.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/player.png")))
            bet[3][1]=BorderElementType.White;
        if(pos41.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/player.png")))
            bet[4][1]=BorderElementType.White;
        if(pos02.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/player.png")))
            bet[0][2]=BorderElementType.White;
        if(pos12.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/player.png")))
            bet[1][2]=BorderElementType.White;
        if(pos22.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/player.png")))
            bet[2][2]=BorderElementType.White;
        if(pos32.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/player.png")))
            bet[3][2]=BorderElementType.White;
        if(pos42.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/player.png")))
            bet[4][2]=BorderElementType.White;
        if(pos03.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/player.png")))
            bet[0][3]=BorderElementType.White;
        if(pos13.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/player.png")))
            bet[1][3]=BorderElementType.White;
        if(pos23.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/player.png")))
            bet[2][3]=BorderElementType.White;
        if(pos33.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/player.png")))
            bet[3][3]=BorderElementType.White;
        if(pos43.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/player.png")))
            bet[4][3]=BorderElementType.White;
        if(pos04.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/player.png")))
            bet[0][4]=BorderElementType.White;
        if(pos14.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/player.png")))
            bet[1][4]=BorderElementType.White;
        if(pos24.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/player.png")))
            bet[2][4]=BorderElementType.White;
        if(pos34.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/player.png")))
            bet[3][4]=BorderElementType.White;
        if(pos44.getIcon() == new ImageIcon(getClass().getResource("/neutron/GUI/player.png")))
            bet[4][4]=BorderElementType.White;
        
        
        GameBorder ret = new GameBorder(bet);
        return ret;
    }
    
    int secForAlgorithm = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel errorLab;
    private javax.swing.JTextField howMuchTime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel pos00;
    private javax.swing.JLabel pos01;
    private javax.swing.JLabel pos02;
    private javax.swing.JLabel pos03;
    private javax.swing.JLabel pos04;
    public javax.swing.JLabel pos10;
    private javax.swing.JLabel pos11;
    private javax.swing.JLabel pos12;
    private javax.swing.JLabel pos13;
    private javax.swing.JLabel pos14;
    private javax.swing.JLabel pos20;
    private javax.swing.JLabel pos21;
    private javax.swing.JLabel pos22;
    private javax.swing.JLabel pos23;
    private javax.swing.JLabel pos24;
    private javax.swing.JLabel pos30;
    private javax.swing.JLabel pos31;
    private javax.swing.JLabel pos32;
    private javax.swing.JLabel pos33;
    private javax.swing.JLabel pos34;
    private javax.swing.JLabel pos40;
    private javax.swing.JLabel pos41;
    private javax.swing.JLabel pos42;
    private javax.swing.JLabel pos43;
    private javax.swing.JLabel pos44;
    private javax.swing.JButton setT;
    // End of variables declaration//GEN-END:variables
}
