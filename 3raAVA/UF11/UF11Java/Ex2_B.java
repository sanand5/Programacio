/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2;

import java.awt.Font;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author sanand
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Map<Integer,String> m = new HashMap<>();
        m.put(354, "Andreu Sanz");
        m.put(684, "Pau Sanz");
        m.put(954, "Ana Raquel");
        m.put(864, "Cristhian Rafael");
        System.out.println(m);
        System.out.println(m.get(354));
        System.out.println(m.get(154));
        System.out.println(m.entrySet());
        
        for (Map.Entry<Integer,String> lista : m.entrySet()) {
            System.out.println(lista);
        }
        
        System.out.println("");
        System.out.println("");
        m.entrySet().forEach(pareja -> System.out.println(pareja));
        System.out.println("");
        fun(m);
        
        System.out.println("");
        System.out.println("Codi\tNom");
        System.out.println("-----\t-------");
        m.entrySet().forEach(pareja -> {
            System.out.printf("%s \t%s ", pareja.getKey(),pareja.getValue());
            System.out.println("");
        });
        
        

        
    }
    
    public static void fun(Map<Integer,String> m) {
        System.out.println("Codi\tNom");
        System.out.println("-----\t-------");
        for (Map.Entry<Integer,String> lista : m.entrySet()) {
            System.out.printf("%s \t%s ", lista.getKey(),lista.getValue());
            System.out.println("");
        }
    }
}
