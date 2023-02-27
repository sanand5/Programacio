/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf09_03;

/**
 *
 * @author sanand
 */
public class Canari extends Aus{
    private String color;
    private boolean isShakira;

    public Canari(String color, boolean isShakira, String nom, int edat, String estat, String dataNaixement, String bec, boolean isVolandoPorElEpacio) {
        super(nom, edat, estat, dataNaixement, bec, isVolandoPorElEpacio);
        this.color = color;
        this.isShakira = isShakira;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Color: "+color);
        if (isShakira) {
            System.out.println("Canta");
        }else System.out.println("No canta");
    }

    @Override
    public void parla() {
        super.parla(); 
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isIsShakira() {
        return isShakira;
    }

    public void setIsShakira(boolean isShakira) {
        this.isShakira = isShakira;
    }
    
}
