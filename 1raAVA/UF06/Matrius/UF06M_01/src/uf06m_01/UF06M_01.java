/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf06m_01;

/**
 *
 * @author sanand
 */
public class UF06M_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int V[][] = new int[5][5];
        int cont=1;
        for (int i = 0; i < V.length; i++) {
            for (int j = 0; j < V[i].length; j++) {
                V[i][j] = cont;
                System.out.printf("%3d",V[i][j]);
                cont++;
            }
            System.out.println("");
        }
       
        }
    }


