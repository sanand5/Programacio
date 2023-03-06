/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf09_marc;

import java.util.ArrayList;

/**
 *
 * @author sanand
 */
public class Biblioteca {
    String nom;
    String ciutat;
    ArrayList <Element> llista = new ArrayList<Element>();

    public Biblioteca(String nom, String ciutat) {
        this.nom = nom;
        this.ciutat = ciutat;
    }
    
    public void afegir(Element... e) {
        for (int i = 0; i < e.length; i++) {
            llista.add(e[i]);
        }
    }
    
    public void eliminar(Element... e) {
        for (int i = 0; i < e.length; i++) {
            llista.remove(e[i]);
        }
    }
    
    public void eliminar(int a) {
        llista.remove(a);
    }
    
    public void canviar(Element e, Biblioteca b) {// mes d'un
        this.llista.remove(e);
        b.llista.add(e);
    }
    
    public void mostrarTot() {
        
    }
    
}
