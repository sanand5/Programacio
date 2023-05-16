/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf11_b05;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class UF11_B05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new File("Diccionari").mkdir();
        
        for (char i = 'A'; i <= 'Z'; i++) {
            try {
                Scanner sc = new Scanner(new File ("DocumentsB/diccionari.txt"));
                FileWriter fw = new FileWriter(new File ("Diccionari/"+i+".txt"), true);
                while (sc.hasNextLine()) {
                    String line = sc.nextLine();
                    if (line.toUpperCase().charAt(0)==i) {
                        fw.write(line+"\n");
                    }
                }
                System.out.println(i + " escrit correctament");
                sc.close();
                fw.close();
            } catch (IOException e) {
                System.out.println("***Err : IOException");
            }       
        }
    }
}
