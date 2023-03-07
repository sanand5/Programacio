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
public abstract class Nau {
    private String nom;
    private String matricula;
    private double altitud;
    private final double ALTITUDMAX;
    private ArrayList<Tripulant> llistaTripulants = new ArrayList<Tripulant>();

    public Nau(String nom, String matricula, double ALTITUDMAX) {
        this.nom = nom;
        this.matricula = matricula;
        this.ALTITUDMAX = ALTITUDMAX;
        this.altitud = 0;
    }
    
    public void aterrizar() {
        if (altitud!=0) {
            altitud=0;
            System.out.println("-- S'ha pugut ejecutar la ordre --");
        }else System.out.println("### La nau no esta en el aire ###");
    }
    
    public void elevar(double altitud) {
        if (altitud < ALTITUDMAX) {
            this.altitud = altitud;
            System.out.println("-- S'ha puugt ejecutar la ordre --");
        }else System.out.println("### La nau no pujar a ixa altura ###");
    }

    public abstract void afegirPassatgers(ArrayList<Tripulant> llista);
    
    public void eliminarPassatgers() {
        for (int i = 0; i < llistaTripulants.size(); i++) {
            if ("Passatger".equals(llistaTripulants.get(i).getPerfil())) {
                llistaTripulants.remove(i);
            }
        }
    }
    
    public void mostrarCaracteristicas() {
        System.out.println("");
        System.out.println("Nom\t\t\t: "+nom);
        System.out.println("Tipo\t\t\t: "+this.getClass().getSimpleName());
        System.out.println("Matricula\t\t: "+matricula);
        System.out.println("Altitud\t\t\t: "+altitud+" peus");
        System.out.println("Altitud maxima\t\t: "+ALTITUDMAX+" peus");
        System.out.println("Numero tripulantes\t: "+this.llistaTripulants.size());
    }
    public void mostrarPassatgers() {
        for (int i = 0; i < llistaTripulants.size(); i++) {
            llistaTripulants.get(i).mostrar();
            System.out.println("");
        }
    }

    
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getAltitud() {
        return altitud;
    }

    public void setAltitud(double altitud) {
        this.altitud = altitud;
    }

    public ArrayList<Tripulant> getLlistaTripulants() {
        return llistaTripulants;
    }

    public void setLlistaTripulants(ArrayList<Tripulant> llistaTripulants) {
        this.llistaTripulants = llistaTripulants;
    }

    public double getALTITUDMAX() {
        return ALTITUDMAX;
    }
    
    
}
