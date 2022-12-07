/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;
import java.util.Arrays;
/**
 *
 * @author sanzs
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int V[] = new int[10];
//        int L[] = new int[10];
        int cont=0;
        for (int i = 1; i <= V.length; i++) {
            V[i-1]= (int) Math.round(Math.random());
            if (Arrays.binarySearch(V, 1) > -1) {
                cont++;
            }
        }
        System.out.println(cont);
        System.out.println(Arrays.toString(V));
//        System.out.println(Math.round(1.632534*1000)/1000d);
//         int L[] =V.clone();
         int R[] =Arrays.copyOf(V, 20);
        System.out.println(Arrays.toString(R));
//        System.out.println(Arrays.toString(R));
        
    }
    
}
