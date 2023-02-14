/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ej.pkg3;

// @author sanzs

import java.util.Scanner;


public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n?");
        int n = sc.nextInt();
        System.out.println("nlong?");
        int m = sc.nextInt();
        Pasword lista[] = new Pasword[n];
        boolean V[] = new boolean[n];
        for (int i = 0; i < lista.length; i++) {
            lista[i] = new Pasword(m);
            V[i]=lista[i].esFuerte();
            System.out.println("contraseña"+i+" "+ V[i]);
        }
    }

}
