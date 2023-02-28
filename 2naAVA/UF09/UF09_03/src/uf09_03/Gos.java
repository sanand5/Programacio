/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf09_03;

/**
 *
 * @author sanand
 */
public class Gos extends Mascotas {

    String raca;
    boolean Puses;

    public Gos(String nom, int edat, String estat, String dataNaixement, String raca, boolean isPuses) {
        super(nom, edat, estat, dataNaixement);
        this.raca = raca;
        this.Puses = isPuses;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Raça: " + raca);
        if (Puses) {
            System.out.println("Te puses");
        }
    }

    @Override
    public void parla() {
        super.parla();
        System.out.println("GUAU");
    }

}
