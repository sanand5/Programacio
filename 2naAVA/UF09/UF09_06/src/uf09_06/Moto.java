/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf09_06;

/**
 *
 * @author sanand
 */
public class Moto extends Terrestres {
    private String color;

    public Moto(String color, String MATRICULA, String MODEL) {
        super(MATRICULA, MODEL, 2);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Color\t\t: "+color);
    }
    
}
