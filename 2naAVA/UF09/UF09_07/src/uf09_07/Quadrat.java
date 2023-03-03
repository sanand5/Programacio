/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf09_07;

/**
 *
 * @author sanand
 */
public class Quadrat implements IFigura2D{
    private double costat;

    public Quadrat(double costat) {
        this.costat = costat;
    }

    @Override
    public double perimetre() {
        return costat*4;
    }

    @Override
    public double area() {
        return costat*2;
    }

    @Override
    public void escala(double escala) {
        if (escala<0) {
            System.out.println("### No s'accepten valors negatius ###");
        }else costat*=escala;
    }

    @Override
    public void imprimir() {
        System.out.println("Tipus\t\t: "+this.getClass().getSimpleName());
        System.out.println("Costat\t\t: "+costat);
        System.out.println("Perimetre\t: "+perimetre());
        System.out.println("Area\t\t: "+area());
        System.out.println("");
    }

    

    public double getCostat() {
        return costat;
    }

    public void setCostat(double costat) {
        this.costat = costat;
    }

    
    
    
    
}
