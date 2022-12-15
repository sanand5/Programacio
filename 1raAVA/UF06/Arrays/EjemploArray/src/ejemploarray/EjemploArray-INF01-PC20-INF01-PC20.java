/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploarray;

/**
 *
 * @author sanand
 */
public class EjemploArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nota[]= {7,3,9,6,5};
        int j=0;
        for (int i = 0; i < nota.length; i++) {
            System.out.print(nota[i]+"\t");
            j+=nota[i];
        }
        System.out.println("\nLa mitgana es: "+j/nota.length);
        
    }
    
}
