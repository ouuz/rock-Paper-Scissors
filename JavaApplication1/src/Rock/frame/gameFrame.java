/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rock.frame;

import java.awt.event.*;
import java.util.Calendar;
import java.util.Timer;
import Rock.Person;
import Rock.Computer;
import java.awt.Toolkit;
import java.util.TimerTask;
import javax.swing.ImageIcon;

/**
 *
 * @author ouu
 */
public class GameFrame extends javax.swing.JFrame {

    ImageIcon fistGif = new ImageIcon("src\\image\\fist.gif");
    private final String[] iconBox = {"src\\image\\1.png", "src\\image\\2.png", "src\\image\\3.png", "src\\image\\X.png"};
    private int round = 0;
    private String battleMode = "";
    private int player2WinNumber = 0;
    private int player1WinNumber = 0;
    private int hadRound = 0;
    private int aheadRound = 0;
    private int player1Code = 3;
    private int player2Code = 3;

    public int width = Toolkit.getDefaultToolkit().getScreenSize().width;
    public int height = Toolkit.getDefaultToolkit().getScreenSize().height;
    public int windowsWedth = 800;
    public int windowsHeight = 630;

    Person player1 = new Person();
    Person player2 = new Person();
    Computer player3 = new Computer();

    /**
     * Creates new form GameFrame
     */
    public GameFrame() {
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

        gameIcon = new javax.swing.JLabel();
        beginBtn = new javax.swing.JButton();
        player1Label = new javax.swing.JLabel();
        player1ResultIcon = new javax.swing.JLabel();
        player1WinLabel = new javax.swing.JLabel();
        player1Win = new javax.swing.JLabel();
        player2Label = new javax.swing.JLabel();
        player2ResultIcon = new javax.swing.JLabel();
        player2WinLabel = new javax.swing.JLabel();
        player2Win = new javax.swing.JLabel();
        hadLabel = new javax.swing.JLabel();
        roundHad = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gameIcon.setFont(new java.awt.Font("华文彩云", 3, 48)); // NOI18N
        gameIcon.setText("3");
        getContentPane().add(gameIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 60, 80));

