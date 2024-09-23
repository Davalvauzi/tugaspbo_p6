/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Overloading;

/**
 *
 * @author MyPC PRO
 */
public class DemoCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circle cr = new Circle(2,3,5);
        Circle cr1 = new Circle(2,3);
        
        System.out.println("Lingkaran Konstruktor 3 parameter");
        System.out.println("Keliling Lingkaran: " + cr.keliling());
        System.out.println("Luas Lingkaran: " + cr.luas());
        
        System.out.println("Lingkaran konstruktor 2 parameter");
        System.out.println("Keliling Lingkaran: " + cr1.keliling());
        System.out.println("Luas Lingkaran: " + cr1.luas());
                
    }
    
}
