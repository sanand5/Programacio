/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act1;

import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class Act1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriu una frase");
        String p=sc.nextLine();
        
       
        String[] arrayp = p.split(" ");
        
        for (int i = 0; i < arrayp.length; i++) {
            System.out.println(arrayp[i]);
            
        }
        
    }
    
}
