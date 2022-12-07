/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf6_16;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author sanzs
 */
public class UF6_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int V[] = new int[10];
        int L[] = new int[10];
        
        for (int i = 0; i < 20; i++) {
            if (i<10) {
                V[i]=sc.nextInt();
            }else L[i-10] = sc.nextInt();
        }
        
        if (Arrays.equals(V, L)) {
            System.out.println("=");
        } else System.err.println("x");
        
        System.out.println(Arrays.toString(V));
        System.out.println(Arrays.toString(L));
    }
    
}
