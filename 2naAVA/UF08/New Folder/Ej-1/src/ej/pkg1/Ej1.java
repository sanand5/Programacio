/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ej.pkg1;

// @author sanzs

public class Ej1 {
    public static void main(String[] args) {
        Cuenta andreu = new Cuenta("Andreu");
        andreu.ingresar(100);
        andreu.retirar(1001);
        System.out.println(andreu.toString());
        
    }

}
