/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf09_marc;

/**
 *
 * @author sanand
 */
public class UF09_MARC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Biblioteca benipeixcar = new Biblioteca("Benipeixcar", "Gandia");
        benipeixcar.afegir(new Llibres(123, "Bromera", "Els dimonis de pandora"));
        benipeixcar.afegir(new Llibres(456, "No ho se", "Pelo pico pata"));
        benipeixcar.afegir(new DVDs(2, "video", "Avatar"));
        benipeixcar.afegir(new DVDs(3, "video", "XXX"));
        benipeixcar.mostrarTot();
        
        Biblioteca bx = new Biblioteca("Ajuntament", "Barx", new DVDs(0, "rom", "titol"), new Llibres(0, "editorial", "titol"));
        bx.mostrarTot();
        benipeixcar.canviar(bx, benipeixcar.getLlista().get(0));
        benipeixcar.mostrarTot();
        bx.mostrarTot();
        
        Usuari andreu = new Usuari("Andreu", "Gandia");
        Usuari pau = new Usuari("Pau", "Gandia");
        benipeixcar.getLlista().get(0).prestarUsuari(andreu);
        benipeixcar.getLlista().get(0).prestarUsuari(pau);
        
        benipeixcar.mostrarDisponibles();
        
        System.out.println(Usuari.getNusuaris());
        
    }
    
}
