/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf09_06;

/**
 *
 * @author sanand
 */
public class Aeris extends Vehicles{
    private final int SEIENTS;

    public Aeris(int SEIENTS, String MATRICULA, String MODEL) {
        super(MATRICULA, MODEL);
        this.SEIENTS = SEIENTS;
        comprovarMatricula();
    }

    @Override
    public void comprovarMatricula() {
        if (!getMATRICULA().matches("^[a-zA-Z]{4}\\d{6}$")) {
            System.out.println("### No s'ha pogut gradar la matricula del vehicle "+this.getClass().getSimpleName()+" i model "+getMODEL()+" ###" );
        }
    }

    public int getSEIENTS() {
        return SEIENTS;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("N. seients\t: "+SEIENTS);
    }

    
    
    
}
