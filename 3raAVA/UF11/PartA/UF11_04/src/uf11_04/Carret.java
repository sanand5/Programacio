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
    public void agrega(Element e) {
        Element[] miArray = new Element[carr.size()];
        carr.toArray(miArray);
        String[] miVariableArray = new String[miArray.length];
        for (int i = 0; i < miArray.length; i++) {
        miVariableArray[i] = miArray[i].getNomProd();
        }


        
        carr.add(e);
    }
    public int numElements() {
        return 0;
    }
    public double importTotal() {
        return 0;
    }
    
}
