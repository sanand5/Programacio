/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act.pkg8;

import java.util.Scanner;

/**
 *
 * @author sanzs
 */
public class Act8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Intrrodueix tots els numeros (recorda que si son decimals has d'escriure una \",\")\n");
        
        Scanner sc=new Scanner(System.in);
        
        int pos=0, neg=0;
        double num;
        
        do {
            num=sc.nextDouble();
                if ( num >= 0 ) {
                  pos++; 
                } else {
                    neg++;
                }
        } while ( num != 0 );
        
        if (neg>0) {
        System.out.println("Has introduit "+pos+" numeros postius i "+neg+" negatius");   
        }
    }
    
    
}
