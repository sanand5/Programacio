/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf10_07;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class UF10_07 {

    /**
     * @param args the command line argumentsaaaaaaaa
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Gat> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Iteració nom: "+i);
                System.out.print("Nom del gat: ");
                String nom = sc.nextLine();
                System.out.print("Edat del gat: ");
                int edat = sc.nextInt();
                list.add(new Gat(nom, edat));
                sc.nextLine();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                sc.nextLine();
                i--;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            list.get(i).imprimir();
        }
    }
    
}
