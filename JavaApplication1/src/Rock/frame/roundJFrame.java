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
public class roundJFrame extends javax.swing.JFrame {

    private String battleMode = "";
    private int round = 0;

    /**
     * Creates new form roundJFrame
     */
    public roundJFrame() {
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

        jLabel1 = new javax.swing.JLabel();
        oneRound = new javax.swing.JButton();
        threeRound = new javax.swing.JButton();
        fiveRound = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("幼圆", 0, 24)); // NOI18N
        jLabel1.setText("Round of selection");

        oneRound.setText("A game is a sure bet");
        oneRound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneRoundActionPerformed(evt);
            }
        });

        threeRound.setText("Two out of three sets match");
        threeRound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeRoundActionPerformed(evt);
            }
        });

        fiveRound.setText("Three out of five sets match");
        fiveRound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveRoundActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(jLabel1)
                .addContainerGap(269, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(fiveRound, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                    .addComponent(threeRound, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                    .addComponent(oneRound, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(220, 220, 220))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(oneRound, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(threeRound, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(fiveRound, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @description 选择一局定输赢
     */
    private void oneRoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneRoundActionPerformed
        round = 1;
        createGameWindow();
    }//GEN-LAST:event_oneRoundActionPerformed

    /**
     * @description 选择三局两胜
     */
    private void threeRoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeRoundActionPerformed
        round = 3;
        createGameWindow();
    }//GEN-LAST:event_threeRoundActionPerformed

    /**
     * @description 选择五局三胜
     */
    private void fiveRoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveRoundActionPerformed
        round = 5;
        createGameWindow();
    }//GEN-LAST:event_fiveRoundActionPerformed

    /**
     * @description 创建游戏窗口
     */
    public void createGameWindow() {
        dispose();
        java.awt.EventQueue.invokeLater(() -> {
           GameFrame game = new GameFrame();
            game.inital(battleMode, round);
            game.setVisible(true);
            game.setResizable(false);
        });
    }

    /**
     * @description 更改游戏模式
     * @param mode 游戏模式
     */
    public void changeBattleMode(String mode) {
        battleMode = mode;
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
            java.util.logging.Logger.getLogger(roundJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(roundJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(roundJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(roundJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fiveRound;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton oneRound;
    private javax.swing.JButton threeRound;
    // End of variables declaration//GEN-END:variables
}
