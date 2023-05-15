/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf10_04;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class UF10_04 {

    /**
     * @param args the command line arguments
     * id : jej
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int min = 1, max = 100;
        int random = (int) (Math.random() * (max - min + 1) + min);
        
        int V[] = new int[random];
        min = 1; max = 10;
        for (int i = 0; i < V.length; i++) {
            V[i]= (int) (Math.random() * (max - min + 1) + min);
        }
        
        while (true) {
            try {
                System.out.print("Posició? ");
                int num = sc.nextInt();
                if (num<0) break;
                System.out.println(V[num]);
            } catch (InputMismatchException e) {
                System.out.println("Error: No pots introduir valors sencers");
                sc.next();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Fora de el array");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
}
