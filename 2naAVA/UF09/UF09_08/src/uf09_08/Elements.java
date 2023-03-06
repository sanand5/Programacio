/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf09_08;

/**
 *
 * @author sanand
 */
abstract class Elements {
    private String titol;
    private Usuari U;

    public Elements(String titol) {
        this.titol = titol;
    }
    
    public void asignarUsuari(Usuari u) {
        U = u;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public Usuari getU() {
        return U;
    }

    public void setU(Usuari U) {
        this.U = U;
    }
}
