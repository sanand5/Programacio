/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act_15;

import java.util.Arrays;

/**
 *
 * @author sanand
 */
public class Act_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int V[] = new int [55];
        int pos=0;

        int i;
        
        for ( i = 0; i <= 10; i++) {
            Arrays.fill(V , pos , pos+i , i);
                    pos+=i;
            
        }
        System.out.println(Arrays.toString(V));
    }
    
}
