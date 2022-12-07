/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf5_qualificable;

import java.util.Scanner;

/**
 *
 * @author sanzs
 */
public class UF5_Qualificable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Files = ");
        int files = sc.nextInt();
        sc.nextLine();
        System.out.print("\nnum?(0/1): ");
        int num = sc.nextInt();
        int asteriscos=1;
        for (int i = 1; i <= files; i++) {
            for (int j = 0; j < files-i; j++) {
                System.out.print(" ");
            }
            
            for (int q = 0; q < asteriscos; q++) {
                if (num==0) {
                    System.out.print(i);
                } else {
                    System.out.print("*");
                }
                
                
            }
            asteriscos+=2;
            System.out.println("");
        }
    }
    
}
