/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extra.uf06.c6_matrizsumatorios;

import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class ExtraUF06C6_MatrizSumatorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V[][] = new int[5][6];
        for (int i = 0; i < V.length-1; i++) {
            for (int j = 0; j < V[i].length-1; j++) {
                V[i][j] = (int) (100+Math.random()*900) ;
                V[i] [V[i].length-1]+= V[i][j];
                V[V.length-1][j]+= V[i][i];
            }
                V[V.length-1][V[i].length-1]+= V[i][5];
        }
        for (int i = 0; i < V.length; i++) {
                System.out.println("");
                if (i==V.length-1) {
                    System.out.print("  ");
                    for (int k = 0; k <= V.length; k++) {
                    System.out.print("······");
                    }
                    System.out.println("");
                }
                
            for (int j = 0; j < V[i].length; j++) {
                if (j<V[i].length-1) {
                System.out.printf("%6d",V[i][j]);
                }else {
                    System.out.printf(" | %3d",V[i][j]);
                }
            }
        }
        System.out.println("");
        
    }
    
}
