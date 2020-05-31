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
public class RuleShowFrame extends javax.swing.JFrame {

    private String battleMode = "";
    private int round = 0;

    public int width = Toolkit.getDefaultToolkit().getScreenSize().width;
    public int height = Toolkit.getDefaultToolkit().getScreenSize().height;
    public int windowsWedth = 800;
    public int windowsHeight = 630;

    /**
     * Creates new form RuleShowFrame
     */
    public RuleShowFrame() {
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

        title = new javax.swing.JLabel();
        ManVSMan = new javax.swing.JLabel();
        ManVSMan_player2 = new javax.swing.JLabel();
        ManVSMan_player1 = new javax.swing.JLabel();
        ManVSComputer = new javax.swing.JLabel();
        ManVSComputer_player = new javax.swing.JLabel();
        begin = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("华文彩云", 1, 36)); // NOI18N
        title.setText("游戏规则：");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 200, 50));

        ManVSMan.setFont(new java.awt.Font("华文彩云", 0, 24)); // NOI18N
        ManVSMan.setText("人人模式：");
        getContentPane().add(ManVSMan, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        ManVSMan_player2.setFont(new java.awt.Font("华文新魏", 0, 24)); // NOI18N
        ManVSMan_player2.setText("player2: ←:剪刀↓:石头    →:布");
        getContentPane().add(ManVSMan_player2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 350, 40));

        ManVSMan_player1.setFont(new java.awt.Font("华文新魏", 0, 24)); // NOI18N
        ManVSMan_player1.setText("player1: F1:剪刀  F2:石头  F3:布");
        getContentPane().add(ManVSMan_player1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 350, 40));

        ManVSComputer.setFont(new java.awt.Font("华文彩云", 0, 24)); // NOI18N
        ManVSComputer.setText("人机模式：");
        getContentPane().add(ManVSComputer, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, -1));

        ManVSComputer_player.setFont(new java.awt.Font("华文新魏", 0, 24)); // NOI18N
        ManVSComputer_player.setText("player: ←:剪刀↓:石头    →:布");
        getContentPane().add(ManVSComputer_player, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 350, 40));

        begin.setBackground(new java.awt.Color(242, 247, 225));
        begin.setFont(new java.awt.Font("华文彩云", 0, 18)); // NOI18N
        begin.setText("开始游戏");
        begin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beginActionPerformed(evt);
            }
        });
        getContentPane().add(begin, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, 120, 50));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bg.jpg"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void beginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beginActionPerformed
        createGameWindow();
    }//GEN-LAST:event_beginActionPerformed

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
     * @description 获得游戏模式和游戏回合
     */
    public void getSelections(String mode, int battleRound) {
        battleMode = mode;
        round = battleRound;
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
            java.util.logging.Logger.getLogger(RuleShowFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RuleShowFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RuleShowFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RuleShowFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ManVSComputer;
    private javax.swing.JLabel ManVSComputer_player;
    private javax.swing.JLabel ManVSMan;
    private javax.swing.JLabel ManVSMan_player1;
    private javax.swing.JLabel ManVSMan_player2;
    private javax.swing.JButton begin;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
