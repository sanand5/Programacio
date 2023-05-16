/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Andreuet
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        File book = new File("hola.txt");
            Scanner rc = new Scanner(book);
            System.out.println(rc.hasNextLine());
            System.out.println(rc.hasNextLine());
            System.out.println(rc.hasNextLine());
            System.out.println(rc.hasNextLine());
            System.out.println(rc.hasNextLine());
            System.out.println(rc.hasNextLine());
            System.out.println(rc.hasNextLine());
            System.out.println(rc.hasNextLine());
            
    }
    
}
