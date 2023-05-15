/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf11_02;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author sanand
 */
public class UF11_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Map<String, String> dicMap = new HashMap<>();
        dicMap.put("manzana", "poma");
        dicMap.put("pera", "pera");
        dicMap.put("naranja", "taronja");
        dicMap.put("limón", "llimona");
        dicMap.put("plátano", "plàtan");
        dicMap.put("uva", "raïm");
        dicMap.put("fresa", "maduixa");
        dicMap.put("arándano", "blauet");
        dicMap.put("frambuesa", "framboesa");
        dicMap.put("piña", "pinya");
        dicMap.put("melón", "meló");
        dicMap.put("sandía", "síndria");
        dicMap.put("zanahoria", "pastanaga");
        dicMap.put("cebolla", "ceba");
        dicMap.put("ajo", "all");
        dicMap.put("pimiento", "pebrot");
        dicMap.put("tomate", "tomàquet");
        dicMap.put("patata", "patata");
        dicMap.put("maíz", "blat de moro");
        dicMap.put("judía", "mongeta");
        dicMap.put("guisante", "pèsol");
        dicMap.put("calabaza", "carabassa");
        ArrayList <String> dic = new ArrayList<>(dicMap.keySet());
        Set<Integer> Lnum = new HashSet<>();
        while (Lnum.size()<5) Lnum.add((int) (Math.random() * (Lnum.size() + 1)));
        for (int pos : Lnum) {
            System.out.println(dic.get(pos));
            System.out.print("traducció: ");
            if (dicMap.get(dic.get(pos)).equals(sc.nextLine())) {
                System.out.println("Correcte!");
            }else System.out.println("Resposta incorrecta. La resposta correcta és "+dicMap.get(dic.get(pos)));   
            
            
            
            
        }
        
    }
}
