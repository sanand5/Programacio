/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf10_05;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class UF10_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            try {
                //System.out.println("\nIteració ["+i+"]\n"); //Descomenta aquesta línia per a saber en quina iteració del bucle for estàs
                System.out.print("Donam un valor positiu: ");
                imprimeixPositiu(sc.nextInt());
                System.out.print("Donam un valor negatiu: ");
                imprimeixNegatiu(sc.nextInt());
            } catch (InputMismatchException e) {
                System.out.println("### Error : Has d'escriure un valor enter ###");
                sc.next();
                i--;
            } catch (Exception e){
                System.out.println(e.getMessage());
                i--;
            }
            
        }
    }
    // Aquesta funció crea i llança un error de la classe ErrorSigne si el valor és negatiu
    // *No retorna res
    // *Paràmetres d'entrada
    // int p = fa referència al número introduït per l'usuari
    //
    public static void imprimeixPositiu(int p) throws Exception {
        if (p<0) {
            throw new Exception("### Error : Has d'introduir un valor positiu ###");
        }else System.out.println("\tnum: "+p);
    }
    // Aquesta funció crea i llança un error de la classe ErrorSigne si el valor és positiu o 0
    // *No retorna res
    // *Paràmetres d'entrada
    // int n = fa referència al número introduït per l'usuari
    //
    public static void imprimeixNegatiu(int n) throws Exception {
        if (n>=0) {
            throw new Exception("### Error : Has d'introduir un valor negatiu ###");
        }else System.out.println("\tnum: "+n);
    }
    
}
