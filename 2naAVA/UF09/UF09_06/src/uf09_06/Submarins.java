/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf09_06;

/**
 *
 * @author sanand
 */
public class Submarins extends Aquatics{
    private double profmax;

    public Submarins(double profmax, int eslora, String MATRICULA, String MODEL) {
        super(eslora, MATRICULA, MODEL);
        this.profmax = profmax;
    }

    public double getProfmax() {
        return profmax;
    }

    public void setProfmax(double profmax) {
        this.profmax = profmax;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Prof. maxima\t: "+profmax);
    }
    
    
}
