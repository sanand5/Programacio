/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf06m_3;

import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class UF06M_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Files = ");
        int n = sc.nextInt();
        System.out.print("Columnes = ");
        int m = sc.nextInt();
        int majors=0,menors=0,iguals=0;
        int V[][] = new int[n][m];
        
        for (int i = 0; i < V.length; i++) {
            for (int j = 0; j < V[i].length; j++) {
                System.out.print("num en "+i+","+j+" = ");
                V[i][j] = sc.nextInt();
                if (V[i][j]>0) {
                    majors++;
                } else {
                    if (V[i][j]<0) {
                        menors++;
                    } else {
                        iguals++;
                    }
                }
            }
        }
        System.out.println("Numeros > 0 = "+majors);
        System.out.println("Numeros < 0 = "+menors);
        System.out.println("Numeros = 0 = "+iguals);
    }
    
}
