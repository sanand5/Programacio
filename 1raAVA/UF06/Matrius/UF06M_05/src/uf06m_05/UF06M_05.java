/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf06m_05;

import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class UF06M_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero de persones = ");
        int V[][] = new int[sc.nextInt()][2];
        int sumah=0, sumad=0, conth=0, contd=0;

     
        for (int i = 0; i < V.length; i++) {
            System.out.print("Genere (0/1): ");
            V[i][0] = sc.nextInt();
            System.out.print("Sou: ");
            V[i][1] = sc.nextInt();
            
            if (V[i][0] == 0) {
                sumah += V[i][1];
                conth++;
            } else {
                sumad += V[i][1];
                contd++;
            }
        }
        System.out.println("");
        if (conth>0) {
            System.out.printf("La mitjana del sou de els homes es: %d€\n",sumah/conth);
        } else System.out.println("En la teua empresa no treballen homes");
        if (contd>0) {
            System.out.printf("La mitjana del sou de les dones es: %d€\n",sumad/contd);
        } else System.out.println("En la teua empresa no treballen dones");
        
        
    }
    
}
