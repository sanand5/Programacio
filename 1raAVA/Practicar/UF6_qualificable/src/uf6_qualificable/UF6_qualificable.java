/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf6_qualificable;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author sanzs
 */
public class UF6_qualificable {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int ampl=0, pos=0;
        for (int i = 1; i <= 10; i++) {
            ampl+=i;
        }int V[] = new int[ampl];
        
        for (int i = 1; i <= 10; i++) {
            for (int k = pos; k < pos+i; k++) {
                V[k]=i;
            }
            pos+=i;
        }
        System.out.println(Arrays.toString(V));
        
        //EXTRA
        
        int L[] = new int[8];
        for (int i = 0; i < L.length; i++) {
            L[i]= sc.nextInt();
        }Arrays.sort(L);
        
        for (int i = 0; i < L.length; i++) {
            System.out.printf("%03d%n",L[L.length-i-1]);
        
    }
        
    }
    
}
