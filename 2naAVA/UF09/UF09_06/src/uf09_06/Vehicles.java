/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf09_06;

/**
 *
 * @author sanand
 */
abstract class Vehicles {
    private final String MATRICULA;
    private final String MODEL;

    public Vehicles(String MATRICULA, String MODEL) {
        this.MATRICULA = MATRICULA;
        this.MODEL = MODEL;
    }

    public String getMATRICULA() {
        return MATRICULA;
    }

    public String getMODEL() {
        return MODEL;
    }
    
    public abstract void comprovarMatricula();
    public void imprimir() {
        System.out.println("");
        System.out.println("··································");
        System.out.println("Genere\t\t: "+this.getClass().getSimpleName());
        System.out.println("Matricula\t: "+MATRICULA);
        System.out.println("Model\t\t: "+MODEL);
    }
    
}
/*
en la clase/en una funcio si es abstract per ni a que ficarli algun tipo de lo de public, private o protect
*/