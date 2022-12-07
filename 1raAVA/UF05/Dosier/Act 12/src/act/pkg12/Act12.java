/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act.pkg12;

import java.util.Scanner;

/**
 *
 * @author sanzs
 */
public class Act12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Donam A");
        
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        
        System.out.println("Donam B");
        double b=sc.nextDouble();
        double vegades=0,esp=1;
        if ( b < 0 ) {
            vegades = -b;
        }else vegades = b;
        for (int i = 1; i <= vegades ; i++) {
            esp=esp*a;
        }
        if ( b < 0 ) {
            esp=1/esp;
        }
        System.out.println("El resultat es "+esp);
    }
    
}
