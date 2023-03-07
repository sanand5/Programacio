/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package starwars;

import java.util.ArrayList;

/**
 *
 * @author sanand
 */
public class Carrega extends Creuer{
    private double carrega;

    //considere que al crear aquest objecte vols guardar tambe els valors propis de esta clase
    public Carrega(String nom, String matricula, double ALTITUDMAX, double PESMAXIM, double carrega) {
        super(nom, matricula, ALTITUDMAX, PESMAXIM);
        this.carrega = carrega;
    }
    

    @Override
    public void mostrarCaracteristicas() {
        super.mostrarCaracteristicas();
        System.out.println("Carrega\t\t\t: "+carrega+"kg");
    }

    @Override
    public void afegirPassatgers(ArrayList<Tripulant> llista) {
        int nPassatgers=0;
        for (int i = 0; i < llista.size(); i++) {
            if ("Passatger".equals(llista.get(i).getPerfil())) {
                nPassatgers++;
            }
        }
        if (nPassatgers<=2) {
            getLlistaTripulants().clear();
            for (int i = 0; i < llista.size(); i++) {
                getLlistaTripulants().add(llista.get(i));
            }
            System.out.println("-- S'ha pugut ejecutar la ordre --");
        }else System.out.println("### La llista no s'ha pogut canviar perque hi han massa pasatgers ###");
    }

    public double getCarrega() {
        return carrega;
    }

    public void setCarrega(double carrega) {
        this.carrega = carrega;
    }
    
    
    
}
