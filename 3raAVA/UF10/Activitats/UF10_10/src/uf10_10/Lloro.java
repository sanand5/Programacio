/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf10_10;

/**
 *
 * @author sanand
 */
public class Lloro extends Aus {

    private String origen;
    private boolean Parla;

    public Lloro(String origen, boolean Parla, String nom, int edat, String estat, String dataNaixement, String bec, boolean isVolandoPorElEpacio) throws Exception {
        super(nom, edat, estat, dataNaixement, bec, isVolandoPorElEpacio);
        this.origen = origen;
        this.Parla = Parla;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Origuen: " + origen);
    }

    @Override
    public void parla() {
        super.parla();
        System.out.println("MAMAUEVO");
    }

    public String getOrigen() {
        return origen;
    }

    public boolean isParla() {
        return Parla;
    }

}
