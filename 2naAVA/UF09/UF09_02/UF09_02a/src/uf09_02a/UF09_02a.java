/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf09_02a;

import java.util.ArrayList;

/**
 *
 * @author sanand
 */
public class UF09_02a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Planeta p1 = new Planeta(0, 0, true, "nom", 0, 0, 0, 0, 0);
        Planeta p2 = new Planeta(0, 0, true, "nom", 0, 0, 0, 0, 0);
        Planeta p3 = new Planeta(0, 0, true, "nom", 0, 0, 0, 0, 0);
        Satelits s1 =new Satelits(0, 0, "nom", 0, 0, 0, 0, 0);
        Satelits s2 =new Satelits(0, 0, "nom", 0, 0, 0, 0, 0);
        Satelits s3 =new Satelits(0, 0, "nom", 0, 0, 0, 0, 0);
        p1.setSatelit(s1);
        p2.setSatelit(s2);
        p3.setSatelit(s3);
        ArrayList<Astres> Astres = new ArrayList<>();
        Astres.add(p1);
        Astres.add(p2);
        Astres.add(p3);
    }
    
}
