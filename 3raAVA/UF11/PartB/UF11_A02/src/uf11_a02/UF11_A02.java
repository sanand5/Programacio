/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf11_a02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author sanand
 */
public class UF11_A02 {

    /**
     * @param args the command line arguments
     */
    public static void infoRuta(File ruta) throws FileNotFoundException {
        Set<String> dir = new TreeSet<>();
        Set<String> file = new TreeSet<>();
        boolean inf = false;
        if (ruta.exists()) {
            if (ruta.isDirectory()) {
                File[] listFiles = ruta.listFiles();
                for (File f : listFiles) {
                    if (f.isDirectory()) {
                        if (inf) {
                            Date d = new Date(f.lastModified());
                            dir.add("[*] " + f.getName() + " " + f.length() + "  " + d + "  ");
                        }else dir.add("[*] " + f.getName());
                    }
                }
                for (File f : listFiles) {
                    if (f.isFile()) {
                        if (inf) {
                            Date d = new Date(f.lastModified());
                            file.add("[A] " + f.getName() + " " + f.length() + "  " + d + "  ");
                        }else file.add("[A] " + f.getName());
                    }
                }
                for (String d : dir) {
                    System.out.println(d);
                }
                for (String f : file) {
                    System.out.println(f);
                }
            } else if (ruta.isFile()) {
                if (inf) {
                    Date d = new Date(ruta.lastModified());
                    System.out.print(ruta.length() + "  " + d + "  ");
                }
                System.out.println(ruta.getName());
            }
        } else {
            throw new FileNotFoundException();
        }
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
