/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1;

import java.io.File;

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
        File A = new File("/home/sanand/Documents/1DAM/Programacio/3raAVA/UF11/PartB/Ex1/ruta/");
        File A2 = new File("/home/sanand/Documents/1DAM/Programacio/3raAVA/UF11/PartB/Ex1/ruta/fitxer.txt");
        File R = new File("ruta/");
        File R2 = new File("ruta/fitxer.txt");
        
        fun(A);
        fun(A2);
        fun(R);
        fun(R2);
        
    }
    public static void fun(File f) {
        System.out.println("");
        System.out.print("Ruta: \t\t");
        System.out.println(f.getParent());
        System.out.print("Nom: \t\t");
        System.out.println(f.getName());
        System.out.print("Ruta absoluta: \t");
        System.out.println(f.getAbsolutePath());
        
    }
    
}
