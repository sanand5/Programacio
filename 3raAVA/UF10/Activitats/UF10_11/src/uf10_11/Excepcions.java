/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf10_11;

/**
 *
 * @author sanand
 */
class ErrIBAN extends Exception {

    String IBAN;

    public ErrIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    @Override
    public String toString() {
        return "Err: El IBAN \"" + IBAN + "\" no es correcte";
    }
}

class ErrSaldoNoSuficient extends Exception {

    double saldo;

    public ErrSaldoNoSuficient(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Err: El saldo " + saldo + " no es suficient";
    }
}

class ErrSuperaValor extends Exception {

    double valorfixe;
    double moviment;

    public ErrSuperaValor(double valorfixe, double moviment) {
        this.valorfixe = valorfixe;
        this.moviment = moviment;
    }

    @Override
    public String toString() {
        return "Err: " + moviment + " es superior a " + valorfixe + ", no pots superar aquest valor";
    }
}
