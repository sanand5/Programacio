/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf5_12;

import java.util.Scanner;

/**
 *
 * @author sanzs
 */
public class UF5_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         int b = sc.nextInt();
         double res=a; //reduim una operació
         int veces=b;
        if (b<0) {
            veces =-b;
         }
        for (int i = 1; i < veces; i++) {
            res*=a;
        }
        if (b<0) {
            res=1/res;
        }
        
         System.out.println(res);
        
    }
    
}
