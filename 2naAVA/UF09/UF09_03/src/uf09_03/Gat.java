/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf09_03;

/**
 *
 * @author sanand
 */
public class Gat extends Mascotas {

    private String color;
    private boolean PelLlarg;

    public Gat(String nom, int edat, String estat, String dataNaixement, String color, boolean PelLlarg) {
        super(nom, edat, estat, dataNaixement);
        this.color = color;
        this.PelLlarg = PelLlarg;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Color: " + color);
        System.out.print("Tipo de pel: ");
        if (PelLlarg) {
            System.out.println("Llarg");
        } else {
            System.out.println("Ah");
        }
    }

    @Override
    public void parla() {
        super.parla();
        System.out.println("Miau");
    }

    public String getColor() {
        return color;
    }

    public boolean isPelLlarg() {
        return PelLlarg;
    }

}
