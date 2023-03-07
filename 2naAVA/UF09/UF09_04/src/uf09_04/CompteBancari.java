/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf09_04;

/**
 *
 * @author sanand
 */
abstract class CompteBancari {

    private final String IBAN;
    private double saldo;
    private final double INTERESANUALBASIC = 2.5;
    private final double VALORFIXE = 2000;

    public CompteBancari(String IBAN, double saldo) {
        this.IBAN = IBAN;
        this.saldo = saldo;
    }

    // Aquesta funció modifica el saldo tant positivament com negativament i comprova si la quantitat és major al límit
    // *No retorna res
    // *Paràmetres d'entrada
    // double cant : quantitat de diners que es volen modificar en el saldo
    //
    public void modificarSaldo(double cant) {
        if (Math.abs(cant) > VALORFIXE) {
            System.out.println("### El valor no pot superar els 2000 ###");
        } else {
            saldo += cant;
        }
    }

    // Aquesta funció ingressa una quantitat en el saldo
    // *No retorna res
    // *Paràmetres d'entrada
    // double cant : quantitat de diners que es volen ingressar al saldo
//
    public void ingressar(double cant) {
        modificarSaldo(cant);
    }

    // Aquesta funció retira una quantitat en el saldo i comprova si és possible
    // *No retorna res
    // *Paràmetres d'entrada
    // double cant : quantitat de diners que es volen retirar del saldo
    // 
    public void retirar(double cant) {
        if (saldo >= cant) {
            modificarSaldo(-cant);
        } else {
            System.out.println("### Cantiatat insuficient ###");
        }
    }

    // Aquesta funció traspassa una quantitat d'un compte a un altre i comprova si és possible
    // *No retorna res
    // *Paràmetres d'entrada
    // CompteBancari compte : compte on es volen traspassar els diners
    // double cant : quantitat de diners que es volen traspassar
    //
    public void traspassar(CompteBancari compte, double cant) {
        if (saldo >= cant) {
            modificarSaldo(-cant);      
            compte.modificarSaldo(cant);
        } else {
            System.out.println("### Cantiatat insuficient ###");
        }
    }

    // Aquesta funció calcula i aplica els interessos al saldo
    // *No retorna res
    // *No té paràmetres d'entrada
    //
    abstract void calcularInteressos();

    //  Aquesta funció mostra les dades del compte
    // *No retorna res
    // *No té paràmetres d'entrada
    //
    abstract void mostrarDades();

    public String getIBAN() {
        return IBAN;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getINTERESANUALBASIC() {
        return INTERESANUALBASIC;
    }

    public double getVALORFIXE() {
        return VALORFIXE;
    }

}
