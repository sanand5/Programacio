/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf09_02casa;

/**
 *
 * @author sanzs
 */
public class Satelite extends Astre{
    private double distanciaPlaneta;
    private double orbitaPlaneta;
    private Planeta p;

    public Satelite(double distanciaPlaneta, double orbitaPlaneta, Planeta p, String nom, double radi, double rotacio, double massa, double temperatura, double gravetat) {
        super(nom, radi, rotacio, massa, temperatura, gravetat);
        this.distanciaPlaneta = distanciaPlaneta;
        this.orbitaPlaneta = orbitaPlaneta;
        this.p = p;
    }

    public Satelite(double distanciaPlaneta, double orbitaPlaneta, String nom, double radi, double rotacio, double massa, double temperatura, double gravetat) {
        super(nom, radi, rotacio, massa, temperatura, gravetat);
        this.distanciaPlaneta = distanciaPlaneta;
        this.orbitaPlaneta = orbitaPlaneta;
    }

    
    
    @Override
    public void mostrar() {
        super.mostrar(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        StringBuilder sb = new StringBuilder();
        sb.append("Satelite{");
        sb.append("distanciaPlaneta=").append(distanciaPlaneta);
        sb.append(", orbitaPlaneta=").append(orbitaPlaneta);
        if (p==null) {
            sb.append(", planeta=NoAsignat");
        }else sb.append(", planeta=").append(p.getNom());
        sb.append('}');
        System.out.println(sb.toString());
    }

    public double getDistanciaPlaneta() {
        return distanciaPlaneta;
    }

    public void setDistanciaPlaneta(double distanciaPlaneta) {
        this.distanciaPlaneta = distanciaPlaneta;
    }

    public double getOrbitaPlaneta() {
        return orbitaPlaneta;
    }

    public void setOrbitaPlaneta(double orbitaPlaneta) {
        this.orbitaPlaneta = orbitaPlaneta;
    }

    public Planeta getP() {
        return p;
    }

    public void setP(Planeta p) {
        this.p = p;
    }
    
    
}
