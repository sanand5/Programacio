/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extrauprojectes;

import static extrauprojectes.estadistiques.estadistiques;
import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Andreuet
 */
public class pimillion {
    public static void main(String[] args) {
        String num = "123685446584";
        File f = new File("/Users/Andreuet/Documents/1DAM/Programacio/3raAVA/extrauprojectes/DocumentsB/pi-million.txt");
        try {
            Scanner sc = new Scanner(f);
            String pi = sc.nextLine().substring(2);
            for (int i = 0; i < pi.length()-num.length(); i++) {
                if (num.equals(pi.substring(i, i+num.length()))) {
                    System.out.println(true);
                    break;
                }
                
            }
            
            
        } catch (Exception e) {
        }
    }
}
