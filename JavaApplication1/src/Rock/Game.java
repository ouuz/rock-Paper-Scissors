/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rock;

/**
 *
 * @author ouu
 */
public class Game {

    private int player1Win = 0;
    private int player2Win = 0;

    public void judge(int player1, int player2) {
        if (player1 == (player2 + 1) % 3) {
            player1Win++;
            System.out.println("play1:" + player1);
            System.out.println("play2:" + player2);
            System.out.println("1赢了");
        } else if (player1 == player2) {
            System.out.println("play1:" + player1);
            System.out.println("play2:" + player2);
            player1Win++;
            player2Win++;
            System.out.println("平了");
        } else {
            System.out.println("play1:" + player1);
            System.out.println("play2:" + player2);
            System.out.println("2赢了");
            player2Win++;
        }
    }

}
