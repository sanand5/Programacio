/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act.pkg19;

import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class Act19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if (num>0){ 
            for (int i = 0; i < num; i++) {
                System.out.print("* ");
            }
        }else System.out.println("*");
        
    }
    
}
