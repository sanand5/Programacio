/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3;

import java.io.File;
import java.util.Date;

/**
 *
 * @author sanand
 */
public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File fitxer = new File("build.xml");
        File direct = new File("build");
        Date d = new Date(fitxer.lastModified());
        Date d2 = new Date(direct.lastModified());
        System.out.println(d);
        System.out.println(d2);
        System.out.println(fitxer.length());
        
    }
    
}

