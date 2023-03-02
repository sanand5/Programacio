/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf09_06;

/**
 *
 * @author sanand
 */
public class Terrestres extends Vehicles{
    private final int RODES;

    public Terrestres(String MATRICULA, String MODEL, int RODES) {
        super(MATRICULA, MODEL);
        this.RODES = RODES;
        comprovarMatricula();
        
    }

    @Override
    public void comprovarMatricula() {
        if (!getMATRICULA().matches("^\\d{4}[a-zA-Z]{3}$")) {
            System.out.println("### No s'ha pogut gradar la matricula del vehicle "+this.getClass().getSimpleName()+" i model "+getMODEL()+" ###" );
        }
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Numero de rodes\t: "+RODES);
    }
    
    
    
    
    
}
