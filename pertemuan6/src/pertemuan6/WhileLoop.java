/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

/**
 *
 * @author MyPC PRO
 */
public class WhileLoop {
    int cond;
    public WhileLoop(int cond) {
        this.cond = cond;
    }
    
    public void PrintLoop() {
        int i = 0;
        while(i < cond) {
            System.out.println(i);
            i++;
        }
    }
}
