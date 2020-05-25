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
public class Person {

    private int fistCode = 3;

    /**
     * @param fistCode 玩家实时出拳结果
     * @description 更改玩家出拳结果
     */
    public void changeFistCode(int fistCode) {
        this.fistCode = fistCode;
    }

    /**
     * @return 返回玩家实时出拳结果
     * @description 获得玩家出拳结果
     */
    public int getFistCode() {
        return fistCode;
    }

}
