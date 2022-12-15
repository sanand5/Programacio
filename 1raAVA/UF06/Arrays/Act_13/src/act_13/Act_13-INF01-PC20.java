/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act_13;

import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class Act_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Val, Int, aplaria;
        Scanner sc=new Scanner(System.in);
        System.out.print("Intrdueix el valor V: ");
        Val=sc.nextInt();
        System.out.print("\nEntrodueix Inc: ");
        Int=sc.nextInt();
        System.out.print("\nCaunts valors vols? ");
        aplaria=sc.nextInt();
        int V[]=new int [aplaria];
        for (int i = 0; i < V.length; i++) {
            V[i]=Val+Int*i;
            System.err.print(V[i]+"  ");
        }
        System.out.println("");
        
    }
    
}
