/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf10_11;

/**
 *
 * @author sanand
 */
public class UF10_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            CompteBancari corrent = new CompteCorrent("ES6256465847", 1000);
            CompteBancari estalvi = new CompteEstalvi("ES9956415656", 3000);

            // Mostrem les dades dels comptes
            System.out.println("### Mostrem les dades dels comptes ###");
            mostrarComptes(corrent, estalvi);

            // Ingressem, retirem i mostrem
            System.out.println("### Ingressem 1000€ / Retirem 500€ ###");
            corrent.ingressar(1000);
            estalvi.retirar(500);
            mostrarComptes(corrent, estalvi);

            // Traspassem 1000€ de cc a estalvi i mostrem
            System.out.println("### Traspas de 1000€ de CC a Estalvi ###");
            corrent.traspassar(estalvi, 1000);
            mostrarComptes(corrent, estalvi);

            // Calculem interessos i mostrem
            System.out.println("### Cálcul i ingrés d'interessos ###");
            corrent.calcularInteressos();
            estalvi.calcularInteressos();
            mostrarComptes(corrent, estalvi);

            // Retirem més del màxim
            System.out.println("### Retirem 2500€ ###");
            estalvi.retirar(2500);
            System.out.println("");

            // Traspassem més € que el que hi ha de saldo
            System.out.println("### Traspassem 50000€ del compte d'estalvi al CC ###");
            estalvi.traspassar(corrent, 50000);
            System.out.println("");
        } catch (ErrIBAN | ErrSaldoNoSuficient | ErrSuperaValor e) {
            System.out.println(e);
        }
    }

    public static void mostrarComptes(CompteBancari corrent, CompteBancari estalvi) {
        corrent.mostrarDades();
        estalvi.mostrarDades();
        System.out.println("");
    }

}
