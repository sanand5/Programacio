/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act4;

import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class Act4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriu una frase");
        String frs=sc.nextLine();
        
        frs=frs.toLowerCase();
        
        char voc[]={'a','e','i','o','u'};
        char C[]=frs.toCharArray();
        
        for (int i = 0; i < voc.length; i++) {
            int cont=0;
            for (int j = 0; j < C.length; j++) {
                if (C[j]==voc[i]) {
                cont++;
                }   
            }
            System.out.println("Num de "+voc[i]+"'s: "+cont);
        }
    }
}
