/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Overriding;

/**
 *
 * @author MyPC PRO
 */
public class view {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee em = new Employee("Dilan", 400000);
        Manager mn = new Manager("Milea", 500000, "Marketing");
        
        System.out.println("Data Employee : \n" + em.getDetails());
        em.cetak();
        System.out.println("\nData Manager : \n" + mn.getDetails());
        mn.cetak();
    }    
}
