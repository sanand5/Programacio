/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemples;

/**
 *
 * @author sanand
 */
public class Producte {
    private String nom;
    private int quantitat;
    
    public Producte(String nom, int quantitat) {
        this.nom = nom;
        this.quantitat = quantitat;
    }
    
    public Producte() {
        this.nom = nom;
        this.quantitat = quantitat;
    }

    public String getNom() {
        return nom;
    }

    public int getQuantitat() {
        return quantitat;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setQuantitat(int quantitat) {
        this.quantitat = quantitat;
    }
    
    
    
}
