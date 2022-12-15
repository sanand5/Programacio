/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import java.util.Arrays;

/**
 *
 * @author sanand
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String H = "Papallona";
        System.out.println(H.replace("a", "e"));
        System.out.println(H);
        System.out.println("");
        int V[] = {2, 3, 4, 5, 2 ,6}; 
        Arrays.sort(V);
        for (int i : V) {
            System.out.println(i);
        }
    }
    
}
