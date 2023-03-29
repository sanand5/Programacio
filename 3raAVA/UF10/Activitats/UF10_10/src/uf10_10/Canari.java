/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf10_10;

/**
 *
 * @author sanand
 */
public class Canari extends Aus {

    private String color;
    private boolean Shakira;

    public Canari(String color, boolean isShakira, String nom, int edat, String estat, String dataNaixement, String bec, boolean isVolandoPorElEpacio) throws Exception {
        super(nom, edat, estat, dataNaixement, bec, isVolandoPorElEpacio);
        this.color = color;
        this.Shakira = isShakira;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Color: " + color);
        if (Shakira) {
            System.out.println("Canta");
        } else {
            System.out.println("No canta");
        }
    }

    @Override
    public void parla() {
        super.parla();
        System.out.println("Pio pio");
    }

    public String getColor() {
        return color;
    }

    public boolean isShakira() {
        return Shakira;
    }

}
