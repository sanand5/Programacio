/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf10_03;

import java.util.Arrays;
import java.util.Scanner;
import javax.print.DocFlavor;

/**
 *
 * @author sanand
 */
public class UF10_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int V[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < V.length; i++) {
            try {
                System.out.print("Valor V["+i+"] : ");
                V[i] = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Error: Has d'introduir un numero enter");
                sc.next();
                i--;
            }
        }
        fun(V);
    }
    public static void fun(int V[]) {
        /*
        for (int i = 0; i < V.length; i++) {
            System.out.println(V[i]);
        }*/
        System.out.println(Arrays.toString(V));
        
        
    }
    
}
