/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package uf07_13;

// @author sanzs

import java.util.Scanner;


public class UF07_13 {
    public static double fun(double real, double des) {
        return (des*100)/real;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Preu real: ");
        double real = sc.nextDouble();
        System.out.print("Preu descompte: ");
        System.out.printf("El percentatge de descompte es d'un: %.0f%%\n",fun(real,sc.nextDouble()));
        
    }

}
