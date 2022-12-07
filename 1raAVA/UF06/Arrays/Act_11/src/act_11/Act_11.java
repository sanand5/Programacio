/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act_11;

/**
 *
 * @author sanand
 */
public class Act_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int V[]=new int [100];
        int R[]=new int [100];

        //Creació del primer vector i exida
        System.out.print("V = ");
        for (int i = 0; i < V.length; i++) {
            V[i] = i+1;
            System.out.print(V[i]+"  ");
        }
        //Creació del primer vector i exida
        System.out.print("\nR = ");
        for (int i = 0; i < R.length; i++) {
            R[i]=V[99-i];
            System.out.print(R[i]+"  ");
        }
    }
}
