/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class Ex7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File f = new File("/home/sanand/Documents/1DAM/Programacio/3raAVA/UF11/PartA/Ex8/Enters.txt");
        try {
            Scanner rs = new Scanner(f);
            for (int i = 0; i < 10; i++) {
                try {
                    System.out.println("Valor num "+(i+1)+" del archiu "+f.getName()+" : "+rs.nextInt());
                } catch (InputMismatchException e) {
                    System.out.println("***Err : No es un número");
                    rs.next();
                    i--;
                }
            }
            rs.close();
        } catch (FileNotFoundException e) {
            System.out.println("***Err : Ruta incorrecta");
        } catch (NoSuchElementException e){
            System.out.println("***Err : No se encuentran elementos");
        } catch (Exception e){
            System.out.println("***Err : No se que pasa tio");
        }
    }
}
