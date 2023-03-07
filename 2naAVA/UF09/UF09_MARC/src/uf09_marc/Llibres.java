/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf09_marc;

import java.util.ArrayList;

/**
 *
 * @author sanzs
 */
public class Llibres extends Elements{
    int ISBN;
    String editorial;
    final int DEFAULTISBN = 0000;
    static ArrayList<Integer> ISBNs = new ArrayList<>();

    public Llibres(int ISBN, String editorial, String titol) {
        super(titol);
        comprobarISBN(ISBN);
        this.editorial = editorial;
    }

    public void comprobarISBN(int ISBN) {
        this.ISBN = ISBN;
        for (int i = 0; i < ISBNs.size(); i++) {
            if (this.ISBN == ISBNs.get(i)) {
                this.ISBN = DEFAULTISBN;
                break;
            }
        }
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println(ISBN);
        System.out.println(editorial);
    }

    @Override
    void fun() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
