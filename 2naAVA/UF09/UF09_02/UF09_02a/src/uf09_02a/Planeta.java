/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf09_02a;

/**
 *
 * @author sanand
 */
public class Planeta extends Astres{
    private double distanciaSol;
    private int DiesOrbitaSol;
    private boolean tesatelits;
    private Satelits satelit;

    public Planeta(double distanciaSol, int DiesOrbitaSol, boolean tesatelits, Satelits satelit, String nom, double radi, double massa, double temperaturaMitjana, double rotacio, double gravetat) {
        super(nom, radi, massa, temperaturaMitjana, rotacio, gravetat);
        this.distanciaSol = distanciaSol;
        this.DiesOrbitaSol = DiesOrbitaSol;
        this.tesatelits = tesatelits;
        this.satelit = satelit;
    }

    public Planeta(double distanciaSol, int DiesOrbitaSol, boolean tesatelits, String nom, double radi, double massa, double temperaturaMitjana, double rotacio, double gravetat) {
        super(nom, radi, massa, temperaturaMitjana, rotacio, gravetat);
        this.distanciaSol = distanciaSol;
        this.DiesOrbitaSol = DiesOrbitaSol;
        this.tesatelits = tesatelits;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        StringBuilder sb = new StringBuilder();
        sb.append("Planeta{");
        sb.append("distanciaSol=").append(distanciaSol);
        sb.append(", DiesOrbitaSol=").append(DiesOrbitaSol);
        sb.append(", tesatelits=").append(tesatelits);
        sb.append(", satelit=").append(satelit);
        sb.append('}');
        System.out.println(sb.toString());
    }
    

    public Satelits getSatelit() {
        return satelit;
    }

    public void setSatelit(Satelits satelit) {
        this.satelit = satelit;
    }

    public double getDistanciaSol() {
        return distanciaSol;
    }

    public void setDistanciaSol(double distanciaSol) {
        this.distanciaSol = distanciaSol;
    }

    public int getDiesOrbitaSol() {
        return DiesOrbitaSol;
    }

    public void setDiesOrbitaSol(int DiesOrbitaSol) {
        this.DiesOrbitaSol = DiesOrbitaSol;
    }

    public boolean isTesatelits() {
        return tesatelits;
    }

    public void setTesatelits(boolean tesatelits) {
        this.tesatelits = tesatelits;
    }
    
    
    
    
}
