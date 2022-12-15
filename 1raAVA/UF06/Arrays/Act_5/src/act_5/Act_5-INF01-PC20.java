/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act_5;

import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class Act_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double V[]=new double[20];
        double suma=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Escriu 20 numeros");
        for (int i = 0; i < V.length; i++) {
            V[i]=sc.nextDouble();
            suma+=V[i];
        }System.out.println("La mitjana es: "+suma/V.length);
    
    }
}
