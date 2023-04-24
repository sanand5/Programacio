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
        Map<String, String> m = new HashMap<>();
        m.put("manzana", "poma");
        m.put("pera", "pera");
        m.put("naranja", "taronja");
        m.put("limón", "llimona");
        m.put("plátano", "plàtan");
        m.put("uva", "raïm");
        m.put("fresa", "maduixa");
        m.put("arándano", "blauet");
        m.put("frambuesa", "framboesa");
        m.put("piña", "pinya");
        m.put("melón", "meló");
        m.put("sandía", "síndria");
        m.put("zanahoria", "pastanaga");
        m.put("cebolla", "ceba");
        m.put("ajo", "all");
        m.put("pimiento", "pebrot");
        m.put("tomate", "tomàquet");
        m.put("patata", "patata");
        m.put("maíz", "blat de moro");
        m.put("judía", "mongeta");
        m.put("guisante", "pèsol");
        m.put("calabaza", "carabassa");
        ArrayList <String> dic = new ArrayList<>(m.keySet());
        Set<Integer> n = new HashSet<>();
        while (n.size()<5) n.add((int) (Math.random() * (n.size() - 1 + 1) + 1));
        for (int i = 0; i < 4; i++) {
            System.out.println(m.get(n));
            if (m.get(random).contains(sc.nextLine())) {
                System.out.println("Correcte!");
            }else System.out.println("Resposta incorrecta. La resposta correcta és "+m.entrySet().toString());   
        }
    }
}
