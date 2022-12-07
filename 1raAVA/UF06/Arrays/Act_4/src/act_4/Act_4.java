/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act_4;

import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class Act_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int V[]=new int[20];
        int neg=0, pos=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Escriu 20 numeros");
        for (int i = 0; i < V.length; i++) {
            V[i]=sc.nextInt();
            if (V[i]>=0) {
                pos+=V[i];
            }else neg+=V[i];
        }System.out.println("La suma dels pos es: "+pos+"\nLa suma dels negatius es: "+neg);
    }
    
}
