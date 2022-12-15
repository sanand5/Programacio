/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extra.uf06.c7_estaturas;

/**
 *
 * @author sanand
 */
public class ExtraUF06C7_Estaturas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String P[] = {"España", "Rusia", "Japón", "Australia"};
        int V[][] = new int[4][10];
        System.out.print("          ");
            for (int i = 0; i < V[0].length; i++) {
                System.out.print("      ");
            
        }
            System.out.println("     MED  MIN  MAX");
        for (int i = 0; i < V.length; i++) {
            int M[] = {0, 240, 0};

            for (int j = 0; j < V[i].length; j++) {
                V[i][j] = (int) (140 + Math.random() * 71);
                M[0] += V[i][j];
                M[1] = Math.min(M[1], V[i][j]);
                M[2] = Math.max(M[2], V[i][j]);
            }

            M[0] /= V[i].length;
            System.out.printf("%9s:", P[i]);

            for (int j = 0; j < V[i].length; j++) {
                System.out.printf("%6d", V[i][j]);
            }
            System.out.print("  |");

            for (int j = 0; j < M.length; j++) {
                System.out.printf("%5d", M[j]);
            }
            System.out.println("");
        }

    }

}
