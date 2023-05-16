/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf11_a03;

import java.io.File;

/**
 *
 * @author Andreuet
 */
public class UF11_A03 {

    /**
     * @param args the command line arguments
     */
    public static void llevarExtensio(File d) {
        for (File f : d.listFiles()) {
            f.renameTo(new File(f.getParent(),(String) f.getName().subSequence(0, f.getName().lastIndexOf("."))));
            
        }
    }
    public static void main(String[] args) {
//        File dir = new File("Documents");
//        dir.renameTo(new File("DOCS"));
//        
//        dir = new File("DOCS/Fotografies");
//        dir.renameTo(new File("DOCS/FOTOS"));
//        dir = new File("DOCS/FOTOS");
//        llevarExtensio(dir);
//        
//        dir = new File("DOCS/Llibres");
//        dir.renameTo(new File("DOCS/LECTURA"));
//        dir = new File("DOCS/LECTURA");
//        llevarExtensio(dir);

        File dir = new File("Documents/Fotografies");
        llevarExtensio(dir);
        dir.renameTo(new File("Documents/FOTOS"));
        
        dir = new File("Documents/Llibres");
        llevarExtensio(dir);
        dir.renameTo(new File("Documents/LECTURA"));
        
        dir = new File(dir.getParent());
        dir.renameTo(new File("DOCS"));
        dir = new File("DOCS"); //Opcional          
    }
}
