/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf06_extra;



import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class UF06_Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
//        Recollida de dadesa
        System.out.print("Quants jugadors sou: ");
        int play=sc.nextInt();
        System.out.println("Introdueix totes les puntuacions");
        
//        Creació del vector
        int V[]=new int [play];
        for (int i = 0; i < V.length; i++) {
            V[i]=sc.nextInt();
        }
        
//        Ordenació del vector i despres imprimir amb ordre descendent
        Arrays.sort(V);     
        
        System.out.println("El ranking es el seguent:");
        for (int i = 1; i <= V.length; i++) {               //i=1 per a poder traure el ranquing desde "1. " 
            System.out.println(i+". "+V[V.length-i]);       //[V.length-i] per a poder traure amb el sentit contrari, per tant, amb un ordre descendent
        }
        
    }
    
}
