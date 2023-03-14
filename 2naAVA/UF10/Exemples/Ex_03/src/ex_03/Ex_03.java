/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_03;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class Ex_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int V[] = {1, 2, 3};
        try {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a = x/y;
            int z = sc.nextInt();;
            System.out.println(V[z]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Fora de rang");        
        } catch (InputMismatchException e) {
            System.out.println("Has de introduir numeros");
        } catch (ArithmeticException e) {
            System.out.println("No pots dividir per 0");
        } catch (Exception e) {
            System.out.println("Ah");
        }
    }
    
}
