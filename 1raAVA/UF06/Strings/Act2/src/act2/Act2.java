/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act2;

import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class Act2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriu una frase");
        String frs1=sc.nextLine();
        System.out.println("Escriu una altra frase");
        String frs2=sc.nextLine();
        
        if (frs1.equals(frs2)) {
            System.out.println("Comparant les majuscules els estrings son iguals");
        }else System.out.println("Comparant les majuscules els estrings son diferents");
        System.out.println("");
        if (frs1.equalsIgnoreCase(frs2)) {
            System.out.println("Sense les majuscules els estrings son iguals");
        } else System.out.println("Sense les majuscules els estrings son diferents");
    }
    
}
