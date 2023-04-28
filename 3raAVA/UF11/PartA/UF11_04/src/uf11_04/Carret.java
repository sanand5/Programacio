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
    
    public void agrega(Element el) {        
        for (Element e : carr) { //alomillor es pot fer de l'altra manera ()->{}
            if (e.getNomProd().equals(el.getNomProd())) {
                e.setCant(el.getCant());
                return;
            }
        }
        carr.add(el);
    }

    
    
    
    
    public void agregaa(Element e) {
        for (Element element : carrr) {
            if (element.getNomProd().equals(e)) {
                element.setCant(e.getCant());
                return;
            }
        }
        carr.add(e);
        
    }
    public int numElements() {
        int num=0;
        for (Element e : carr) {
            num+=e.getCant();
            
        }
        return num;
    }
    public double importTotal() {
        double num=0;
        for (Element e : carr) {
            num+=e.getPreu();
            
        }
        return num;
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
