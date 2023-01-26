/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf08_c4;

/**
 *
 * @author sanzs
 */
public class Article_c {
    String nom;
    double preu, iva;
    int quantsQueden;
    public Article_c(String nom, double preu, double iva, int quantsQueden) {
        if (preu<=0 || iva<=0 || quantsQueden<0) System.out.println("***Aquests valors no son valids, no s'ha guardat cao valor***");
        else{
            this.nom=nom;
            this.preu=preu;
            this.iva=iva;
            this.quantsQueden=quantsQueden;
        }
    }
    public void get(int num) {
        
    }
}
