/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf09_01;

/**
 *
 * @author sanand
 */
public class Aliment {
    private String nom;
    private int quantitat;

    public Aliment(String nom, int quantitat) {
        this.nom = nom;
        this.quantitat = quantitat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getQuantitat() {
        return quantitat;
    }

    public void setQuantitat(int quantitat) {
        this.quantitat = quantitat;
    }

    @Override
    public String toString() {
        return "Aliment{" + "nom=" + nom + ", quantitat=" + quantitat + '}';
    }
    
    
}
