/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemple4;

/**
 *
 * @author sanand
 */
public class Alumne extends Persona{
     String assignatura="Programació";
     double nota=3.55;
     public Alumne(String nom, String dni, String assignatura, double nota){
         super(nom, dni);
         this.assignatura=assignatura;
         this.nota=nota;
     }
     @Override
     public void mostrarPersona() {
         super.mostrarPersona();
         System.out.println("Assignatura: "+assignatura);
         System.out.println("Nota: "+nota);
        
    }
}
