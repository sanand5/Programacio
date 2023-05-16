/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author sanand
 */
public class Ex8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
        File f = new File("Enters.txt");
        try {
            FileWriter wr = new FileWriter(f, false);
            int n=1;
            for (int i = 0; i < 20; i++) {
                n*=2;
                wr.write(""+n+"\n");
            }
            System.out.println("Fitxer escrit correctaent");
            wr.close();
        } catch (IOException e) {
            System.out.println(e);
        } catch (Exception e){
            System.out.println(e);
            
        }
        
        
        
    }
    
}
