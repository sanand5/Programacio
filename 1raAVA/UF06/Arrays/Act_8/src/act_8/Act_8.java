/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act_8;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class Act_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        double V[]=new double [100];
        int cont=0;
        System.out.print("Disme un numero real: ");
        double num=sc.nextDouble(), random;
        for (int i = 0; i < V.length; i++) {
            V[i] = Math.random();
            if(V[i]>=num){
                cont++;
            }
        }
        if (cont>=1) {
            System.out.println("S'han trobat "+cont+" iguals o majors");
        }else System.err.println("No s'ha trobat cap numero igual o majors");
        
    }
    
}
