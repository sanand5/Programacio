/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf09_06;

/**
 *
 * @author sanand
 */
public class Avions extends Aeris{
    private int tempsMax;

    public Avions(int tempsMax, int SEIENTS, String MATRICULA, String MODEL) {
        super(SEIENTS, MATRICULA, MODEL);
        this.tempsMax = tempsMax;
    }

    public int getTempsMax() {
        return tempsMax;
    }

    public void setTempsMax(int tempsMax) {
        this.tempsMax = tempsMax;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Temps max vol\t: "+tempsMax);
    }
    
    
}
