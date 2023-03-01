/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf09_06;

/**
 *
 * @author sanand
 */
public class Helicopters extends Aeris {
    private int helices;

    public Helicopters(int helices, int SEIENTS, String MATRICULA, String MODEL) {
        super(SEIENTS, MATRICULA, MODEL);
        this.helices = helices;
    }

    public int getHelices() {
        return helices;
    }

    public void setHelices(int helices) {
        this.helices = helices;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("N. helices\t: "+helices);
    }
    
    
}
