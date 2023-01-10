/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package uf07_15;
// Andreu Sanz Sanz

import java.util.Arrays;

public class UF07_15 {
    public static int suma(int []V) {
            int j=0;
        for (int i = 0; i < V.length; i++) {
            j +=V[i];
        }
        return j;
    }
    public static double mitjana(int []V) {
        return suma(V)/V.length;
    }
    public static void main(String[] args) {
        int V[] = new int[100];
        for (int i = 0; i < V.length; i++) {
            V[i] = i+1;
        }
        System.out.println("Suma: "+suma(V)+"\n"+
                           "Mitjana: "+(double) mitjana(V));
    }

}
