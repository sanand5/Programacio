/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf09_07;

/**
 *
 * @author sanand
 */
public class Triangle implements IFigura2D{
    private double ample;
    private double llarg;

    public Triangle(double ample, double llarg) {
        this.ample = ample;
        this.llarg = llarg;
    }

    @Override
    public double perimetre() {
        return ample*3;
    }

    @Override
    public double area() {
        return (ample*llarg)/2;
    }

    @Override
    public void escala(double escala) {
        ample*=escala;
        llarg*=escala;
    }

    @Override
    public void imprimir() {
        System.out.println("Tipus\t\t: "+this.getClass().getSimpleName());
        System.out.println("Ample\t\t: "+ample);
        System.out.println("Llarg\t\t: "+llarg);
        System.out.println("Perimetre\t: "+perimetre());
        System.out.println("Area\t\t: "+area());
        System.out.println("");
    }

    
    
    public double getAmple() {
        return ample;
    }

    public double getLlarg() {
        return llarg;
    }
    
    
    
}
