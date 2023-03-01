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
    private String IBAN;
    private double saldo;
    private final double INTERESANUALBASIC=2.5;
    private final double VALORFIXE=30000;

    public CompteBancari(String IBAN, double saldo) {
        this.IBAN = IBAN;
        this.saldo = saldo;
    }
    
    //  Aquesta funció modifica el saldo tant positivament com negativament y comprova si la cantitat es major al llimit
    // *No retorna res
    // *Parametres de entrada
    //      double cant : cantitat de diners que es volen modificar en el saldo
    //
    public void modificarSaldo(double cant) {
        if (Math.abs(cant)>=VALORFIXE) {
            System.out.println("### El valor no pot superar els 30000 ###");
        }else saldo += cant;
    }
    
    //  Aquesta funció ingresa una cantitat en el saldo
    // *No retorna res
    // *Parametres de entrada
    //      double cant : cantitat de diners que es volen ingresar al saldo
    //
    public void ingressar(double cant) {
        modificarSaldo(cant);
    }
    
    //  Aquesta funció retira una cantitat en el saldo y comprova si es posible
    // *No retorna res
    // *Parametres de entrada
    //      double cant : cantitat de diners que es volen retirar del saldo
    //
    public void retirar(double cant) {
        if (saldo>=Math.abs(cant)) {
            modificarSaldo(cant);
        }else System.out.println("### Cantiatat insuficient ###");
    }
    
    //  Aquesta funció transpassa una cantitat de un compte a un altre y comprova si es posible
    // *No retorna res
    // *Parametres de entrada
    //      CompteBancari compte : compte on es volen transpassar el diners
    //      double cant : cantitat de diners que es volen transpassar
    //
    public void traspassar(CompteBancari compte, double cant) {
        if (saldo>=cant) {
            modificarSaldo(cant);
            compte.modificarSaldo(-cant);
        }else System.out.println("### Cantiatat insuficient ###");
    }
    
    
    abstract void calcularInteressos();
    
    //  Aquesta funció mostra les dades del compte
    // *No retorna res
    // *No te parametres de entrada
    //
    abstract void mostrarDades();

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getINTERESANUALBASIC() {
        return INTERESANUALBASIC;
    }

    public double getVALORFIXE() {
        return VALORFIXE;
    }
    
    
}
/*
Com he de calcular els interesos saldo = saldo*2.5
*/
