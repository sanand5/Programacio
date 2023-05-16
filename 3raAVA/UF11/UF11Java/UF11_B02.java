 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf11_b02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class UF11_B02 {

    /**
     * @param list
     */
     public static void imprimirArrayList(ArrayList<String> list) {
         for (String str : list) {
             System.out.println(str);
         }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        File f = new File("DocumentsB/alumnes_notes.txt");
        try {
            Scanner sc = new Scanner(f);
            ArrayList<String> mitja = new ArrayList<>();
            
            while (sc.hasNextLine()) {
                String tot = sc.nextLine();
                try {
                    if (tot.matches("^(\\S+\\s+){2,}\\S+$")) {
                        String[] alumne = tot.split(" ");
                        double num = 0;
                        for (int i = 2; i < alumne.length ; i++) {
                            num+=Integer.parseInt(alumne[i]);
                        }
                        num /= alumne.length-2;
                        mitja.add(String.format("%.2f - %7s - %s", num, alumne[0], alumne[1]));
                    }else {
                        throw new Exception("*** Err : format incorrecte");
                    }                   
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            Collections.sort(mitja, Collections.reverseOrder());
            imprimirArrayList(mitja);
            
            
        } catch (FileNotFoundException | NumberFormatException e) {
            System.out.println(e);
        }
    }
    
}
