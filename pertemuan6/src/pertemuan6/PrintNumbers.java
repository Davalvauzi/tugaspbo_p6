/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

/**
 *
 * @author MyPC PRO
 */
public class PrintNumbers {
    int batas;
    public PrintNumbers(int batas) {
        this.batas=batas;
    }
    
    public void NumberShow() {
        for(int i = 1; i < batas; i++)
        {
            System.out.println(i);
        }
    }
}
