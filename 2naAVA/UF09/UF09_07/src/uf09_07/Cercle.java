/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf09_07;

/**
 *
 * @author sanand
 */
public class Cercle implements IFigura2D{
    private double radi;

    public Cercle(double radi) {
        this.radi = radi;
    }

    public double getRadi() {
        return radi;
    }

    @Override
    public double perimetre() {
        return 2*Math.PI*radi;
    }

    @Override
    public double area() {
        return Math.PI*radi*radi;
    }

    @Override
    public void escala(double escala) {
        radi*=escala;
    }

    @Override
    public void imprimir() {
        System.out.println("Tipus\t\t: "+this.getClass().getSimpleName());
        System.out.println("Radi\t\t: "+radi);
        System.out.println("Perimetre\t: "+perimetre());
        System.out.println("Area\t\t: "+area());
        System.out.println("");
    }
    
    
}
