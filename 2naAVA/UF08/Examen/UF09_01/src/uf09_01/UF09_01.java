/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf09_01;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author sanand
 */
public class UF09_01 {

    /**
     * @param args the command line arguments
     */
    
    public static void iterator(ArrayList aliments) {
        Iterator iter = aliments.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Aliment a1 = new Aliment("Botifarra", 3);
        Aliment a2 = new Aliment("Pate", 2);
        Aliment a3 = new Aliment("Gos", 1);
        Aliment a4 = new Aliment("Pasta de dents", 8);
        Aliment a5 = new Aliment("Raquel", 2);
        
        ArrayList <Aliment> aliments = new ArrayList();
        aliments.add(a1);
        aliments.add(a2);
        aliments.add(a3);
        aliments.add(a4);
        aliments.add(a5);
        
        System.out.println("--Iterator--");
        iterator(aliments);
        aliments.remove(4);
        aliments.remove(3);
        Aliment a6 = new Aliment("Crihstian", 2);
        aliments.add(1, a6);
        
        System.out.println("\n--Nou--");
        iterator(aliments);
        aliments.clear();
        if (aliments.isEmpty()) {
            System.out.println("\nNothing to commit");
        }
        
    }
    
}
