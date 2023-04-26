/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4;

import java.io.File;

/**
 *
 * @author sanand
 */
public class Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File foto = new File("tmp/foto");
        File doc = new File("tmp/doc.txt");
        
        boolean mkdirFot = foto.mkdir();
        if (mkdirFot) {
            System.out.println(foto.getName() + mkdirFot);
        } else {
            boolean delCa = foto.delete();
            System.out.println(foto.getName() + delCa);
            boolean delAr = doc.delete();
            System.out.println(doc.getName() + delAr);
        }
    }
    
}
