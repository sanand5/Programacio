/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_04;

import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class Ex_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        try {
            int a;
            while (true) {
                System.out.print("Valor: ");
                a = sc.nextInt();
                duplicar(a);
            }
        } catch (Propia e) {
            System.out.println(e);
        }
    }
    public static void duplicar(int num) throws Propia {
        if (num>10) 
            throw new Propia(num);
        System.out.println("Duplicat: "+num*2);
    }
    
}
