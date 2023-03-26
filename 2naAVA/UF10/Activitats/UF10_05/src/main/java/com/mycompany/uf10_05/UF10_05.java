/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uf10_05;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Andreuet
 */
public class UF10_05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("["+i+"]");
                System.out.print("Donam un valor positiu: ");
                int p = sc.nextInt();
                System.out.print("Donam un valor negatiu: ");
                int n = sc.nextInt();
                imprimeixPositiu(p); //si clave els dos valors mal sols dona error el primer perque despues acaba, aixo he de cambiar-ho?
                imprimeixNegatiu(n);
                // Si un valor es erroni he de demanar sols ixe valor ho despues de clabar els dos demanar els dos
                
            } catch (InputMismatchException e) {
                System.out.println("Error : Has d'escriure un valor enter");
                sc.next();
                i--;
            } catch (ErrorSigne e) {
                i--;
            } catch (Exception e){
                System.out.println("Error desconegut");
                i--;
            }
            
        }
    }
    // Aquesta funcio crea i llansa un error de la clase ErrorSigne si el valor es negatiu
    // *No retorna res
    // *Parametres de entrada
    //      int p = fa referencia al numero intrduit per l'usuari
    //
    public static void imprimeixPositiu(int p) throws ErrorSigne {
        if (p<0) {
            throw new ErrorSigne(p, true);
        }else System.out.println(p);
    }
    // Aquesta funcio crea i llansa un error de la clase ErrorSigne si el valor es positiu o 0
    // *No retorna res
    // *Parametres de entrada
    //      int n = fa referencia al numero intrduit per l'usuari
    //
    public static void imprimeixNegatiu(int n) throws ErrorSigne {
        if (n>=0) {
            throw new ErrorSigne(n, false);
        }else System.out.println(n);
    }
}
// No diu res de crear una clase, jo la he creat, pasa algo?