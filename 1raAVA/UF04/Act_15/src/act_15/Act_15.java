/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act_15;

import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class Act_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Donam 3 valors");
        Scanner sc=new Scanner(System.in);
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        double l=sc.nextDouble();
        
        System.out.println("El valor mes alt es "+Math.max(Math.max(x, y), l));
    }
    
}
