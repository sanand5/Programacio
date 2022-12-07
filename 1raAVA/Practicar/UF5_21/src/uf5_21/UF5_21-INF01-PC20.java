/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf5_21;

import java.util.Scanner;

/**
 *
 * @author sanzs
 */
public class UF5_21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int cont=0;
        System.out.print("Num = ");
        int i = sc.nextInt();
        System.out.print("Num = ");
        int max = sc.nextInt();
        for ( i=i ; i <= max; i++) {
            System.out.print(i+" ");
            if (i%2==0) {
                cont++;
            }
        }
        System.out.println("\npars="+cont);
    }
    
}
