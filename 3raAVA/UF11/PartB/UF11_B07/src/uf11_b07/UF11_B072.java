/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf11_b07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;


/**
 *
 * @author Andreuet
 */
public class UF11_B072 {

    /**
     * Realitza els calculs per a obtindre les estadistiques de un archiu
     * @param path fa referencia a la ruta del archiu que es vol fer el reconter
     */
    public static void estadistiques(String path) {
        final int FIRST = 10;
        Scanner sc = new Scanner(System.in);
        try {
            File book = new File("DocumentsB/Llibres/"+path);
            Scanner rc = new Scanner(book);
            if (!rc.hasNextLine()) throw new Exception("***Err : The file is empty");
            
            

            int nLines = 0;
            int nWords = 0;
            int nCharacters = 0;
            ArrayList<String> doc = new ArrayList<>();      // ArrayList de tot el document separat per paraules
            Set<String> noRpt = new HashSet<>();            // HashSet de paraules sense repetir
            while (rc.hasNextLine()) { // Reconta les paraules, linies i caracters
                nLines++;
                String[] words = rc.nextLine().split(" ");
                nWords += words.length;
                for (String wrd : words) { // Reconta caracters i clava les paraules en les llistes
                    doc.add(wrd);
                    noRpt.add(wrd);
                    String[] chr = wrd.split("");
                    nCharacters += chr.length;
                }
            }
            if (noRpt.size()<10) throw new Exception("***Err : It is necessary that the file has at least 10 words");

            String V[][] = top10(noRpt, doc);


            System.out.println("Llibre : " + book.getName());
            System.out.println("Línies totals : " + nLines);
            System.out.println("Nombre de paraules : " + nWords);
            System.out.println("Nombre de caracters : " + nCharacters);
            System.out.println("Les "+FIRST+" paraules mes comunes són : \n");
            System.out.printf("\t%s\t%s%n", "Paraules", "Vegades");
            
            for (int i = 0; i < V.length; i++) {
                System.out.printf("\t'%s'\t\t%s%n", V[i][1], V[i][0]);
            }
            sc.close();
            rc.close();
        } catch (FileNotFoundException e) {
            System.out.println("****Err : Incorrect path");
        } catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    /**
     * Calcula el numero de vegades que es repetixe les paraules i les ordena en ordre ascendent 
     * @param noRpt fa referencia a un Set de les paraules del archiu sense repetir-se
     * @param doc fa referencia a un ArrayList amb totes les paraules del document
     * @return ArrayList de maps que esta ordenada de major a menor
     */
    public static String[][] top10(Set<String> noRpt, ArrayList<String> doc) {
        ArrayList<String> ordenat = new ArrayList<>();
        for (int i = 0; i < noRpt.size(); i++) {
            
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        File llibres = new File ("DocumentsB/Llibres");
        String[] llibre = llibres.list();
        estadistiques(llibre[7]);
        
        for (String llibre1 : llibre) {
            //estadistiques(llibre1);
            System.out.println(llibre1);
        }

        
    }
}
