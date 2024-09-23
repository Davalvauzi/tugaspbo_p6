/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

/**
 *
 * @author MyPC PRO
 */
public class DoWhileLoop {
    int cond;
    public DoWhileLoop(int cond) {
        this.cond = cond;
    }
    
    public void PrintLoop() {
        int i = 1;
        do{
            System.out.println(i);
            i++;
        } while(i<cond);
    }
}
