/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ej.pkg2;

// @author sanzs

import java.util.Scanner;


public class Ej2 {
    public static void mensajeideal(int num) {
        if (num==-1) {
            System.out.println("pesoIdeal");
        } else if (num==1) {
            System.out.println("flaco");
        }else System.out.println("sobrepeso");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nom: ");
        String nom = sc.nextLine();
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        System.out.print("Secso: ");
        char secso = sc.next().charAt(0);
        System.out.print("Peso: ");
        double peso = sc.nextDouble();
        System.out.print("Altura: ");
        double altura = sc.nextDouble();
        
        Persona p1 = new Persona(nom, secso, edad, peso, altura);
        Persona p2 = new Persona(nom, secso, edad);
        p2.setPeso(107);
        p2.setAltura(1.84);
        Persona p3 = new Persona();
        p3.setNombre("Laura");
        p3.setSecso('M');
        p3.setEdad(18);
        p3.setPeso(40);
        p3.setAltura(1.60);
        
        System.out.println("Persona 1");
        System.out.println(p1.toString());
        mensajeideal(p1.calcularIMC());
        System.out.println("Persona 2");
        System.out.println(p2.toString());
        mensajeideal(p2.calcularIMC());
        System.out.println("Persona 3");
        System.out.println(p3.toString());
        mensajeideal(p3.calcularIMC());
        
    }

}
