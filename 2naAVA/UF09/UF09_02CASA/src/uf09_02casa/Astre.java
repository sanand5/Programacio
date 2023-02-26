/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf09_02casa;

/**
 *
 * @author sanzs
 */
public class Astre {
    private String nom;
    private double radi;
    private double rotacio;
    private double massa;
    private double temperatura;
    private double gravetat;

    public Astre(String nom, double radi, double rotacio, double massa, double temperatura, double gravetat) {
        this.nom = nom;
        this.radi = radi;
        this.rotacio = rotacio;
        this.massa = massa;
        this.temperatura = temperatura;
        this.gravetat = gravetat;
    }
    
    public void mostrar() {
        StringBuilder sb = new StringBuilder();
        sb.append("Astre{");
        sb.append("nom=").append(nom);
        sb.append(", radi=").append(radi+"m");
        sb.append(", rotacio=").append(rotacio+"h");
        sb.append(", massa=").append(massa+"kg");
        sb.append(", temperatura=").append(temperatura+"º");
        sb.append(", gravetat=").append(gravetat+"m/s²");
        sb.append('}');
        System.out.println(sb.toString());
    }
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getRadi() {
        return radi;
    }

    public void setRadi(double radi) {
        this.radi = radi;
    }

    public double getRotacio() {
        return rotacio;
    }

    public void setRotacio(double rotacio) {
        this.rotacio = rotacio;
    }

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getGravetat() {
        return gravetat;
    }

    public void setGravetat(double gravetat) {
        this.gravetat = gravetat;
    }
    
}
