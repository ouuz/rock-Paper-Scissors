/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rock.frame;

/**
 *
 * @author ouu
 */
public class selectBattleModeFrame extends javax.swing.JFrame {

    /**
     * Creates new form selectBattleMode
     */
    public selectBattleModeFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        manVSMan = new javax.swing.JButton();
        manVSComputer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("幼圆", 0, 24)); // NOI18N
        jLabel1.setText("剪刀石头布");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.ipady = 23;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(106, 309, 0, 0);
        getContentPane().add(jLabel1, gridBagConstraints);

        manVSMan.setText("Man VS Man");
        manVSMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manVSManActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 213;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(43, 197, 0, 187);
        getContentPane().add(manVSMan, gridBagConstraints);

        manVSComputer.setText("Man VS Computer");
        manVSComputer.setMaximumSize(new java.awt.Dimension(113, 27));
        manVSComputer.setMinimumSize(new java.awt.Dimension(113, 27));
        manVSComputer.setPreferredSize(new java.awt.Dimension(113, 27));
        manVSComputer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manVSComputerActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 203;
        gridBagConstraints.ipady = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 197, 132, 187);
        getContentPane().add(manVSComputer, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void manVSManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manVSManActionPerformed
        dispose();
        createRoundFrame();
    }//GEN-LAST:event_manVSManActionPerformed

    private void manVSComputerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manVSComputerActionPerformed
        dispose();
        createRoundFrame();
    }//GEN-LAST:event_manVSComputerActionPerformed

    public void createRoundFrame() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                roundJFrame round = new roundJFrame();
                round.changeBattleMode("Man VS Computer");
                round.setVisible(true);
                round.setResizable(false);
            }
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(selectBattleMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(selectBattleMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(selectBattleMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(selectBattleMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manVSComputer;
    private javax.swing.JButton manVSMan;
    // End of variables declaration//GEN-END:variables
}
