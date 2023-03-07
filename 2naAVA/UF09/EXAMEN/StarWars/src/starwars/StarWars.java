/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package starwars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 *
 * @author sanand
 */
public class StarWars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> armesnauX = new ArrayList<String>();
        armesnauX.addAll(Arrays.asList("pistoles","metralletes" , "cañons"));
        Xwing nauX = new Xwing("nauX", "1234AAA", 500, "Joselui", armesnauX);
        nauX.mostrarCaracteristicas();
        ArrayList<Tripulant> tripulants= new ArrayList<Tripulant>();
        tripulants.addAll(Arrays.asList(new Tripulant("Andreu", 123, "Piloto"), new Tripulant("Raquel", 456, "Copiloto")/*, new Tripulant("Cristihan", 789, "78"), new Tripulant("Angles", 987, "Passatger")*/));
        nauX.afegirPassatgers(tripulants);
        nauX.eliminarPassatgers();
        nauX.mostrarPassatgers();
        
        Creuer creuer = new Creuer("Creuer", "1234BBB", 6000, 3000);
        creuer.mostrarCaracteristicas();
        creuer.afegirPassatgers(tripulants);
        creuer.mostrarPassatgers();

        
        ArrayList<Tripulant> tripulants2= new ArrayList<Tripulant>();
        tripulants.addAll(Arrays.asList(new Tripulant("Andreu", 123, "Piloto"), new Tripulant("Raquel", 456, "Copiloto"), new Tripulant("Cristihan", 789, "78"), new Tripulant("Angles", 987, "Passatger")));
        creuer.afegirPassatgers(tripulants);
        
        Carrega carrega1 = new Carrega("Carrega", "7894CCC", 8000, 600, 200);
        carrega1.mostrarCaracteristicas();
        carrega1.afegirPassatgers(tripulants);
        carrega1.mostrarPassatgers();
        carrega1.mostrarCaracteristicas();
        
        Passatgers pas = new Passatgers("gh", "hu", 200, 50, 8);
        pas.elevar(20);
        pas.mostrarCaracteristicas();
        pas.afegirPassatgers(tripulants2);
        pas.mostrarCaracteristicas();
        pas.mostrarPassatgers();
    }
    
}
/*
Comprovar getters and setters
*/