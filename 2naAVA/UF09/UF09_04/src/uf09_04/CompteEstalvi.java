/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf09_04;

/**
 *
 * @author sanand
 */
public class CompteEstalvi extends CompteBancari{
    private final double SALDOMINIM=2000;

    public CompteEstalvi(String IBAN, double saldo) {
        super(IBAN, saldo);
    }
        //setSaldo(getSaldo()*(getINTERES_ANUAL_BASIC() / 10));
    @Override
    void calcularInteressos() {
        if (getSaldo()<SALDOMINIM) {
            setSaldo(getSaldo()*((double)getINTERESANUALBASIC()/2));
        }else if (getSaldo()>=SALDOMINIM){
            setSaldo(getSaldo()*((double)getINTERESANUALBASIC()*2));
        }
    }

    @Override
    void mostrarDades() {
        System.out.println("IBAN\t: "+getIBAN());
        System.out.println("Saldo\t: "+getSaldo());
    }
    
    
}
