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
public class Passatgers extends Creuer{
    final int MAXPASSATGERS;

    //considere que al crear aquest objecte vols guardar tambe els valors propis de esta clase
    public Passatgers(String nom, String matricula, double ALTITUDMAX, double PESMAXIM, int MAXPASSATGERS) {
        super(nom, matricula, ALTITUDMAX, PESMAXIM);
        this.MAXPASSATGERS = MAXPASSATGERS;
    }

    
    
    @Override
    public void mostrarCaracteristicas() {
        super.mostrarCaracteristicas();
        System.out.println("Nº Passatgers max \t\t: "+MAXPASSATGERS);
    }

    @Override
    public void afegirPassatgers(ArrayList<Tripulant> llista) {
        getLlistaTripulants().clear();
        int nPassatgers =0;
        for (int i = 0; i < llista.size(); i++) {
            if ("Passatger".equals(llista.get(i).getPerfil()) && nPassatgers<MAXPASSATGERS) {
                nPassatgers++;
                getLlistaTripulants().add(llista.get(i));
            }
            if (!"Passatger".equals(getLlistaTripulants().get(i).getPerfil())) {
                getLlistaTripulants().add(llista.get(i));
            }
        }
        System.out.println("-- S'ha pugut ejecutar la ordre --");
    }

    public int getMAXPASSATGERS() {
        return MAXPASSATGERS;
    }
    
    
    
    
    
}
