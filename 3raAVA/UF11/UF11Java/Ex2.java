/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2;

import java.io.File;

/**
 *
 * @author sanand
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File fitxer = new File("doc.txt");
        File direc = new File("Fotos");
        File noexixt = new File("Foto");
        mostrarEstat(fitxer);
        mostrarEstat(direc);
        mostrarEstat(noexixt);
        
    }
    public static void mostrarEstat(File f) {
        System.out.println("L'archiu : "+f.getAbsolutePath()+" existeix? "+f.isFile());
        System.out.println("L'archiu : "+f.getAbsolutePath()+" existeix? "+f.isDirectory());
        System.out.println("");
        
    }
    
}
