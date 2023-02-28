/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf09_03;

/**
 *
 * @author sanand
 */
public class Aus extends Mascotas {

    private String bec;
    private boolean VolandoPorElEpacio;

    public Aus(String nom, int edat, String estat, String dataNaixement, String bec, boolean isVolandoPorElEpacio) {
        super(nom, edat, estat, dataNaixement);
        this.bec = bec;
        this.VolandoPorElEpacio = isVolandoPorElEpacio;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Tipo de bec: " + bec);
        if (VolandoPorElEpacio) {
            System.out.println("Tipo volador");
        } else {
            System.out.println("Tipo no volador");
        }
    }

    public void volar() {
        VolandoPorElEpacio = true;
    }

    public String getBec() {
        return bec;
    }

    public boolean isVolandoPorElEpacio() {
        return VolandoPorElEpacio;
    }

}
