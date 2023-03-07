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
public class Creuer extends Nau{
    private double PESMAXIM;

    //considere que al crear aquest objecte vols guardar tambe els valors propis de esta clase
    public Creuer(String nom, String matricula, double ALTITUDMAX, double PESMAXIM) {
        super(nom, matricula, ALTITUDMAX);
        this.PESMAXIM = PESMAXIM;
    }

    @Override
    public void afegirPassatgers(ArrayList<Tripulant> llista) {
        System.out.println("### Esta nau no pot portar passatgers ###");
    }

    @Override
    public void mostrarCaracteristicas() {
        super.mostrarCaracteristicas();
        System.out.println("Pes maxim\t\t: "+PESMAXIM+"kg");
    }

    @Override
    public void mostrarPassatgers() {
        System.out.println("### Aquesta clase no te passatgers ###");
    }
    

    public double getPESMAXIM() {
        return PESMAXIM;
    }

    public void setPESMAXIM(double PESMAXIM) {
        this.PESMAXIM = PESMAXIM;
    }
    
}
