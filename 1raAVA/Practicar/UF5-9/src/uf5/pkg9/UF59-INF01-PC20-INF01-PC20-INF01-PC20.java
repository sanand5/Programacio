/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf5.pkg9;

import java.util.Scanner;

/**
 *
 * @author sanzs
 */
public class UF59 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double suma=0;
        for (int i = 0; i < 10; i++) {
//            double num = sc.nextDouble();
            double num=2;
            if (num%1==0) {
                suma+=num;
            }else i--;
        }
        System.out.format("%u",suma);
        
    }
    
}
