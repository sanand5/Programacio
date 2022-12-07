/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act_14;

import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class Act_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Donam dos valors");
        Scanner sc= new Scanner(System.in);
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        if (x==y) {
            System.out.println("Els dos valors son iguals");
        } else {
            System.out.println("El major es "+Math.max(x, y));
        }
    }
    
}
