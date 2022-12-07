/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf6_13;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author sanzs
 */
public class UF6_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("V = ");
        int v = sc.nextInt();
        System.out.print("Inc = ");
        int inc = sc.nextInt();
        System.out.print("num = ");
        int V[] = new int[sc.nextInt()];
        
        for (int i = 0; i < V.length; i++) {
            V[i]=v;
            v+=inc;
        }
        
        System.out.println(Arrays.toString(V));
        
    }
    
}
