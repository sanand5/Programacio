/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf11_04;

/**
 *
 * @author Andreuet
 */
public class Element {
    private final String nomProd;
    private double preu;
    private int cant;

    public Element(String nomProd, double preu, int cant) {
        this.nomProd = nomProd;
        if (preu>=0 && cant > 0) {
            this.preu = preu;
            this.cant = cant;
        }
    }

    /**
     * @return the nomProd
     */
    public String getNomProd() {
        return nomProd;
    }

    /**
     * @return the preu
     */
    public double getPreu() {
        return preu;
    }

    
    
    /**
     * @return the cant
     */
    public int getCant() {
        return cant;
    }

    /**
     * @param cant the cant to set
     */
    public void setCant(int cant) {
        if (cant>0) {
            this.cant += cant;
        }
    }
    
}
