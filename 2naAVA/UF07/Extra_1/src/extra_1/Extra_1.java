/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package extra_1;

// @author sanzs

import java.util.Scanner;


public class Extra_1 {
    public static int suma(String num) {
        int suma=0;
        for (int i = 0; i < num.length(); i++) {
            suma += (int) num.charAt(i)-48;
        }
        return suma;
    }
    public static int contar(String num) {
        return num.length();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("? ");
        String numero= sc.nextLine();
        System.out.printf("El nombre de dígits del %s és %d i la suma dels seus dígits és %d", numero, contar(numero), suma(numero));
        
        
        
    }

}
