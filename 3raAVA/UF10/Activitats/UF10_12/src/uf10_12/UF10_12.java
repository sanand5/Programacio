/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf10_12;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class UF10_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n=0;

        int posicio=0;

        String cadena=null;

        double[] valors = {9.83, 4.5, -3.06, 0.05, 2.52, -11.3, 7.60, 3.00, -30.4, 105.2};
        System.out.println("Contingut de l'array abans de modificar:");

        for (int i = 0; i < valors.length; i++) {
            System.out.printf("%.2f", valors[i]);
        }
        
        boolean repetir = true;
        do {
            try {
                    System.out.print("\n\nIntrodueix la posició de l'array a modificar: ");
                    cadena = sc.nextLine();
                    posicio = Integer.parseInt(cadena); //NumberFormatException
                    System.out.print("\nIntrodueix el nou valor de la posició " + posicio + ":");
                    n = sc.nextDouble();//InputMismatchException
                    valors[posicio] = n; //IndexOutOfBoundsException
                    repetir=false;
            } catch (InputMismatchException | IndexOutOfBoundsException | NumberFormatException e) {
                System.out.println(e);
                sc.nextLine();
            }
        } while (repetir);


        System.out.println("\nPosició a modificar " + posicio);
        System.out.println("Nou valor:" + n);
        System.out.println("Contingut de l'array modificat:");
        for (int i = 0; i < valors.length; i++) {
            System.out.printf("%.2f", valors[i]);
        }
    }
}
