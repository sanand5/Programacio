/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package uf09_02casa;

// @author sanzs

import java.util.ArrayList;
import java.util.Scanner;


public class UF09_02CASA {
    public static void main(String[] args) {
        Planeta p1=new Planeta(0, 365, "MiCasa", 0, 24, 0, 14, 9.81);
        Planeta p2=new Planeta(0, 88, "Mercuri", 0, 0, 0, 167, 3.7);
        Planeta p3=new Planeta(0, 687, "Marte", 0, 0, 0, -63, 3.71);
        Planeta Jupiter=new Planeta(0, 0, "Jupiter", 11737.1, 23.3, 0, 0, 0);
        Satelite s1=new Satelite(384400, 27.3, p1, "Luna", 0, 0.745, 0, -23, 1.62);
        Satelite s2=new Satelite(33456, 3, p2, "Mimas", 11, 0.99, 0, 06, 9);
        Satelite s3=new Satelite(9676, 3, p2, "Despina", 40, 0.9867, 0, 023, 9.1);
        Satelite s4=new Satelite(9378,  0.31875, p3, "Fobos", 11.1, 0.31875, 0, -30, 0.0057);
        Satelite s5=new Satelite(23460, 1.26375, p3, "Deimos", 6.2, 1.26375, 0, -50, 0.003);
        ArrayList<Satelite> MiCasa = new ArrayList<>(); MiCasa.add(s1); p1.setS(MiCasa);
        ArrayList<Satelite> Mercuri = new ArrayList<>(); Mercuri.add(s2); Mercuri.add(s3); p2.setS(Mercuri);
        ArrayList<Satelite> Marte = new ArrayList<>(); Marte.add(s2); Marte.add(s3);Marte.add(s5); p3.setS(Marte);
        ArrayList<Astre> astres = new ArrayList<>();
        astres.add(p1);
        astres.add(p2);
        astres.add(p3);
        astres.add(s1);
        astres.add(s2);
        astres.add(s4);
        astres.add(s5);
        astres.add(new Satelite(0, 0, "Miranda", 0, 0, 0, 0, 0) );
        ArrayList<Satelite> SJupiter = new ArrayList<>();
        SJupiter.add(new Satelite(0, 0, Jupiter, "Europa", 0, 0, 0, 0, 0));
        SJupiter.add(new Satelite(0, 0, Jupiter, "Genamides", 0, 0, 0, 0, 0));
        Jupiter.setS(SJupiter);
        astres.add(Jupiter);
        astres.add(SJupiter.get(0));
        astres.add(SJupiter.get(1));
        Planeta Jupiter2=new Planeta(0, 0, "Jupiter2", 0, 0, 0, 0, 0);
        Jupiter2.setS(SJupiter);
        astres.add(Jupiter2); 
        menu(astres);
    }
    public static void menu(ArrayList<Astre> astres) {
        do {
            for (int i = 1; i <= astres.size(); i++) {
                System.out.printf("%d. %s\n", i, astres.get(i-1).getNom());
            }
            System.out.print("?");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            if (a==0) {
                break;
            }
            astres.get(a-1).mostrar();
        } while (true);
    }

}
