/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act_16;

import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class Act_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Disme una nota");
        Scanner sc=new Scanner(System.in);
        double nota= sc.nextByte();
        if (nota<=3) {
            System.out.println("Molt deficient");
        } else if (nota<=5) {
            System.out.println("Insuficient");
        } else if (nota <=6) {
            System.out.println("Bé");
        } else if (nota<=9) {
            System.out.println("Notable");
        }else System.out.println("Excelent");
    }
    
}
