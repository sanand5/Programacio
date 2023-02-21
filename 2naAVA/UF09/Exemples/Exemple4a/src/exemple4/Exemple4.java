/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemple4;

import java.util.ArrayList;

/**
 *
 * @author sanand
 */
public class Exemple4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1 = new Persona("Andreu", "45346545", "HA", 44625252);
        p1.mostrarPersona();
        System.out.println();
        ArrayList notes = new ArrayList();
        notes.add(5);
        notes.add(5);
        notes.add(5);
        Alumne a2 = new Alumne(1, 1, "DAM", "Andreu", "414141C", "NOSE", 4648641, notes);
        ArrayList moduls = new ArrayList();
        moduls.add("FOL");
        moduls.add("BBDD");
        moduls.add("ED");
        Professor prof1 = new Professor("FOL", "mai", 482, "Maria Luisa", "777C", "SISE", 418441419, moduls);
        a2.mostrarPersona();
        System.out.println();
        prof1.mostrarPersona();
    }
    
}
