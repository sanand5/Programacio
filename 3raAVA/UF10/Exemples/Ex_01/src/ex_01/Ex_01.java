/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_01;

import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class Ex_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int div, x = 3, y = 0;
        
        try {
        div = x/y;
        } catch (ArithmeticException a) {
            System.out.println("jeje");
        }
        System.out.println("FIN y."); 
    }
    
    

}
