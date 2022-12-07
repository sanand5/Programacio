/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act_7;

import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class Act_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Donam dos valors");
        int P=sc.nextInt();
        int Q=sc.nextInt();
        int res=Q-P;
        double V[]=new double [res+1];
        for (int i = 0; i < V.length; i++,P++) {
            V[i]=P;
            System.out.print(V[i]+"\t");
            
        }
    }
    
}
