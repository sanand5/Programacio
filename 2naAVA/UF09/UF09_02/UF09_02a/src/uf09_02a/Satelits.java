/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf09_02a;

/**
 *
 * @author sanand
 */
public class Satelits extends Astres{
    private double distanciaPlaneta;
    private int horesOrbitaPlaneta;
    private Planeta planeta;

    public Satelits(double distanciaPlaneta, int horesOrbitaPlaneta, Planeta planeta, String nom, double radi, double massa, double temperaturaMitjana, double rotacio, double gravetat) {
        super(nom, radi, massa, temperaturaMitjana, rotacio, gravetat);
        this.distanciaPlaneta = distanciaPlaneta;
        this.horesOrbitaPlaneta = horesOrbitaPlaneta;
        this.planeta = planeta;
    }

    public Satelits(double distanciaPlaneta, int horesOrbitaPlaneta, String nom, double radi, double massa, double temperaturaMitjana, double rotacio, double gravetat) {
        super(nom, radi, massa, temperaturaMitjana, rotacio, gravetat);
        this.distanciaPlaneta = distanciaPlaneta;
        this.horesOrbitaPlaneta = horesOrbitaPlaneta;
    }

    @Override
    public void mostrar() {
        super.mostrar();    
        StringBuilder sb = new StringBuilder();
        sb.append("Satelits{");
        sb.append("distanciaPlaneta=").append(distanciaPlaneta);
        sb.append(", horesOrbitaPlaneta=").append(horesOrbitaPlaneta);
        sb.append(", planeta=").append(planeta);
        sb.append('}');
        System.out.println(sb.toString());
    }
    
    public double getDistanciaPlaneta() {
        return distanciaPlaneta;
    }

    public void setDistanciaPlaneta(double distanciaPlaneta) {
        this.distanciaPlaneta = distanciaPlaneta;
    }

    public int getHoresOrbitaPlaneta() {
        return horesOrbitaPlaneta;
    }

    public void setHoresOrbitaPlaneta(int horesOrbitaPlaneta) {
        this.horesOrbitaPlaneta = horesOrbitaPlaneta;
    }

    public Planeta getPlaneta() {
        return planeta;
    }

    public void setPlaneta(Planeta planeta) {
        this.planeta = planeta;
    }
    
    
}