        beginBtn.setBackground(new java.awt.Color(242, 247, 225));
        beginBtn.setFont(new java.awt.Font("华文彩云", 1, 18)); // NOI18N
        beginBtn.setText("begin");
        beginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beginBtnActionPerformed(evt);
            }
        });
        getContentPane().add(beginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 200, 60));

        player1Label.setFont(new java.awt.Font("华文彩云", 0, 15)); // NOI18N
        player1Label.setText("player1");
        getContentPane().add(player1Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, -1, -1));

        player1ResultIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1.png"))); // NOI18N
        getContentPane().add(player1ResultIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, -1, -1));

        player1WinLabel.setFont(new java.awt.Font("华文彩云", 0, 18)); // NOI18N
        player1WinLabel.setText("player1Win：");
        getContentPane().add(player1WinLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, -1, -1));

        player1Win.setFont(new java.awt.Font("华文彩云", 1, 24)); // NOI18N
        player1Win.setForeground(new java.awt.Color(2, 180, 84));
        player1Win.setText("0");
        getContentPane().add(player1Win, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, 30, 40));

        player2Label.setFont(new java.awt.Font("华文彩云", 0, 15)); // NOI18N
        player2Label.setText("player2");
        getContentPane().add(player2Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, -1, -1));

        player2ResultIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1.png"))); // NOI18N
        getContentPane().add(player2ResultIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, -1, -1));

        player2WinLabel.setFont(new java.awt.Font("华文彩云", 0, 18)); // NOI18N
        player2WinLabel.setText("player2Win：");
        getContentPane().add(player2WinLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 500, -1, -1));

        player2Win.setFont(new java.awt.Font("华文彩云", 1, 24)); // NOI18N
        player2Win.setForeground(new java.awt.Color(2, 180, 84));
        player2Win.setText("0");
        getContentPane().add(player2Win, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 490, 40, 40));

        hadLabel.setFont(new java.awt.Font("华文彩云", 0, 18)); // NOI18N
        hadLabel.setText("hadRound:");
        getContentPane().add(hadLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, -1, -1));

        roundHad.setFont(new java.awt.Font("华文彩云", 1, 24)); // NOI18N
        roundHad.setForeground(new java.awt.Color(2, 180, 84));
        roundHad.setText("0");
        getContentPane().add(roundHad, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, 20, 40));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bg.jpg"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @description 游戏开始
     */
    private void beginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beginBtnActionPerformed
        countDown();
        player1.changeFistCode(3);

        if ("Man VS Man".equals(battleMode)) {
            player2.changeFistCode(3);
            beginBtn.addKeyListener(new KeyAdapter() {
                int flag = 0;

                public void keyPressed(KeyEvent e) {
                    getKeyWord(e, player1, player2);
                    flag++;
                    player1Code = player1.getFistCode();
                    player2Code = player2.getFistCode();

                    if (flag == 2) {
                        player1Code = player1.getFistCode();
                        player2Code = player2.getFistCode();
                        beginBtn.removeKeyListener(this);
                        flag = 0;
                    }
                }
            }
            );
        } else {
            player2Code = player3.getFistCode();
            beginBtn.addKeyListener(new KeyAdapter() {
                public void keyPressed(KeyEvent e) {
                    getKeyWord(e, player1);
                    player1Code = player1.getFistCode();
                    beginBtn.removeKeyListener(this);
                }
            });
        }
    }//GEN-LAST:event_beginBtnActionPerformed

    /**
     * @description 人人对战时同时按下键盘防出错判断
     * @param player1Code 玩家1的出拳结果代表号码
     * @param player2Code 玩家2的出拳结果代表号码
     */
    public void mistakeProofing(int player1Code, int player2Code) {
        if (hadRound >= round || player1WinNumber >= aheadRound || player2WinNumber >= aheadRound) {
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.SECOND, 01);

            Timer timer = new Timer();
            timer.schedule(new java.util.TimerTask() {
                @Override
                public void run() {
                    java.awt.EventQueue.invokeLater(() -> {
                        dialogJFrame dialog = new dialogJFrame();
                        dialog.setFinalStatement(battleMode, getFinalWinner());
                        dialog.setTitle("剪刀石头布");
                        dialog.setBounds((width - windowsWedth) / 2, (height - windowsHeight) / 2, windowsWedth, windowsHeight);
                        dialog.setVisible(true);
                        dialog.setResizable(false);
                        dispose();
                    });
                }
            }, calendar.getTime());
        }

    }

    /**
     * @description 人机对战获得玩家出拳结果 player1: ←:剪刀37 => 1 ↓:石头40 => 2 →:布39 => 0
     * @param e 监听键盘事件的e
     * @param player1 玩家1
     */
    public void getKeyWord(KeyEvent e, Person player1) {
        switch (e.getKeyCode()) {
            case 37:
                player1.changeFistCode(1);
                break;
            case 40:
                player1.changeFistCode(2);
                break;
            case 39:
                player1.changeFistCode(0);
                break;
        }
    }

    /**
     * @description 人人对战获得玩家出拳结果 player1: F1:剪刀112 => 1 F2:石头113 => 2 F3:布114 =>
     * 0 player2: ←:剪刀37 => 1 ↓:石头40 => 2 →:布39 => 0
     * @param e 监听键盘事件的e
     * @param player1 玩家1
     * @param player2 玩家2
     */
    public void getKeyWord(KeyEvent e, Person player1, Person player2) {
        switch (e.getKeyCode()) {
            case 112:
                player1.changeFistCode(1);
                break;
            case 113:
                player1.changeFistCode(2);
                break;
            case 114:
                player1.changeFistCode(0);
                break;
            case 37:
                player2.changeFistCode(1);
                break;
            case 40:
                player2.changeFistCode(2);
                break;
            case 39:
                player2.changeFistCode(0);
                break;
        }
    }

    /**
     * @description 初始化游戏模式+回合
     * @param battleMode 游戏模式
     * @param round 游戏回合
     */
    public void inital(String battleMode, int round) {
        if ("Man VS Computer".equals(battleMode)) {
            player1WinLabel.setText("playerWin：");
            player2WinLabel.setText("computerWin：");
        }
        this.round = round;
        switch (round) {
            case 5:
                aheadRound = 3;
                break;
            case 3:
                aheadRound = 2;
                break;
            default:
                aheadRound = 1;
                break;
        }

        this.battleMode = battleMode;

    }

    /**
     * @description 玩家出拳后改变页面上的出拳结果
     * @param player1Code 玩家1出的拳对应代表号码
     * @param player2Code 玩家2出的拳对应代表号码
     */
    public void changeIcon(int player1Code, int player2Code) {
        ImageIcon image1 = new ImageIcon(iconBox[player1Code]);
        ImageIcon image2 = new ImageIcon(iconBox[player2Code]);
        player1ResultIcon.setIcon(image1);
        player2ResultIcon.setIcon(image2);
    }

    /**
     * @description 判断游戏结果
     * @param player1Code 玩家1出的拳对应代表号码
     * @param player2Code 玩家2出的拳对应代表号码
     */
    public void judge(int player1Code, int player2Code) {
        if (player1Code != 3 && player2Code != 3) {
            if (player1Code == (player2Code + 1) % 3) {
                player1WinNumber++;
            } else if (player1Code == player2Code) {
            } else {
                player2WinNumber++;
            }
        } else if (player1Code == 3 && player2Code != 3) {
            player2WinNumber++;
        } else if (player2Code == 3 && player1Code != 3) {
            player1WinNumber++;
        } else if (player1Code == 3 && player1Code == 3) {
        }

        hadRound++;
        player1Win.setText(Integer.toString(player1WinNumber));
        player2Win.setText(Integer.toString(player2WinNumber));
        roundHad.setText(Integer.toString(hadRound));

    }

    /**
     * @description 游戏开始后的倒计时
     */
    public void countDown() {
        player1ResultIcon.setIcon(fistGif);
        player2ResultIcon.setIcon(fistGif);

        Calendar calendar = Calendar.getInstance();

        Timer timer = new Timer();
        timer.schedule(new Task(timer), calendar.getTime(), 1000);

    }

    /**
     * @description 倒计时的任务清单
     */
    class Task extends TimerTask {

        private Timer timer;

        public Task(Timer timer) {
            this.timer = timer;
        }

        int countDown = 3;

        @Override
        public void run() {
            gameIcon.setText(countDown + "");

            if (countDown-- == 0) {
                judge(player1Code, player2Code);
                changeIcon(player1Code, player2Code);
                mistakeProofing(player1Code, player2Code);
                this.timer.cancel();
            }
        }
    }

    /**
     * @return 获胜玩家的名字
     * @description 判断游戏的最后赢家
     */
    public String getFinalWinner() {
        String winner;
        if ("Man VS Man".equals(battleMode)) {
            if (player1WinNumber > player2WinNumber) {
                winner = "player1";
            } else if (player1WinNumber < player2WinNumber) {
                winner = "player2";
            } else {
                winner = "equal";
            }
        } else {
            if (player1WinNumber > player2WinNumber) {
                winner = "man";
            } else if (player1WinNumber < player2WinNumber) {
                winner = "computer";
            } else {
                winner = "equal";
            }
        }
        return winner;
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
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton beginBtn;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel gameIcon;
    private javax.swing.JLabel hadLabel;
    private javax.swing.JLabel player1Label;
    private javax.swing.JLabel player1ResultIcon;
    private javax.swing.JLabel player1Win;
    private javax.swing.JLabel player1WinLabel;
    private javax.swing.JLabel player2Label;
    private javax.swing.JLabel player2ResultIcon;
    private javax.swing.JLabel player2Win;
    private javax.swing.JLabel player2WinLabel;
    private javax.swing.JLabel roundHad;
    // End of variables declaration//GEN-END:variables
}
