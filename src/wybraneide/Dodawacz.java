package wybraneide;


 //@author Kamil Cecherz
public class Dodawacz extends javax.swing.JFrame {
    public Dodawacz() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        ScoreDisplay = new javax.swing.JTextField();
        AddLabel = new javax.swing.JLabel();
        AddLeft = new javax.swing.JTextField();
        AddRight = new javax.swing.JTextField();
        DivLeft = new javax.swing.JTextField();
        SunstrLeft = new javax.swing.JTextField();
        MultLeft = new javax.swing.JTextField();
        DivRight = new javax.swing.JTextField();
        SubstrRight = new javax.swing.JTextField();
        MultRight = new javax.swing.JTextField();
        SubstrLabel = new javax.swing.JLabel();
        MultiLabel = new javax.swing.JLabel();
        DivLabel = new javax.swing.JLabel();
        Execute = new javax.swing.JButton();
        TitleLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ScoreDisplay.setEditable(false);
        ScoreDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScoreDisplay(evt);
            }
        });

        AddLabel.setText("+");

        AddLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddLeftActionPerformed(evt);
            }
        });

        AddRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddRightActionPerformed(evt);
            }
        });

        SubstrLabel.setText("-");

        MultiLabel.setText("x");

        DivLabel.setText("/");

        Execute.setText("Wykonaj");
        Execute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExecuteActionPerformed(evt);
            }
        });

        TitleLabel.setForeground(new java.awt.Color(255, 0, 0));
        TitleLabel.setText("CalText 1.0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Execute, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ScoreDisplay)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SunstrLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DivLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MultLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SubstrLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MultiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DivLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(SubstrRight, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(MultRight, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DivRight, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AddLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(AddRight, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(TitleLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScoreDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SunstrLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(MultLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DivLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SubstrRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SubstrLabel))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MultRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MultiLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DivRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DivLabel))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(Execute)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ScoreDisplay(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScoreDisplay
        // TODO add your handling code here:
    }//GEN-LAST:event_ScoreDisplay

    private void AddRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddRightActionPerformed

    }//GEN-LAST:event_AddRightActionPerformed

    private void ExecuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExecuteActionPerformed
        Mathematic dd = new Mathematic();
        double d=0,e=0,f=0,g=0,h=0,i=0,j=0,k=0;
        try {
            if(!AddLeft.getText().isEmpty()) {
                d = Double.parseDouble(AddLeft.getText());
            }
            if(!AddRight.getText().isEmpty()) {
                e = Double.parseDouble(AddRight.getText());
            }
             f = Double.parseDouble(SunstrLeft.getText());
             g = Double.parseDouble(SubstrRight.getText());
             h = Double.parseDouble(MultLeft.getText());
             i = Double.parseDouble(MultRight.getText());
             j = Double.parseDouble(DivLeft.getText());
             k = Double.parseDouble(DivRight.getText());
         } catch (NumberFormatException error) {
             error.toString();
         }
         try {
             if(!SunstrLeft.getText().isEmpty()) {
                f = Double.parseDouble(SunstrLeft.getText());
             }
             if(!SubstrRight.getText().isEmpty()) {
                g = Double.parseDouble(SubstrRight.getText());
             }
             d = Double.parseDouble(AddLeft.getText());
             e = Double.parseDouble(AddRight.getText());
             h = Double.parseDouble(MultLeft.getText());
             i = Double.parseDouble(MultRight.getText());
             j = Double.parseDouble(DivLeft.getText());
             k = Double.parseDouble(DivRight.getText());
         } catch (NumberFormatException error) {
             error.toString();
         }
         try {
             if(!MultLeft.getText().isEmpty()) {
                h = Double.parseDouble(MultLeft.getText());
             }
             if(!MultRight.getText().isEmpty()) {
                i = Double.parseDouble(MultRight.getText());
             }
             d = Double.parseDouble(AddLeft.getText());
             e = Double.parseDouble(AddRight.getText());
             f = Double.parseDouble(SunstrLeft.getText());
             g = Double.parseDouble(SubstrRight.getText());
             j = Double.parseDouble(DivLeft.getText());
             k = Double.parseDouble(DivRight.getText());
         } catch (NumberFormatException error) {
             error.toString();
         }
         try {
             if(!DivLeft.getText().isEmpty()) {
                j = Double.parseDouble(DivLeft.getText());
             }
             if(!DivRight.getText().isEmpty()) {
                k = Double.parseDouble(DivRight.getText());
             }
             d = Double.parseDouble(AddLeft.getText());
             e = Double.parseDouble(AddRight.getText());
             f = Double.parseDouble(SunstrLeft.getText());
             g = Double.parseDouble(SubstrRight.getText());
             h = Double.parseDouble(MultLeft.getText());
             i = Double.parseDouble(MultRight.getText());
         } catch (NumberFormatException error) {
             error.toString();
         }
        
        if(!AddLeft.getText().isEmpty() && !AddRight.getText().isEmpty())
            ScoreDisplay.setText(Double.toString(dd.dodaj(d, e)));
        
        if(!SunstrLeft.getText().isEmpty() && !SubstrRight.getText().isEmpty())
           ScoreDisplay.setText(Double.toString(dd.odejmij(f, g)));
        
        if(!MultLeft.getText().isEmpty() && !MultRight.getText().isEmpty())
           ScoreDisplay.setText(Double.toString(dd.pomnoz(h, i)));
        
        if(!DivLeft.getText().isEmpty() && !DivRight.getText().isEmpty())
           ScoreDisplay.setText(Double.toString(dd.podziel(j, k)));
    }//GEN-LAST:event_ExecuteActionPerformed

    private void AddLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddLeftActionPerformed
       
    }//GEN-LAST:event_AddLeftActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dodawacz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dodawacz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dodawacz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dodawacz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dodawacz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddLabel;
    private javax.swing.JTextField AddLeft;
    private javax.swing.JTextField AddRight;
    private javax.swing.JLabel DivLabel;
    private javax.swing.JTextField DivLeft;
    private javax.swing.JTextField DivRight;
    private javax.swing.JButton Execute;
    private javax.swing.JTextField MultLeft;
    private javax.swing.JTextField MultRight;
    private javax.swing.JLabel MultiLabel;
    private javax.swing.JTextField ScoreDisplay;
    private javax.swing.JLabel SubstrLabel;
    private javax.swing.JTextField SubstrRight;
    private javax.swing.JTextField SunstrLeft;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
