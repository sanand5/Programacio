/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf08_d4;

/**
 *
 * @author sanzs
 */
public class Article_d {
    private String nom;
    private double preu, iva;
    private int quantsQueden;
    public Article_d(String nom, double preu, double iva, int quantsQueden) {
        if (preu<=0 || iva<=0 || quantsQueden<0) System.out.println("***Aquests valors no son valids, no s'ha guardat cao valor***");
        else{
            this.nom=nom;
            this.preu=preu;
            this.iva=iva;
            this.quantsQueden=quantsQueden;
        }
    }
    //en vendre quins atributs i ha que modificar quan realment el unic que podries modificar es el de quanrsQueden
    public boolean vendre(int x) {
        if (quantsQueden>=x) {
            quantsQueden-=x;
            return true;
        } else {
            return false;
        }
    }
    //lo mateix que wla de dalt
    public boolean emmagatzema(int x) {
        if (quantsQueden+x>=0) {
            quantsQueden+=x;
            return true;
        } else {
            return false;
        }
    }
    
    public void imprimeix() {
        System.out.printf("""
                          Nom: %s
                          Preu: %.2f€
                          IVA: %.0f%%
                          PVP: %.2f€
                          Restants: %d
                          """, this.nom, this.preu, this.iva, getPVP(), this.quantsQueden);
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
    
    public double getPVP() {
        return this.preu+(this.preu * ((double) this.iva / 100));
    }
    
    public double getPVPDescompte(int descompte) {
        return getPVP() - (getPVP()*((double) descompte / 100));
    }
    
    public void setnom(String nom ) {
       this.nom=nom;
    }
    
    public void setpreu(double preu) {
        if (preu<=0) {
            System.out.println("El valor ha de ser major que 0");
        }else this.preu=preu;
    }
    
    public void setiva(double iva) {
        if (iva<0) {
            System.out.println("El valor no pot ser menor a 0");
        }else this.iva=iva;
    }
    
    public void setquantsQueden(int quantsQueden) {
        if (quantsQueden<0) {
            System.out.println("Rl vslor no pot ser menor que 0");
        }else this.quantsQueden=quantsQueden;
    }
    
}
