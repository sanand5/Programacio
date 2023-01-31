/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vocal;

import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class Vocal {

    /**
     * @param args the command line arguments
     */
    public static String esvocal(char letra) {
        char V[] = {'a','e','i','o','u','á','é','í','ó','ú'};
        for (int i = 0; i < V.length; i++) {
            if (letra==V[i]) {
                System.out.println("Vocal");
            }
        }
        System.out.println("no vocal");;
    }
    public static int preguntar() {
        Scanner sc = new Scanner(System.in);
        String letra="";
        for (int i = 0; i < 1; i++) {
            System.out.print("Caracter: ");
            letra = sc.nextLine();
            if (letra.length()!=1) {
                System.out.println("Sols un caracter perfa");
                i--;
            }else return letra.toLowerCase().charAt(0);
        }  
        return  letra.toLowerCase().charAt(0);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        
        
    }
    
}
