/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf11_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class UF11_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Map<String,String> m = new HashMap<>();
        m.put("Andreu Sanz", "ELPANAROBOCOP");
        m.put("Pau", "0000");
        m.put("Ana Raquel", "2004Rivas_#");
        m.put("Cristhian Rafael", "Holamm00**0804**0804**Punto.BarraBaja_Asterisco*");
        for (int i = 0; i < 3; i++) {
            System.out.print("Log?");
            String log = sc.nextLine();
            System.out.print("Pass?");
            String pass = sc.nextLine();
            if (m.containsKey(log)) {
                if (m.get(log).equals(pass)) {
                    System.out.println("Ha accedit a l'àrea restringida");
                    break;
                } else {
                    System.out.println("Contrasenya incorrecta");
                    
                }
            }else {
                System.out.println("L'usuari introduït no existeix");
            }
            System.out.println("Li queden "+Math.abs(i-2)+" oportunitats");
        }
        
    }
    
}
