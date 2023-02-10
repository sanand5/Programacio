/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemple4;

/**
 *
 * @author sanand
 */
public class Persona {
    private String nom="Andreu";
    String dni="524981896";
    public Persona(String nom, String dni){
        this.nom=nom;
        this.dni=dni;
    }
    public void mostrarPersona() {
        System.out.println("Nom: "+this.nom);
        System.out.println("DNI: "+this.dni);
    }
}
