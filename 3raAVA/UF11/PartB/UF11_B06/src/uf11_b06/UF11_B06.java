/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf11_b06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class UF11_B06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Scanner sf = new Scanner(new File ("DocumentsB/pi-million.txt"));
            Scanner sc = new Scanner(System.in);
            System.out.print("n? ");
            String sec = sc.nextLine();
            //String sec = "1415";
            String piDec = " "+sf.nextLine().substring(2);
            boolean trobat = false;
            /*
            //Dona error ns perq
            int i=0;
            while (i<piDec.length()-sec.length() || trobat) {
                //System.out.println(piDec.substring(i, i+sec.length()));
                if (sec.equals(piDec.substring(i, i+sec.length()))) {
                    trobat = true;
                }
                i++;
            }*/
            
            
            for (int i = 0; i < piDec.length()-sec.length(); i++) {
                if (sec.equals(piDec.substring(i, i+sec.length()))) {
                    trobat = true;
                    break;
                }
            }
            System.out.println(trobat);
            
            sc.close();
            sf.close();
        } catch (FileNotFoundException e) {
            System.out.println("**Err : FileNotFoundException");
        } catch (NoSuchElementException e) {
            System.out.println("**Err : NoSuchElementException");
        }
    }
    
}
