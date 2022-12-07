/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf4.pkg17;

import java.util.Scanner;

/**
 *
 * @author sanzs
 */
public class UF417 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int die=sc.nextInt();
        int hores=sc.nextInt();
        int min=sc.nextInt();
        int seg=sc.nextInt();
        
        if (seg==59) {
            seg=0;
            min++;
            if (min==60 ) {
                min=0;
                hores++;
                if (hores==25) {
                    hores=0;
                    die++;
                }
            }
        } 
        System.out.println(die+" "+hores+" "+min+" "+seg);
    }
    
}
