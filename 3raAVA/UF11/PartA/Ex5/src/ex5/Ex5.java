/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex5;

import java.io.File;

/**
 *
 * @author sanand
 */
public class Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File fotos= new File("tmp/fotos");
        File Backup=new File("tmp/backup/Fotografies"); 
        File pic1=new File("tmp/backup/Fotografies/Pic1.png");
        File nuevo=new File("tmp/backup/Fotografies/Pic1.png");
        fotos.renameTo(Backup); 
        pic1.renameTo(nuevo);
        
        System.out.println("fotos: "+fotos.getAbsolutePath());
      
        
       }
}
    
