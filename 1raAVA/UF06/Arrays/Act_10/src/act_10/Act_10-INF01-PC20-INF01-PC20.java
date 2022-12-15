/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act_10;

import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class Act_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Donam un numero");
        int n=sc.nextInt();
        double suma=0, max=-1, min=999999999;
        double V[]= new double [n];
        for (int i = 0; i < V.length; i++) {
            V[i] = sc.nextDouble();
            suma+=V[i];
            max=Math.max(max, V[i]);
            min=Math.min(min, V[i]);
        }
        System.out.println("La mitjana es: "+suma/n+"\nLa maxima altura es: "+max+"\nI la minima es: "+min);
    }
    
}
