/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf10_10;

import java.util.ArrayList;

/**
 *
 * @author sanand
 */
public class Inventari {

    private ArrayList<Mascotas> mascotes = new ArrayList<>();

    public void insertarMascota(Mascotas... m) {
        for (int i = 0; i < m.length; i++) {
            mascotes.add(m[i]);
        }
    }

    public void eliminarMascota(Mascotas m) {
        mascotes.remove(m);
    }

    public void buidarLlista() {
        mascotes.clear();
    }

    public void mostrarLlista() {
        System.out.println("### Lista de mascotes ###");
        for (int i = 0; i < mascotes.size(); i++) {
            Mascotas m;
            m = mascotes.get(i);
            System.out.printf("- Tipus: %s / Nom: %s%n", m.getClass().getSimpleName(), mascotes.get(i).getNom());
        }
        System.out.println("------------------------------------\n");
    }

    public void mostrarMascota(int p) throws ErrMostrar{
        if (p>mascotes.size() || p<0) {
            throw new ErrMostrar(p);
        }else {
        System.out.printf("### Dades mascota %02d ###%n", p);
        mascotes.get(p).mostrar();
        System.out.println("");
        }
    }

    public void mostrarTot() {
        System.out.println("### Lista de mascotes extensa ###");
        for (int i = 0; i < mascotes.size(); i++) {
            mascotes.get(i).mostrar();
            System.out.println("");
        }
        System.out.println("------------------------------------");
    }

    public ArrayList<Mascotas> getMascotes() {
        return mascotes;
    }

}
