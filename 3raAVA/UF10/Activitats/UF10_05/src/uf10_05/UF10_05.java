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
                //System.out.println("\nIteració ["+i+"]\n"); //Descomenta aquesta linea per a saber en quina iteracio del bucle for estas
                System.out.print("Donam un valor positiu: ");
                int p = sc.nextInt();
                imprimeixPositiu(p);
                System.out.print("Donam un valor negatiu: ");
                int n = sc.nextInt();
                imprimeixNegatiu(n);
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
    // Aquesta funcio crea i llansa un error de la clase ErrorSigne si el valor es negatiu
    // *No retorna res
    // *Parametres de entrada
    //      int p = fa referencia al numero intrduit per l'usuari
    //
    public static void imprimeixPositiu(int p) throws Exception {
        if (p<0) {
            throw new Exception("### Error : Has d'introduir un valor positiu ###");
        }else System.out.println("\tnum: "+p);
    }
    // Aquesta funcio crea i llansa un error de la clase ErrorSigne si el valor es positiu o 0
    // *No retorna res
    // *Parametres de entrada
    //      int n = fa referencia al numero intrduit per l'usuari
    //
    public static void imprimeixNegatiu(int n) throws Exception {
        if (n>=0) {
            throw new Exception("### Error : Has d'introduir un valor negatiu ###");
        }else System.out.println("\tnum: "+n);
    }
    
}
