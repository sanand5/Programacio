/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf09_05;

/**
 *
 * @author sanand
 */
public class UF09_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleat Andreu = new Empleat("Andreu", "123456789C", 5000,"Ah" , 654168884, 18);
        Empleat Rachet = new Empleat("Rachet", "987456321A", 1000);
        Empleat Cristhian = new Empleat("Cristhian", "147852369D", 2000);
        Empleat JozeLui = new Empleat("JozeLui", "369852147F", 3000);
        Empresa Amazonas = new Empresa("Amazonas", "A654489661", 8888888, "Oh");
        Empresa Pera = new Empresa("Pera", "F36817846816", 333333, "Uiiiii");
        Andreu.mostarDades();
        Amazonas.afegir(Rachet);
        Amazonas.afegir(Cristhian);
        Pera.afegir(Andreu);
        Pera.afegir(JozeLui);
        
        Amazonas.mostrarTot();
        
        Pera.mostrarSous();
        
        Amazonas.eliminar(0);
        Pera.sumaBrut();
    }
    
}
