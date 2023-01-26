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
    private String nom;
    private double preu, iva;
    private int quantsQueden;
    public Article_c(String nom, double preu, double iva, int quantsQueden) {
        if (preu<=0 || iva<=0 || quantsQueden<0) System.out.println("***Aquests valors no son valids, no s'ha guardat cao valor***");
        else{
            this.nom=nom;
            this.preu=preu;
            this.iva=iva;
            this.quantsQueden=quantsQueden;
        }
    }
    public String getnom() {
        return this.nom;
    }
    public double getpreu() {
        return this.preu;
    }
    public double getiva() {
        return this.iva;
    }
    public double getquantsQueden() {
        return this.quantsQueden;
    }
    public void setnom(String nom ) {
       this.nom=nom;
    }
    public void setpreu(double preu) {
        if (this.preu<=0) {
            System.out.println("El valor ha de ser major que 0");
        }else this.preu=preu;
    }
    public void setiva(double iva) {
        if (this.iva<0) {
            System.out.println("El valor no pot ser menor a 0");
        }else this.iva=iva;
    }
    public void setquantsQueden(int quantsQueden) {
        if (this.quantsQueden<0) {
            System.out.println("Rl vslor no pot ser menor que 0");
        }else this.quantsQueden=quantsQueden;
    }
    
}
