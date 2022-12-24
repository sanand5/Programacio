/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf07_12;

import java.util.Scanner;

/**
 *
 * @author sanzs
 */
public class UF07_12 {
    public static double fun(double km) {
        return km * 0.6214;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix els kilometres");
        double km = sc.nextDouble();
        System.out.printf("%.2f km en milles són: %.3f mi",km, fun(km));
        
    }
    
}
