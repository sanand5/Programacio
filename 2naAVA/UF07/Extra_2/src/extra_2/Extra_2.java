/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package extra_2;

// @author sanzs

import java.util.Scanner;


public class Extra_2 {
    public static void rellenar(int[][] V) {
        for (int i = 0; i < V.length; i++) {
            for (int j = 0; j < V[i].length; j++) {
                V[i][j] = (int) (Math.random() * 10);
            }
        }
    }
    public static void mostrar(int[][] V) {
        for (int i = 0; i < V.length; i++) {
            for (int j = 0; j < V[i].length; j++) {
                System.out.printf("%3d",V[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] transposada(int[][] V) {
        int trans[][] = new int[V[0].length][V.length];
        
        System.out.println("");
        for (int i = 0; i < V[0].length; i++) {
            for (int j = 0; j < V.length; j++) {
               trans[i][j]=V[j][i];
            }
        }
        return trans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dimensions[] = new int[2];
        String[] filacolumn ={"Files? ", "Columnes? "};
        for (int i = 0; i < 2; i++) {
            System.out.print(filacolumn[i]);
            dimensions[i] = sc.nextInt();
            if (dimensions[i]<1) {
                i--;
                System.err.println("No pots introduir numeros menors a 1");
            }
        }
        int V[][] = new int[dimensions[0]][dimensions[1]];
        rellenar(V);
        mostrar(transposada(V));
        System.out.println("---------------------------------------");
        mostrar(V);
    }
}
