/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf11_04;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Andreuet
 */
public class Carret {
    Set<Element> carr = new HashSet<>();
    ArrayList<Element> carrr = new ArrayList<>();
    
    /**
     * Agrega un element al carret o modifica la seua cantitat.
     * @param element Element que es vol afegir al carret.
     */
    public void agrega(Element element) {        
        for (Element e : carr) { //alomillor es pot fer de l'altra manera ()->{}
            if (e.getNomProd().equals(element.getNomProd())) {
                e.sumarCant(element.getCant());
                return;
            }
        }
        carr.add(element);
    }
    
    public void agregaa(Element e) {
        for (Element element : carrr) {
            if (element.getNomProd().equals(e)) {
                element.sumarCant(e.getCant());
                return;
            }
        }
        carr.add(e);
        
    }
    /**
     * Conta el numero de elements que hi ha al carret.
     * @return El numero de elements que hi han al carret.
     */
    public int numElements() {
        int num=0;
        for (Element e : carr) {
            num+=e.getCant();
            
        }
        return num;
    }
    /**
     * Calcula el preu total del carret.
     * @return El preu del carret.
     */
    public double importTotal() {
        double preu=0;
        for (Element e : carr) {
            preu+=e.getPreu();
            
        }
        return preu;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CARRET\n");
        for (Element e : carr) {
            sb.append(String.format("%-30s %.2f€ %5d%n", e.getNomProd(), e.getPreu(), e.getCant()));
        }
        return sb.toString();
    }
    
    
}
