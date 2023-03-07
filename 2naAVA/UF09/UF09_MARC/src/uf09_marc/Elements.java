/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf09_marc;

import uf09_marc.Usuari;

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
    
    public void prestarUsuari(Usuari u) {
        if (U!=null) {
            System.out.println("### El element ja esta alquilat ###");
        }else U = u;
    }
    
    public void tornar() {
        U=null;
    }

    public void mostrar() {
        System.out.println();
        System.out.println(this.getClass().getSimpleName());
        System.out.println(titol);
        if (U != null) {
        System.out.println(U.getNom());
        }
    }
    
    abstract void fun();
    
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
