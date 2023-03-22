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
            int x = 2;
            int y = 0;
            int a = x/y;
            int z = 2;
            System.out.println(V[z]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Fora de rang");        
        } catch (InputMismatchException e) {
            System.out.println("Has de introduir numeros");
        } catch (ArithmeticException e) {
            System.out.println("No pots dividir per 0");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("ah");
        }
    }
    
}
