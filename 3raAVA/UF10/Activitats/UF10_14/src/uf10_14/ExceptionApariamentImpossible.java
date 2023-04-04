/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf10_14;

/**
 *
 * @author sanand
 */
public class ExceptionApariamentImpossible extends Exception{
    Gatos gat1;
    Gatos gat2;
    String msg;

    public ExceptionApariamentImpossible(Gatos gat1, Gatos gat2) {
        this.gat1 = gat1;
        this.gat2 = gat2;
        msg="**** ERROR: Dos gats "+gat1.getSexo()+" ("+gat1.getNom()+", "+gat2.getNom()+") no es poden apariar";
    }

    public ExceptionApariamentImpossible(Gatos gat) {
        this.gat1=gat;
        msg="**** ERROR: No es pot apariar a "+gat1.getNom()+" amb si mateix";
    }
    
    @Override
    public String toString() {
        return msg;
    }
    
    
    
}
