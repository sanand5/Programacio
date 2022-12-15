/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf5_5;

import java.util.Scanner;

/**
 *
 * @author sanzs
 */
public class UF5_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fac=1;
        while (num > 1) {
            fac*=num;   
            num--;
        }
        System.out.println("\n"+fac);
    }
    
}
