/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act3;

import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class Act3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriu el teu nom");
        String nom=sc.nextLine();
        nom=nom.toUpperCase();
        
        System.out.println("Escriu el primer cognom");
        String cog1=sc.nextLine();
        cog1=cog1.toUpperCase();
        
        System.out.println("Escriu el segon cognom");
        String cog2=sc.nextLine();
        cog2=cog2.toUpperCase();
        
        System.out.println("\n"+nom.substring(0,3)+cog1.substring(0,3 )+cog2.substring(0,3));
        
        
       
    }
    
}
