/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array50;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class Array50 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Cantitat de valors = ");
        int V[] = new int[sc.nextInt()];
        int cant=0, pos=0;
        
        for (int i = 0; i < V.length; i++) {
            V[i]= (int) (Math.random()*100) ;   //Aleatori entre 0 i 100
            if (V[i]>=50) {                     //Comproba si es major a 50 per a saber quantes pos ha de tindre el array nou
                cant++;
            }
        }
        int R[] = new int[cant];
        for (int i = 0; i < V.length; i++) {
            if (V[i]>=50) {                     //comproba si es major a 50 i guarda en array
                R[pos]=V[i];
                pos++;
            }
            
        }
//        Arrays.sort(R);
        System.out.println("La primera array es: "+Arrays.toString(V));
        if (cant==0) {
            System.out.println("No s'ha trobat cap valor major o igual a 50 :(");
        }else System.out.println("La segona array ordenada amb valors majors o iguals a 50 es: "+Arrays.toString(R));
        
    }
    
}
