/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3;

import java.awt.Font;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class Ex3 {

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
        System.out.print("n?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (!m.containsKey(n)) {
            System.out.println("No");
        }else System.out.printf("El codi %d correspon a %s", n, m.get(n));
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
