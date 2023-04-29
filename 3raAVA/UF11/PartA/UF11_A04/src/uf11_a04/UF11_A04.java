/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf11_a04;

import java.io.File;

/**
 *
 * @author Andreuet
 */
public class UF11_A04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        File dir = new File("Documents/LesMesuesCoses");
        dir.mkdir();
        dir = new File("Documents/Alfabet"); 
        dir.mkdir();
        
        dir = new File("Documents/Fotografies");
        dir.renameTo(new File("Documents/LesMesuesCoses",dir.getName()));
        dir = new File("Documents/Llibres");
        dir.renameTo(new File("Documents/LesMesuesCoses",dir.getName()));
        
        
        for (int i = 65; i <= 90; i++) {
            dir = new File("Documents/Alfabet", String.valueOf((char)i)); 
            dir.mkdir();
            
        }
    }
    
}
