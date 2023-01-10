/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf07_14;

import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class UF07_14 {

    /**
     * @param caracter
     * @param filas
     * @param args the command line arguments
     */
    public static void fun(String caracter, int filas) {
        for (int i = 0; i < filas; i++) {
//      Creació de les espais
            for (int espais = 0; espais < (filas-i); espais++) {
                System.out.print(" ");
            }
            
//      Creació de les files
            for (int contenido = 0; contenido < (i*2)-1; contenido++) {
                System.out.print(caracter);   
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Caracter = ");
        String caracter = sc.nextLine();
        System.out.print("Nombre de linies = ");
        int filas = sc.nextInt()+1;
        fun(caracter, filas);
        

    }
}
