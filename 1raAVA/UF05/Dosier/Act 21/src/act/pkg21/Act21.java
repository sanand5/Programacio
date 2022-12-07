/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act.pkg21;

import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class Act21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.print("Donam un valor: ");
        int num=sc.nextInt();
        System.out.print("Donam un altre valor major: ");
        int major=sc.nextInt();
        int pares=0;
        for (int i = num; i < major+1; i++) {
            System.out.print(i+"\t");
            if (i%2==0) {
                pares++;
            }
        }
        System.out.println("\nEl numero de pars són: "+pares);
    }
    
}
