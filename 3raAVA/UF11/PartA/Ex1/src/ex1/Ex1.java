/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author sanand
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Set<String> s = new HashSet<String>();
        s.add("Dell");
        s.add("HP");
        s.add("Apple");
        s.add("Acer");
        s.add("Asus");
        s.add("Samsung");
        s.add("Asus");
        System.out.println("Hola");
        for (String temp : s) {
            System.out.println(temp);
        }
        System.out.println("");
        System.out.println("Que tal");
        System.out.println("");
        s.add("Lenovo");
        for (String temp : s) {
            System.out.println(temp);
        }
    }
    
}
