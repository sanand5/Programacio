/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf09_04;

/**
 *
 * @author sanand
 */
public class CompteCorrent extends CompteBancari {

    public CompteCorrent(String IBAN, double saldo) {
        super(IBAN, saldo);
    }

    @Override
    double calcularInteressos() {
        return 0;
    }

    @Override
    void mostrarDades() {
        System.out.println("IBAN\t: "+IBAN);
        System.out.println("Saldo\t: "+saldo);
    }

    
    
    
    
}
