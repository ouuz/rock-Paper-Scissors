/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rock;

import Rock.frame.selectBattleModeFrame;

/**
 *
 * @author ouu
 */

public class RockPaperScissors  {

    /*
     * @description 创建新窗口：选择玩家人数的窗口
     */
    public RockPaperScissors() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                selectBattleModeFrame selectBattleMode = new selectBattleModeFrame();
                selectBattleMode.setVisible(true);
                selectBattleMode.setResizable(false);;
            }
        });
    }

    public static void main(String[] args) {
        RockPaperScissors game = new RockPaperScissors();
    }
}
