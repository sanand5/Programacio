/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act_1;

import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class Act_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        double V[]=new double[10];
        Scanner sc= new Scanner(System.in);
        System.out.println("Escriu 10 numeros");
        for (int i = 0; i < V.length; i++) {
            V[i]=sc.nextInt();
        }
        for (int i = 0; i < V.length; i++) {
            System.out.print(V[i]+"\t"); 
            
        }
        
    }
    
}
