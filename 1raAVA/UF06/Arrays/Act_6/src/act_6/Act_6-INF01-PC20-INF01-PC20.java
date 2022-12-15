/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act_6;

import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class Act_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n, m;
        System.out.println("Donam dos numeros");
        n=sc.nextInt();
        m=sc.nextInt();
        double V[]=new double [n];
        for (int i = 0; i < V.length; i++) {
            V[i] = m;
            System.out.print(V[i]+"\t");
        }
        
        
    }
    
}
