/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf09_08;

import java.util.ArrayList;

/**
 *
 * @author sanand
 */
public class Llibres extends Elements {

    int ISBN;
    String editorial;
    final int DEFAULTISBN = 0000;
    ArrayList<Integer> ISBNs = new ArrayList<>();

    public Llibres(int ISBN, String editorial, String titol) {
        super(titol);
        comprobarISBN(ISBN);
        this.editorial = editorial;
    }

    public void comprobarISBN(int ISBN) {
        for (int i = 0; i < 10; i++) {
            if (ISBN == ISBNs.get(i)) {
                this.ISBN = DEFAULTISBN;
                break;
            }
        }
        if (this.ISBN != DEFAULTISBN) {
            this.ISBN = ISBN;
        }
    }
    
}
