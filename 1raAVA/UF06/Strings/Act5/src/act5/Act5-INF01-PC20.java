/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act5;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class Act5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Disme una frase: ");
        String frs = sc.nextLine().replaceAll(" ", "").toLowerCase();       //remplasa els espais per res Iignora mayus

        char A[] = frs.toCharArray();                 //converteix en array
        char Ainvertida[] = new char[A.length];

        for (int i = 0; i < A.length; i++) {
            Ainvertida[i] = A[A.length - 1 - i];
        }

        if (Arrays.equals(A, Ainvertida)) {
            System.out.println("La frase es palindroma");
        } else {
            System.out.println("La frase no es palindroma");
        }
    }

}
