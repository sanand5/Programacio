/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf06m_02;

/**
 *
 * @author sanand
 */
public class UF06M_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int V[][] = new int[10][10];
        for (int i = 0; i < V.length; i++) {
            for (int j = 0; j < V[i].length; j++) {
                V[i][j]=(j+1)*(i+1);
                System.out.printf("%4d",V[i][j]);
            }
            System.out.println("");
        }
    }
    
}
