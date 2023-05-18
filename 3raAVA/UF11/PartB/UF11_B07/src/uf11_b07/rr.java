/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf11_b07;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
/**
 *
 * @author Andreuet
 */
public class rr {

    /**
     * Realitza els calculs per a obtindre les estadistiques de un archiu i mostra les dades
     * @param path fa referencia a la ruta del archiu que es vol fer el reconter
     * @throws java.io.FileNotFoundException
     * @throws Exception
     * <ul>
     * <li>Si el archivo esta vacio.</li>
     * <li>Si el archivo no tiene mas de 10 palabras diferentes.</li>
     * </ul>
     */
    public static void estadistiques(String path) throws FileNotFoundException, Exception {
        final int FIRST = 10;
        int nLines = 0, nWords = 0, nCharacters = 0;
        File book = new File("DocumentsB/Llibres/" + path);
        Scanner rc = new Scanner(book);
        ArrayList<String> doc = new ArrayList<>();      // ArrayList de tot el document separat per paraules
        Set<String> noRpt = new HashSet<>();            // HashSet de paraules sense repetir

        if (!rc.hasNextLine()) {
            throw new Exception("***Err : The file is empty");
        }
        while (rc.hasNextLine()) {      // Reconta les paraules, linies i caracters
            nLines++;
            String[] words = rc.nextLine().split(" ");
            nWords += words.length;
            for (String wrd : words) {  // Reconta caracters 
                doc.add(wrd);
                nCharacters += wrd.length();
            }
        }
        noRpt.addAll(doc);
        if (noRpt.size() < FIRST) {
            throw new Exception("***Err : It is necessary that the file has at least " + FIRST + " words");
        }

        System.out.println("Llibre : " + book.getName());
        System.out.println("Línies totals : " + nLines);
        System.out.println("Nombre de paraules : " + nWords);
        System.out.println("Nombre de caracters : " + nCharacters);
        top10(noRpt, doc, FIRST);
        rc.close();
    }

    /**
     * Calcula el numero de vegades que es repetixe les paraules, les ordena en ordre ascendent i les mostra.
     * @param noRpt fa referencia a un Set de les paraules del archiu sense repetir-se
     * @param doc fa referencia a un ArrayList amb totes les paraules del document
     * @return List de maps que esta ordenada de major a menor
     */
    private static void top10(Set<String> noRpt, ArrayList<String> doc, int FIRST) {
        ArrayList<String> listStr = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(0);
            listStr.add("");

        }
        for (String str : noRpt) {
            int rpt = Collections.frequency(doc, str);
            for (int i = 0; i < 10; i++) {
                if (list.get(i)<rpt) {
                    list.add(i, rpt);
                    listStr.add(i, str);
                    break;
                }
            }
            
            
        }

        System.out.println("Les " + FIRST + " paraules mes comunes són: \n");
        System.out.printf("\t%-10s\t%-10s%n", "Paraules", "Vegades");
        for (int i = 0; i < FIRST; i++) {
            System.out.printf("\t'%-8s\t%-10s%n", listStr.get(i) + "'", list.get(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        File llibres = new File("DocumentsB/Llibres");
        try {
            String[] llibre = llibres.list();
            for (String llibre1 : llibre) {
                try {
                    estadistiques(llibre1);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
