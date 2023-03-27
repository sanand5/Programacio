/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf10_02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class UF10_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Valor a: ");
            int a = sc.nextInt();
            System.out.print("Valor b: ");
            int b = sc.nextInt();
            System.out.println("Resultat de a/b = "+(double) a/b);
        } catch (InputMismatchException e) {
            System.out.println("Error: Has dintroduir valors sencers");
        } catch (ArithmeticException e) {
            System.out.println("Error: No pots dividir entre 0");
        }
    }
    
}
