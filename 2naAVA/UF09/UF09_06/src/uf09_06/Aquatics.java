/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf09_06;

/**
 *
 * @author sanand
 */
public class Aquatics extends Vehicles {
    private final int ESLORA;

    public Aquatics(int eslora, String MATRICULA, String MODEL) {
        super(MATRICULA, MODEL);
        this.ESLORA = eslora;
        comprovarMatricula();
    }

    @Override
    public void comprovarMatricula() {
        if (!getMATRICULA().matches("^\\d{3}[a-zA-Z]{10}$")) {
            System.out.println("### No s'ha pogut gradar la matricula del vehicle "+this.getClass().getSimpleName()+" i model "+getMODEL()+" ###" );
        }
    }

    public int getESLORA() {
        return ESLORA;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Eslora\t\t: "+ESLORA);
    }
    
    
    
    
}
