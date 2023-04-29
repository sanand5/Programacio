/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf11_b01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class UF11_B01 {

    /**
     * @param args the command line arguments
     */
    public static void infoRuta(File ruta) throws FileNotFoundException {
        if (ruta.isDirectory()) {
                File[] listFiles = ruta.listFiles();
                for (File f : listFiles) {
                    if (f.isDirectory()) {
                        System.out.println("[*] "+f.getName());
                    }
                }
                for (File f : listFiles) {
                    if (f.isFile()) {
                        System.out.println("[A] "+f.getName());
                    }
                }
                
            } else if (ruta.isFile()){
                System.out.println(ruta.getName());
        }else throw new FileNotFoundException();
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        while (true) {            
            System.out.print("Ruta?");
            String rutaString = sc.nextLine();
            File ruta = new File(rutaString);
            if ("".equals(rutaString)) {
                break;
            }
            try {
                infoRuta(ruta);
            } catch (FileNotFoundException e) {
            System.out.println(e);
            }
        }
    }
}
