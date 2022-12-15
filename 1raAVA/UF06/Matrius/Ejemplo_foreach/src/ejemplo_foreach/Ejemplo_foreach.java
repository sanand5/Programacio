/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo_foreach;

/**
 *
 * @author sanand
 */
public class Ejemplo_foreach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int V[]={1,2,3,4,5,6,7,8,9};
        for (int i : V) {
            i+=1;
            System.out.printf("[%d] ",i);
        } 
        System.out.println("");
        
    }
    
}
