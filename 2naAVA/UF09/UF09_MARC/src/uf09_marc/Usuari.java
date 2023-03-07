/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf09_marc;

/**
 *
 * @author sanand
 */
public class Usuari {

    private String nom;
    private String ciutat;
    private static int nusuaris=0;

    public Usuari(String nom, String ciutat) {
        this.nom = nom;
        this.ciutat = ciutat;
        nusuaris++;
    }
    
    public static int getNusuaris() {
        return nusuaris;
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
    
    
    
}
