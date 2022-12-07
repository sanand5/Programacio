/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act_16;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class Act_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int V[] = new int [10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduix 10 valors");
        for (int i = 0; i < V.length; i++) {
            V[i]=sc.nextInt();
        }
        int R[] = new int [10];
        System.out.println("Introduix 10 valors més");
        for (int i = 0; i < R.length; i++) {
            R[i]=sc.nextInt();
        }
//        Arrays.compare(V, R)
        if (Arrays.equals(V, R)==false) {
            System.out.println("Els vectors no son iguals");
        }else   System.out.println("Els vectors son iguals");
    }
    
}
