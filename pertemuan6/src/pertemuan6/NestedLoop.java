/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

/**
 *
 * @author MyPC PRO
 */
public class NestedLoop {
    int out,in;
    public NestedLoop(int out,int in) {
        this.out=out;
        this.in=in;
    }
    
    public void PrintLoop() {
        for (int i = 1; i <= out; i++) {
            System.out.println("Outer: " + 1);
            
            for (int j = 1; j <= in; j++) {
                System.out.println(" Inner: " + j);
            }
        }
    }
}
