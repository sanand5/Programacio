/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class Ex7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        File f = new File("Document.txt");
        Scanner rs = new Scanner(f);
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Valor num "+i+1+" del archiu "+f.getName()+" : "+rs.next());
        }
        rs.close();
        
    }
    
}
