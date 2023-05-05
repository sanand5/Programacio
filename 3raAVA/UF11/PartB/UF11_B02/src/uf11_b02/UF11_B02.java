/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf11_b02;

import java.io.File;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author sanand
 */
public class UF11_B02 {

    /**
     * @param args the command line arguments
     */
     public static void imprimirTreeMap(TreeMap<Double, String> treeMap) {
        for (Map.Entry<Double, String> entry : treeMap.descendingMap().entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        File f = new File("DocumentsB/alumnes_notes.txt");
        try {
            Scanner sc = new Scanner(f);
            TreeMap<Double, String> mapa = new TreeMap<>();
            /*
            
            for (int i = 0; i < 10; i++) {
                if (sc.n) {
                    
                }
                String nombreCompleto = " - "+sc.next()+" - "+sc.next();
                int j = 0;
                double n=0;
                while (sc.hasNextInt()) {                 
                    int num = sc.nextInt();
                    n += num;
                    j++;
                }
                n = n/j;                         
                mapa.put(n, nombreCompleto);
            }
            */
            while (sc.hasNextLine()) {
                String tot = sc.nextLine();
                if (tot.matches("^(\\S+\\s+){2,}\\S+$")) {
                    String[] tots = tot.split(" ");
                    double n = 0;
                    for (int i = 2; i < tots.length ; i++) {
                        
                    }
                    /*
                    
                    int j = 0;
                    double n=0;
                    while (sc.hasNextInt()) {                 
                        int num = sc.nextInt();
                        n += num;
                        j++;
                    }
                    n = n/j;                         
                    mapa.put(n, nombreCompleto);
                    */
                    
                }
            }
            //cadena.matches("^(\\S+\\s+){2,}\\S+$")
            imprimirTreeMap(mapa);
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
