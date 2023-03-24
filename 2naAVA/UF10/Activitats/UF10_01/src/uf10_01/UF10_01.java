/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf10_01;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class UF10_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Dime tu edad: ");
            int a = sc.nextInt();
            System.out.println("Tienes "+a+" años.");
        } catch (InputMismatchException e){
            System.out.println("Error: Has dintroduir valors sencers");
        } finally {System.out.println("FI");}
    }
}
    

