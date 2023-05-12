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
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;


/**
 *
 * @author Andreuet
 */
public class UF11_B07_v2 {

    /**
     * Realitza els calculs per a obtindre les estadistiques de un archiu
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
        Scanner sc = new Scanner(System.in);
        File book = new File("DocumentsB/Llibres/"+path);
        Scanner rc = new Scanner(book);
        ArrayList<String> doc = new ArrayList<>();      // ArrayList de tot el document separat per paraules
        Set<String> noRpt = new HashSet<>();            // HashSet de paraules sense repetir
        
        if (!rc.hasNextLine()) throw new Exception("***Err : The file is empty");
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
        List<Map.Entry<String, Integer>> podium = top10(noRpt, doc);
        
        System.out.println("Llibre : " + book.getName());
        System.out.println("Línies totals : " + nLines);
        System.out.println("Nombre de paraules : " + nWords);
        System.out.println("Nombre de caracters : " + nCharacters);
        System.out.println("Les "+FIRST+" paraules mes comunes són: \n");
        System.out.printf("\t%-10s\t%-10s%n", "Paraules", "Vegades");
        for (int i = 0; i < FIRST; i++) {
            System.out.printf("\t'%-8s\t%-10s%n", podium.get(i).getKey()+"'", podium.get(i).getValue());
        }
        System.out.println();
        sc.close();
        rc.close();  
    }
    
    /**
     * Calcula el numero de vegades que es repetixe les paraules i les ordena en ordre ascendent 
     * @param noRpt fa referencia a un Set de les paraules del archiu sense repetir-se
     * @param doc fa referencia a un ArrayList amb totes les paraules del document
     * @return List de maps que esta ordenada de major a menor
     */
    public static List<Map.Entry<String, Integer>> top10(Set<String> noRpt, ArrayList<String> doc) {
        Map<String, Integer> contRpt = new TreeMap<>(); // Mapa de paraules + vegades repetit
        for (String str : noRpt) {
            contRpt.put(str, Collections.frequency(doc, str));
        }
        ArrayList<Map.Entry<String, Integer>> ranking = new ArrayList<>(contRpt.entrySet());
        ranking.sort(Map.Entry.comparingByValue(Collections.reverseOrder()));
        return ranking.subList(0, 10);
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        File llibres = new File ("DocumentsB/Llibres");
        try {
            String[] llibre = llibres.list();
            for (String llibre1 : llibre) {
                try {
                    estadistiques(llibre1);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (NullPointerException e){
            System.out.println("*** Err : NullPointerException");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
