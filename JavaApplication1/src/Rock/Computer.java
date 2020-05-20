/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rock;
import java.util.Random;
/**
 *
 * @author ouu
 */
public class Computer {
    private Random r;
     private int fistCode = 0;
     private int scroe = 0;
     
     public void randomFistCode(){
          r = new Random();
          fistCode = r.nextInt(3);
     }
     
    public int getFistCode(){
        randomFistCode();
          return fistCode;
     }
}
