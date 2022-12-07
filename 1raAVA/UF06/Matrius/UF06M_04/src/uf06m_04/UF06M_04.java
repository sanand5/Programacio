/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf06m_04;

import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class UF06M_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double V[][] = new double[4][5];

        String Alumnes[] = {"Andreu", "Raquel", "Andrea", "Raul",};
        for (int i = 0; i < V.length; i++) {
            double min = 10, max = 0, suma = 0;
            for (int j = 0; j < V[i].length; j++) {
                System.out.print("Nota " + (j + 1) + " del estudiant " + (Alumnes[i]) + " = ");
                V[i][j] = sc.nextInt();

                if (V[i][j] < min) {
                    min = V[i][j];
                } else if (V[i][j] > max) {
                    max = V[i][j];
                }
                suma += V[i][j];
            }
            System.out.println("\nLa minima del alumne " + Alumnes[i] + " es: " + min);
            System.out.println("La maxima del alumne " + Alumnes[i] + " es: " + max);
            System.out.println("La mitjana del alumne " + Alumnes[i] + " es: " + suma / 5);
            System.out.println("");
        }
    }
}
