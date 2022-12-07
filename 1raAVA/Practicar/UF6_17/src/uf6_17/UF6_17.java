/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf6_17;

import java.util.Arrays;

/**
 *
 * @author sanzs
 */
public class UF6_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double V[] = new double[30];
        for (int i = 0; i < V.length; i++) {
            V[i]=Math.round((1+Math.random()*9) * 100d) / 100d;
        }
        Arrays.sort(V);
//        System.out.printf("%.2f%n",Arrays.toString(V));
        System.out.println(Arrays.toString(V));
        
    }
    
}
