/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf11_03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class UF11_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final String CODIDESCOMPTE="ECODTO";
        boolean des = false;
        double total=0;
        Scanner sc = new Scanner(System.in);
        Map<String,Double> inventari = new HashMap<>();
        Map<String,Integer> cesta = new HashMap<>();
        inventari.put("avena", 2.21);
        inventari.put("cigrons", 2.39);
        inventari.put("tomaca", 1.59);
        inventari.put("gingebre", 3.13);
        inventari.put("quinoa", 4.5);
        inventari.put("faves", 1.6);
        String prod;
        
        while (true) {
            System.out.print("Prducte: ");
            prod = sc.nextLine();
            if (prod.equalsIgnoreCase("end")) break;
            if (!inventari.containsKey(prod)) {
                System.out.println("Nop");
            }else {
                System.out.print("Cant: ");
                int cant = Integer.parseInt(sc.nextLine());
                if (!cesta.containsKey(prod)) {
                    cesta.put(prod,cant);
                }else {
                    cesta.put(prod,cesta.get(prod)+cant);
                }
            }
        }
        System.out.print("Descompte? ");
        if (sc.nextLine().equals(CODIDESCOMPTE)) {
            des=true;
        }
        for (Map.Entry<String,Integer> c : cesta.entrySet()) {
            System.out.printf("%s \t %d \t %s \t %s",c.getKey(),c.getValue(),inventari.get(c.getKey()), c.getValue()*inventari.get(c.getKey()));
            System.out.println("");
            total += c.getValue()*inventari.get(c.getKey());
        }
        if (des) {
            double descompte = total-total*0.9;
            System.out.printf("Descompte : %.2f",descompte);
            System.out.println("");
        }
        System.out.printf("Total : %.2f",total);
        
        
        
        
        
    }
    
}
