/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf11_04;

/**
 *
 * @author sanand
 */
public class UF11_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Carret elMeuCarret = new Carret();
        elMeuCarret.agrega(new Element("Tarjeta SD 64Gb", 19.95, 2));
        elMeuCarret.agrega(new Element("Canon EOS 2000D", 449, 1));

        System.out.println(elMeuCarret);
        System.out.print("Hi ha " + elMeuCarret.numElements());
        System.out.println(" productes a la cistella");
        System.out.println("El total ascendeix a "
                + String.format("%.2f", elMeuCarret.importTotal()) + " euros");
        System.out.println("\nContinua la compra...\n");
        elMeuCarret.agrega(new Element("Samsung Galaxy Tab", 199, 3));
        elMeuCarret.agrega(new Element("Tarjeta SD 64Gb", 19.95, 1));
        System.out.println(elMeuCarret);
        System.out.print("Ara hi ha " + elMeuCarret.numElements());
        System.out.println(" productes a la cistella.");
        System.out.println("El total ascendeix a "
                + String.format("%.2f", elMeuCarret.importTotal()) + " euros");
       

    }

}
