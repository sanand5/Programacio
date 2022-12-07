/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf06_activitatqualificable;

import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class UF06_ActivitatQualificable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.print("Numero maxim: ");
        int max=sc.nextInt();
        
        int amplaria=0;
        for (int i = 0; i <= max; i++) {
            amplaria+=i;                    //Suma cada numero del 1 al numero maxim
        }
        
        int pos=0;
        int V[]=new int [amplaria];
        for (int i = 1; i <= max; i++) {    //Li diu al for de baix quin numero ha de guardar el vector i quantes vegades
            for (int j = 0; j < i; j++) {   //Guarda el num (i) en les posicions corresponents (i)
                V[pos]=i;
                pos++;
            }
        }
        
//        Print vector
        System.out.println("\nLa teua sequencia es:\n");
        for (int i = 0; i < V.length; i++) {
            System.out.print(V[i]+" ");
            
        }

    }
    
}
