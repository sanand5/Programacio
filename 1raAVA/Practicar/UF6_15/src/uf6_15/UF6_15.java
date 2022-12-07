/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf6_15;

import java.util.Arrays;

/**
 *
 * @author sanzs
 */
public class UF6_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int V[] = new int[55];

        int inicio=0;
        for (int i = 1; i <= 10; i++) {
            Arrays.fill(V, inicio, inicio+i, i);
            inicio+=i;
        }
        System.out.println(Arrays.toString(V));
    }
    
}
