/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf09_03;

import java.util.ArrayList;

/**
 *
 * @author sanand
 */
public class Inventari {
    private ArrayList<Mascotas> mascotes = new ArrayList<>();
    public void insertarMascota(Mascotas m) {
        mascotes.add(m);
    }
    public void eliminarMascota(Mascotas m) {
        mascotes.remove(m);
    }
    public void buidarLlista() {
        mascotes.clear();
    }
    public void mostrarLlista() {
        for (int i = 0; i < mascotes.size(); i++) {
            System.out.printf("- Tipus: %s Nom: %s",this.getClass().getSimpleName(),mascotes.get(i));
        }
    }
    public void mostrarMascota(int p) {
        System.out.println("");
    }
    public void mostrarTot() {
        
    }
    
}
/*
mostrarLlista() {
public void mostrarMascota(int p) {
public void mostrarTot() {

*/