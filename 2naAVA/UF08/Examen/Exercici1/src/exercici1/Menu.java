/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercici1;

import com.sun.source.tree.BreakTree;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class Menu {

    private final String titol;
    private String[] opcionsArray;

    public Menu(String titol, String[] opcionsArray) {
        this.titol = titol;
        this.opcionsArray = opcionsArray;

    }

    public Menu(String titol, Menu m1, Menu m2) {
        this.titol = titol;
        this.opcionsArray=new String[m1.opcionsArray.length+m2.opcionsArray.length];
        combinar(m1, m2);
    }

    private int mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println(this.titol);
        for (int i = 0; i < titol.length(); i++) {
            System.out.print("-");
        }
        System.out.println();
        for (int i = 0; i < opcionsArray.length; i++) {
            System.out.printf("%d. %s%n", i + 1, opcionsArray[i]);
        }
        System.out.println(this.opcionsArray.length+1+". Eixir");
        int opcio;
        do {
            System.out.print("?");
            opcio = sc.nextInt();
        } while (opcio < 0 || opcio > this.opcionsArray.length+1);
        return opcio;
    }

    public void triarOpcio() {
        do {
            int opcio = mostrarMenu();
            if (opcio <= this.opcionsArray.length) {
                System.out.println("Has triat la opcio " + opcio + " que és: " + opcionsArray[opcio - 1]);
            } else if (opcio == this.opcionsArray.length+1) {
                break;
            }
        } while (true);
    }

    public String[] combinar(Menu m1, Menu m2) {
        for (int i = 0; i < opcionsArray.length; i++) {
            if (i < m1.opcionsArray.length) {
                this.opcionsArray[i] = m1.opcionsArray[i];
            } else {
                this.opcionsArray[i] = m2.opcionsArray[i-m1.opcionsArray.length];
            }
        }
        return this.opcionsArray;
    }
}
