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

    /**
     *
     * @param nomProd Nom del producte.
     * @param preu Preu del producte.
     * @param cant Cantitat del producte que es vol afegir al carret.
     */
    public Element(String nomProd, double preu, int cant) {
        this.nomProd = nomProd;
        if (preu>=0 && cant > 0) {
            this.preu = preu;
            this.cant = cant;
        }
    }

    /**
     * @return  Nom del producte.
     */
    public String getNomProd() {
        return nomProd;
    }

    /**
     *
     * @return Preu del Producte.
     */
    public double getPreu() {
        return preu;
    }

    /**
     *
     * @return Cantitat del producte en el carret.
     */
    public int getCant() {
        return cant;
    }

    /**
     * Suma la cantitat a un element.
     * @param cant La cantitat de elements que es vol afegir al carret.
     */
    public void sumarCant(int cant) {
        if (cant>0) {
            this.cant += cant;
        }
    }
    
}
