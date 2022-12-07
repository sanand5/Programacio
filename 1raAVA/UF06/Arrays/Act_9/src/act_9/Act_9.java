/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act_9;

import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class Act_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        int V[]=new int [100];
        
        System.out.print("Disme un numero enter: ");
        int num=sc.nextInt();
        
        boolean trobat=false, text=true;
        
        //Creació del vector
        for (int i = 0; i < V.length; i++) {
            V[i] = (int) (1+ Math.random()*10);
            }
        //Buscar numero

        for (int i = 0; i < V.length; i++) {

            if (V[i]==num) {
                if (text) {
                    System.out.print("\nEl número "+num+" esta en les posicions ");
                }
                System.out.print(", "+i);
                trobat=true;
                text=false;
            }
        }
        if (trobat==false) {
            System.err.println("No s'ha trobat cap numero");
        }
    }
    
}
