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
public class Xwing extends Nau{
    private String nomRobot;
    private ArrayList<String> armaments = new ArrayList<String>(); //Considere que sols vaig a guardar el nom del armament
    
    //considere que al crear aquest objecte vols guardar tambe els valors propis de esta clase
    public Xwing(String nom, String matricula, double ALTITUDMAX, String nomRobot, ArrayList<String> aramments) { 
        super(nom, matricula, ALTITUDMAX);
        this.nomRobot = nomRobot;
        this.armaments = aramments;
    }

    @Override
    public void mostrarCaracteristicas() {
        super.mostrarCaracteristicas();
        System.out.println("Nom del robot\t\t: "+nomRobot);
        System.out.println("Llistat de armament:");
        for (int i = 0; i < armaments.size(); i++) {
            System.out.println("\t"+armaments.get(i));
        }
    }

    @Override
    public void afegirPassatgers(ArrayList<Tripulant> llista) {
        boolean llistavalida = true;
        for (int i = 0; i < llista.size(); i++) {
            if ("Passatger".equals(llista.get(i).getPerfil())) {
                llistavalida=false;
                break;
            }
        }
        if (llistavalida) {
            getLlistaTripulants().clear();
            for (int i = 0; i < llista.size(); i++) {
                getLlistaTripulants().add(llista.get(i));
            }
            System.out.println("-- S'ha pugut ejecutar la ordre --");
        }else System.out.println("### Llista no valida ###");
    }

    public String getNomRobot() {
        return nomRobot;
    }

    public void setNomRobot(String nomRobot) {
        this.nomRobot = nomRobot;
    }

    public ArrayList<String> getArmaments() {
        return armaments;
    }

    public void setArmaments(ArrayList<String> armaments) {
        this.armaments = armaments;
    }
    
    
    
    
    
    
    
    
    
}
