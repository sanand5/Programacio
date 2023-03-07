/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf09_03;

import java.util.ArrayList;

/**
 *
 * @author sanand
 */
public class UF09_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Inventari h = new Inventari();
        h.insertarMascota(new Gat("Felix", 1, "Saludable", "10/02/2022", "Negro", true));
        h.insertarMascota(new Gat("Garfield", 4, "Enfermo", "01/12/2017", "Naranja", false));
        h.insertarMascota(new Gos("Max", 5, "Saludable", "08/09/2016", "Labrador", false));
        h.insertarMascota(new Gos("Rocky", 3, "Enfermo", "27/03/2019", "Pastor Alemán", true));
        h.insertarMascota(new Canari("Amarillo", true, "Paco", 2, "Saludable", "01/05/2020", "Pequeño", true));
        h.insertarMascota(new Canari("Verde", false, "Tico", 1, "Enfermo", "15/02/2022", "Grande", false));
        h.insertarMascota(new Lloro("Amazonas", true, "Yako", 5, "Saludable", "12/09/2016", "Grande", true));
        h.insertarMascota(new Lloro("Africa", false, "Kiki", 4, "Enfermo", "10/12/2017", "Mediano", false));
        h.mostrarLlista();

        h.mostrarMascota(2);

        h.mostrarTot();

        for (int i = 0; i < h.getMascotes().size(); i++) {
            System.out.printf("ID: %02d%n", i);
            h.getMascotes().get(i).parla();
            h.getMascotes().get(i).aniversari();
            System.out.println("");
        }
        
        Aus cast;
        cast = (Aus) h.getMascotes().get(5);        
        h.mostrarMascota(5);
        cast.volar();
        h.mostrarMascota(5);
        
        h.eliminarMascota(h.getMascotes().get(0));
        h.mostrarLlista();
        
        h.buidarLlista();
        h.mostrarLlista();
    }
    /*
    Volar
    */

}
