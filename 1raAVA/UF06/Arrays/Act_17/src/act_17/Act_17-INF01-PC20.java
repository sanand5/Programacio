/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act_17;

import java.util.Arrays;

/**
 *
 * @author sanand
 */
public class Act_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int V[] = new int [30];
        for (int i = 0; i < V.length; i++) {
            V[i] = (int) (1+Math.random()*10);
            
        }
        System.out.println("El array es: \n" + Arrays.toString(V));
        Arrays.sort(V);
        System.out.println("La array ordenada es: \n" + Arrays.toString(V));
    }
    
    
}
