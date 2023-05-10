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
public class UF11_B07 {

    public static void estadistiques(String path) {
        final int FIRST = 10;
        Scanner sc = new Scanner(System.in);
        File f = new File("DocumentsB/Llibres/"+path);
        Scanner rc = null;
        try {
            rc = new Scanner(f);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

        int nLines = 0;
        int nWords = 0;
        int nCharacters = 0;
        ArrayList<String> doc = new ArrayList<>();
        Set<String> noRpt = new HashSet<>();
        Map<String, Integer> pdm = new TreeMap<>();
        while (rc.hasNextLine()) {
            nLines++;
            String[] words = rc.nextLine().split(" ");

            nWords += words.length;
            for (String wrd : words) {
                doc.add(wrd);
                noRpt.add(wrd);
                String[] chr = wrd.split("");
                nCharacters += chr.length;
            }

        }
        for (String str : noRpt) {
            pdm.put(str, Collections.frequency(doc, str));
        }
        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(pdm.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        System.out.println("Llibre : " + f.getName());
        System.out.println("Línies totals : " + nLines);
        System.out.println("Nombre de paraules : " + nWords);
        System.out.println("Nombre de caracters : " + nCharacters);
        System.out.println("Les "+FIRST+" paraules mes comunes són : \n");
        System.out.printf("%15s%20s%n", "Paraules", "Vegades");

        for (int i = 0; i < FIRST; i++) {
            System.out.printf(" %-30s%-20s%n", list.get(i).getKey(), list.get(i).getValue());
        }
        sc.close();
        rc.close();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        File llibres = new File ("DocumentsB/Llibres");
        String[] llibre = llibres.list();
        for (String llibre1 : llibre) {
            estadistiques(llibre1);
        }
    }
}
