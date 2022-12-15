/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act.pkg15;

import java.util.Scanner;

/**
 *
 * @author sanzs
 */
public class Act15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Dis-me un numero");
        Scanner sc=new Scanner(System.in);
        double num=sc.nextDouble();
        int mult =((int) Math.floor(num))/3;
        System.out.println("Cantidad de multiplos de 3: "+Math.abs(mult));
    }
    
}
