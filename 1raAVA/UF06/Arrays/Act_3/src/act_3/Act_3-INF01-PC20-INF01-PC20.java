/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act_3;

import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class Act_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double V[]=new double[10];
        Scanner sc= new Scanner(System.in);
        System.out.println("Escriu 10 numeros");
        for (int i = 0; i < V.length; i++) {
            V[i]=sc.nextInt();
        }double max=V[0], min=V[0];
        for (int i = 1; i < V.length; i++) {
            max=Math.max(max, V[i]);
            min=Math.min(min, V[i]);
        }
        System.out.println("El major es: "+max+"\nEl menor es: "+min);
    }
    
}
