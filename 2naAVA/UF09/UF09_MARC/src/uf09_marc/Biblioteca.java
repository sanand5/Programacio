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
    private String nom;
    private String ciutat;
    private ArrayList <Elements> llista = new ArrayList<Elements>();

    public Biblioteca(String nom, String ciutat, Elements... e) {
        this.nom = nom;
        this.ciutat = ciutat;
        for (int i = 0; i < e.length; i++) {
            llista.add(e[i]);
        }
    }
    
    public void afegir(Elements... e) {
        for (int i = 0; i < e.length; i++) {
            llista.add(e[i]);
        }
    }
    
    public void eliminar(Elements... e) {
        for (int i = 0; i < e.length; i++) {
            llista.remove(e[i]);
        }
    }
    
    public void eliminar(int... a) {
        llista.remove(a);
        for (int i = 0; i < a.length; i++) {
            llista.remove(a[i]);
        }
    }
    
    public void canviar(Biblioteca b, Elements... e) {
        for (int i = 0; i < e.length; i++) {
            this.llista.remove(e[i]);
            b.llista.add(e[i]);
        }
        
        
    }
    
    public void mostrarTot() {
        System.out.println("-- "+ nom +" --");
        for (int i = 0; i < llista.size(); i++) {
            llista.get(i).mostrar();
        }
    }
    
    public void mostrarDisponibles() {
        for (int i = 0; i < llista.size(); i++) {
            if (llista.get(i).getU() == null) {
                llista.get(i).mostrar();
            }
        }
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCiutat() {
        return ciutat;
    }

    public void setCiutat(String ciutat) {
        this.ciutat = ciutat;
    }

    public ArrayList <Elements> getLlista() {
        return llista;
    }

    public void setLlista(ArrayList <Elements> llista) {
        this.llista = llista;
    }
    
    
    
}

/*
Iterator
casting
*/
