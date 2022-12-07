/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act.pkg20;

import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class Act20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Donam un valor: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for (int i = 0; i < num+1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println("");
        }
    }
    
}
