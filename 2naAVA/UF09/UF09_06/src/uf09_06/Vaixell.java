/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf09_06;

/**
 *
 * @author sanand
 */
public class Vaixell extends Aquatics{
    private boolean motor;

    public Vaixell(boolean motor, int eslora, String MATRICULA, String MODEL) {
        super(eslora, MATRICULA, MODEL);
        this.motor = motor;
    }

    public boolean isMotor() {
        return motor;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Motor\t\t: "+motor);
    }

    
    
}
