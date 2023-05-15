/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dosarxiusuno;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class DosArxiusUno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File noms = new File ("/home/sanand/Documents/1DAM/Programacio/3raAVA/UF11/Examen/noms.txt");
        File frases = new File ("/home/sanand/Documents/1DAM/Programacio/3raAVA/UF11/Examen/frases.txt");
        try {
            Scanner scNoms = new Scanner(noms);
            Scanner scFrases = new Scanner(frases);
            Scanner sc = new Scanner(System.in);
            FileWriter resultat = new FileWriter(new File("resultat.txt"), true);
            System.out.print("Numero de línies combinades : ");
            int lines = sc.nextInt();
            if (lines<0) {
                throw new ExcepcioNombreCombinacionsIncorrecte(lines);
            }
            for (int i = 0; i < lines; i++) {
                try {
                    String nom = scNoms.nextLine()+"\n";
                    resultat.write(nom);
                    String frase = scFrases.nextLine()+"\n";
                    resultat.write(frase);
                } catch (NoSuchElementException e) {
                }
            }
            resultat.close();
            sc.close();
            scNoms.close();
            
        } catch (IOException e) {
            System.out.println("***Err: He tingut problemes en la lectura o escritura de l'archiu");
        } catch (InputMismatchException e) {
            System.out.println("***Err: Has d'introduir un enter");
        } catch (ExcepcioNombreCombinacionsIncorrecte e) {
            System.out.println(e);
        }
        
    }
    
}
