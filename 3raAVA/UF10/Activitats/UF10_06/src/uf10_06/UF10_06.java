/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf10_06;

import java.util.ArrayList;

/**
 *
 * @author sanand
 */
public class UF10_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Gat> list = new ArrayList<>();
        try {
            
            list.add(new Gat("Anna", 1));
            list.get(0).imprimir();
            
            list.add(new Gat("Raquel", 10));
            list.get(1).imprimir();
            
            list.add(new Gat("Andreu", -1));//
            list.get(2).imprimir();
            
            list.add(new Gat("Aa", 1));//
            list.get(3).imprimir();
            
            list.add(new Gat("Cristhian Rafael", 18));
            list.get(4).imprimir();
            
            
            list.get(1).setNom("ns");//
            list.get(1).imprimir();
            
            list.get(3).setNom("Hola");
            list.get(3).imprimir();
            
            list.get(3).setEdat(-3);//
            list.get(3).imprimir();
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
