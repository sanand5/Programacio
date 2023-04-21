/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf11_02;

import java.util.Map;
import java.util.TreeMap;

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
        Map<String, String> m = new TreeMap<>();
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
        
        for (int i = 0; i < 4; i++) {
            int min = 0, max = m.size();
            int random = (int) (Math.random() * (max - min + 1) + min);
            System.out.println(m.get(random));
            
        }

    }

}
