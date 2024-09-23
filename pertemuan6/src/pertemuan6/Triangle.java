/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

/**
 *
 * @author MyPC PRO
 */
public class Triangle {
    int out;
    public Triangle(int out) {
        this.out = out;
    }
    
    public void PrintTriangle() {
        for(int i = 1; i<=out; i++) {
            for(int j = 1; j<=i; j++) {
                System.out.println("* ");
            }
            System.out.println("\n");
        }
    }
}
