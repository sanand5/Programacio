/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf09_04;

/**
 *
 * @author sanand
 */
public class CompteEstalvi extends CompteBancari {

    private final double SALDOMINIM = 3100;
    private double interesanual;

    public CompteEstalvi(String IBAN, double saldo) {
        super(IBAN, saldo);
    }

    @Override
    void calcularInteressos() {
        if (getSaldo() < SALDOMINIM) {
            modificarSaldo(getSaldo() * ((getINTERESANUALBASIC() / 2) / 100));
        } else {
            modificarSaldo(getSaldo() * ((getINTERESANUALBASIC() * 2) / 100));
        }
    }

    @Override
    void mostrarDades() {
        /*
        if (getSaldo() < SALDOMINIM) {
            interesanual = getINTERESANUALBASIC() / 2;
        } else {
            interesanual = getINTERESANUALBASIC() * 2;
        }
        System.out.println("IBAN: " + getIBAN() + "   -   Saldo: " + getSaldo() + "€   -   Interes anual:   " + interesanual);
        //Antenc que segons el enunciat fica que traga el interes anual basic, que seria 2.5 pero si vols que traga el interes aplicat sols has de descomentar el que esta comentat
        */
        System.out.println("IBAN: " + getIBAN() + "   -   Saldo: " + getSaldo() + "€   -   Interes anual:   " + getINTERESANUALBASIC()+"%");
    }

}
