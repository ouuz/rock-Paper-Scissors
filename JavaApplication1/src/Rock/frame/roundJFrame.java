/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rock.frame;

import java.awt.Toolkit;

/**
 *
 * @author ouu
 */
public class roundJFrame extends javax.swing.JFrame {

    private String battleMode = "";
    private int round = 0;

    public int width = Toolkit.getDefaultToolkit().getScreenSize().width;
    public int height = Toolkit.getDefaultToolkit().getScreenSize().height;
    public int windowsWedth = 800;
    public int windowsHeight = 630;

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
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("华文彩云", 0, 36)); // NOI18N
        jLabel1.setText("Round of selection");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, -1));

        oneRound.setBackground(new java.awt.Color(242, 247, 225));
        oneRound.setFont(new java.awt.Font("华文彩云", 1, 18)); // NOI18N
        oneRound.setText("A game is a sure bet");
        oneRound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneRoundActionPerformed(evt);
            }
        });
        getContentPane().add(oneRound, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 305, 57));

        threeRound.setBackground(new java.awt.Color(150, 218, 226));
        threeRound.setFont(new java.awt.Font("华文彩云", 1, 18)); // NOI18N
        threeRound.setText("Two out of three sets match");
        threeRound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeRoundActionPerformed(evt);
            }
        });
        getContentPane().add(threeRound, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 305, 55));

        fiveRound.setBackground(new java.awt.Color(235, 157, 196));
        fiveRound.setFont(new java.awt.Font("华文彩云", 1, 18)); // NOI18N
        fiveRound.setText("Three out of five sets match");
        fiveRound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveRoundActionPerformed(evt);
            }
        });
        getContentPane().add(fiveRound, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 305, 51));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bg.jpg"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        bg.getAccessibleContext().setAccessibleName("bg");

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
            game.setTitle(" 对战ing");
            game.inital(battleMode, round);
            game.setBounds((width - windowsWedth) / 2, (height - windowsHeight) / 2, windowsWedth, windowsHeight);
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
    private javax.swing.JLabel bg;
    private javax.swing.JButton fiveRound;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton oneRound;
    private javax.swing.JButton threeRound;
    // End of variables declaration//GEN-END:variables
}
