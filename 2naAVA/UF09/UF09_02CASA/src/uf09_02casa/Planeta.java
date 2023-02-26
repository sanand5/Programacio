/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf09_02casa;

import java.util.ArrayList;

/**
 *
 * @author sanzs
 */
public class Planeta extends Astre{  
    private double distanciaSol;
    private double orbitaSol;
    private boolean teSatelit;
    private ArrayList<Satelite> s;

    public Planeta(double distanciaSol, double orbitaSol, ArrayList<Satelite> s, String nom, double radi, double rotacio, double massa, double temperatura, double gravetat) {
        super(nom, radi, rotacio, massa, temperatura, gravetat);
        this.distanciaSol = distanciaSol;
        this.orbitaSol = orbitaSol;
        this.teSatelit = true;
        this.s = s;
    }

    public Planeta(double distanciaSol, double orbitaSol, String nom, double radi, double rotacio, double massa, double temperatura, double gravetat) {
        super(nom, radi, rotacio, massa, temperatura, gravetat);
        this.distanciaSol = distanciaSol;
        this.orbitaSol = orbitaSol;
        this.teSatelit = true;
    }

    @Override
    public void mostrar() {
        super.mostrar(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        StringBuilder sb = new StringBuilder();
        sb.append("Planeta{");
        sb.append("distanciaSol=").append(distanciaSol+"km");
        sb.append(", orbitaSol=").append(orbitaSol+" dies");
        if (teSatelit) {
            sb.append(", satelit="+mostrarSatelits());
        }
        sb.append('}');
        System.out.println(sb.toString());
    }
    
    public String mostrarSatelits() {
        String satelits=" ";
        for (int i = 0; i < s.size(); i++) {
            if (i==s.size()-1) {
                satelits += (s.get(i).getNom());
            }else satelits += (s.get(i).getNom()+", ");
        }
        return satelits;
    }
    
    public double getDistanciaSol() {
        return distanciaSol;
    }

    public void setDistanciaSol(double distanciaSol) {
        this.distanciaSol = distanciaSol;
    }

    public double getOrbitaSol() {
        return orbitaSol;
    }

    public void setOrbitaSol(double orbitaSol) {
        this.orbitaSol = orbitaSol;
    }

    public boolean isTeSatelit() {
        return teSatelit;
    }

    public void setTeSatelit(boolean teSatelit) {
        this.teSatelit = teSatelit;
    }

    public ArrayList<Satelite> getS() {
        return s;
    }

    public void setS(ArrayList<Satelite> s) {
        this.s = s;
    }    
    
}
