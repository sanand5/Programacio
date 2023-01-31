/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiniela;

import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class Quiniela {

    /**
     * @param args the command line arguments
     */
    public static void partits(int npartits, String[][] noms, int[][] gols) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < npartits; i++) {
            System.out.print("Disme el NOM del equip LOCAL en el partit "+(i+1)+":");
            noms[i][0] = sc.nextLine();
            System.out.print("Disme el NOM del equip VISITANT en el partit "+(i+1)+":");
            noms[i][1] = sc.nextLine();
            System.out.print("Disme els GOLS del equip LOCAL en el partit "+(i+1)+":");
            gols[i][0] = sc.nextInt();
            System.out.print("Disme els GOLS del equip VISITANT en el partit "+(i+1)+":");
            gols[i][1] = sc.nextInt();
            sc.nextLine();
            System.out.println();
        }
    }
    public static void quiniela(int npartits, String[][] noms, int[][] gols) {
        System.out.println("""
                           ###  QUINIELA DE LA JORNADA  ###
                           --------------------------------""");
        char c;
        for (int i = 0; i < npartits; i++) {
            if (gols[i][0]>gols[i][1]) {
                c='1';
            } else if(gols[i][0]<gols[i][1]) {
                c='2';
            }else c='X';
            
            System.out.printf("%-22s - %-20s :%s%n",noms[i][0], noms[i][1], c);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre de partits de la jornada: ");
        int npartits = sc.nextInt();
        String equips[][] = new String[npartits][2];
        int resultats[][] = new int[npartits][2];
        partits(npartits, equips, resultats);
        quiniela(npartits, equips, resultats);
    }
}

