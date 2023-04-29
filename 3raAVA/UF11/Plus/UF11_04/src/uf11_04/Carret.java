/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf11_04;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Andreuet
 */
public class Carret {

    Set<Element> carr = new HashSet<>();
    
    /**
     * Agrega un element al carret o modifica la seua cantitat.
     *
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

    /**
     * Conta el numero de elements que hi ha al carret.
     *
     * @return El numero de elements que hi han al carret.
     */
    public int numElements() {
        int num = 0;
        for (Element e : carr) {
            num += e.getCant();

        }
        return num;
    }

    /**
     * Calcula el preu total del carret.
     *
     * @return El preu del carret.
     */
    public double importTotal() {
        double preu = 0;
        for (Element e : carr) {
            preu += e.getPreu();

        }
        return preu;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("               EL MEU CARRET\n");        
        String format = "| %-20s | %10s | %8s |\n";
        sb.append("+----------------------+------------+----------+\n");
        sb.append(String.format(format, "Producte", "Preu", "Cantitat"));
        sb.append("+----------------------+------------+----------+\n");
        for (Element e : carr) {
            //b.append(String.format("  %-30s %.2f€ %5d%n", e.getNomProd(), e.getPreu(), e.getCant()));
            sb.append(String.format(format, e.getNomProd(), String.format("%.2f€", e.getPreu()), e.getCant()));
        }
        sb.append("+----------------------+------------+----------+\n");
        return sb.toString();
    }

}
