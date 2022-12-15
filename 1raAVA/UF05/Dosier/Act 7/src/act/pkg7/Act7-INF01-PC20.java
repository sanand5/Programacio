/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act.pkg7;

import java.util.Scanner;

/**
 *
 * @author sanzs
 */
public class Act7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Introdueix 10 numeros (recorda que si son decimals has d'escriure una \",\")\n");
        double num;
        int positius=0;
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            num=sc.nextDouble();
            if(num>0){
            positius++;
            }
        }
        System.out.println("Has introduit "+positius+" numeros postius i "+(10-positius)+" negatius");
    }
    
}
