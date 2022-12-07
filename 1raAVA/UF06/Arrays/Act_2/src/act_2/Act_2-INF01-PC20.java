/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act_2;

import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class Act_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double suma=0;
        double V[]=new double[10];
        Scanner sc= new Scanner(System.in);
        System.out.println("Escriu 10 numeros");
        for (int i = 0; i < V.length; i++) {
            V[i]=sc.nextInt();
            suma+=V[i];
        }
        System.out.println("La suma de ells són: "+suma);
        
    }
    
}
