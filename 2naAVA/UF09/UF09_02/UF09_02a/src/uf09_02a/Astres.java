/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf09_02a;

/**
 *
 * @author sanand
 */
 public class Astres {
    private String nom;
    private double rotacio;
    private double radi;
    private double massa;
    private double temperaturaMitjana;
    private double gravetat;

    public Astres(String nom, double radi, double massa, double temperaturaMitjana, double rotacio, double gravetat) {
        this.nom = nom;
        this.radi = radi;
        this.massa = massa;
        this.temperaturaMitjana = temperaturaMitjana;
        this.rotacio = rotacio;
        this.gravetat = gravetat;
    }
    
    public void mostrar() {
        StringBuilder sb = new StringBuilder();
        sb.append("Astres{");
        sb.append("nom=").append(nom);
        sb.append(", rotacio=").append(rotacio);
        sb.append(", radi=").append(radi);
        sb.append(", massa=").append(massa);
        sb.append(", temperaturaMitjana=").append(temperaturaMitjana);
        sb.append(", gravetat=").append(gravetat);
        sb.append('}');
        System.out.println(sb.toString());
    }
    
    public double getGravetat() {
        return gravetat;
    }

    public void setGravetat(double gravetat) {
        this.gravetat = gravetat;
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

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getTemperaturaMitjana() {
        return temperaturaMitjana;
    }

    public void setTemperaturaMitjana(double temperaturaMitjana) {
        this.temperaturaMitjana = temperaturaMitjana;
    }

    public double getRotacio() {
        return rotacio;
    }

    public void setRotacio(double rotacio) {
        this.rotacio = rotacio;
    }

    
    
}
