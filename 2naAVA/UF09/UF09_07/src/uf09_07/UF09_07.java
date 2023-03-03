/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf09_07;

import java.util.ArrayList;

/**
 *
 * @author sanand
 */
public class UF09_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<IFigura2D> list = new ArrayList<>();
        list.add(new Quadrat(2));
        list.add(new Rectangle(2, 3));
        list.add(new Cercle(3));
        list.add(new Triangle(2, 3));
        
        System.out.println("");
        System.out.println("   -- Llista normal --");
        for (int i = 0; i < list.size(); i++) {
            list.get(i).imprimir();
            list.get(i).equals(2);
        }
        System.out.println("   -- Llista x2 --");
        for (int i = 0; i < list.size(); i++) {
            list.get(i).imprimir();
            list.get(i).equals(0.5);
        }
        System.out.println("   -- Llista x0.5 --");
        for (int i = 0; i < list.size(); i++) {
            list.get(i).imprimir();
        }
        
        
    }
    
}
