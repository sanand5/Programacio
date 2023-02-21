/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici1;

/**
 *
 * @author sanand
 */
public class Exercici1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int longitudVector = 3;
        String opciones[] = new String[longitudVector];
        opciones[0]="FOL";
        opciones[1]="PROGRAMACIÓ";
        opciones[2]="BBDD";
        Menu dam1 = new Menu("1 DAM", 3, opciones);
        opciones[0]="ACCes a dades";
        opciones[1]="programacio multimedia";
        opciones[2]="FCT";
        Menu dam2 = new Menu("2 DAM", 3, opciones);
        dam1.triarOpcio();
        dam2.triarOpcio();
        Menu dam = new Menu("DAM", dam1, dam2);
        dam.triarOpcio();
    }
    
}
