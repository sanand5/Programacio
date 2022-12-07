/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf6_11;

import java.util.Arrays;

/**
 *
 * @author sanzs
 */
public class UF6_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int V [] = new int[100];
        int L [] = new int[100];
        
        for (int i = 0; i < 100; i++) {
            V[i]=i+1;
        }
        for (int i = 0; i < 100; i++) {
            L[100-i-1]=V[i];
        }
        System.out.println(Arrays.toString(V));
        System.out.println(Arrays.toString(L));
        
    }
    
}
