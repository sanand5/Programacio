/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act.pkg16;

import java.util.Scanner;

/**
 *
 * @author sanzs
 */
public class Act16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introdueix un numero");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean primo=true;
        for (int i = 2; i < num; i++) {
            if(num%i==0){
                primo =false;
            }
        }
        if (primo==true) {
            System.out.println("El numero es primo");
        } else {
            System.err.println("El numero no es primo");
        }
    }
    
}
