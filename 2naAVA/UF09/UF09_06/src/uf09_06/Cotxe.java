/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf09_06;

/**
 *
 * @author sanand
 */
public class Cotxe extends Terrestres {
    private boolean aire;

    public Cotxe(boolean aire, String MATRICULA, String MODEL) {
        super(MATRICULA, MODEL, 4);
        this.aire = aire;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Acondicionat\t: "+aire);
    }
    
    public boolean isAire() {
        return aire;
    }

    public void setAire(boolean aire) {
        this.aire = aire;
    }

    
    
}
