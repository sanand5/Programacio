/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf10_09;

/**
 *
 * @author sanand
 */
public class ErrNom extends Exception{
    int edat;
    String nom;
    
    public ErrNom(int edat, String nom) {
        this.edat = edat;
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Error : \""+nom+"\" amb "+edat+" anys, perque el nom no es el adecuat";
    }
}
