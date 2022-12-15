/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extra.uf06.c6_matrizsumatorios;

/**
 *
 * @author sanand
 */
public class ExtraUF06C6_MatrizSumatorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int V[][] = new int[4][5];
        int total=0;

        for (int i = 0; i < V.length; i++) {
            int suma=0;
            for (int j = 0; j < V[i].length; j++) {
                V[i][j]=(int) (100+Math.random()*900);
                suma += V[i][j];
                total += V[i][j];
                System.out.printf("%6d",V[i][j]);
            }
            System.out.printf("  |%6d",suma);
            System.out.println("");
        }
        System.out.print("  ");
        for (int i = 0; i < V[0].length; i++) { //decorat horitzontal
            System.out.print("------");
        }System.out.println("+-------");
        
        for (int i = 0; i < V[0].length; i++) { //última fila
            int suma=0;
            for (int j = 0; j < V.length; j++) {
                suma+=V[j][i];
            }System.out.printf("%6d",suma);
        }System.out.printf("  |%6d\n",total);
    }
    
}
