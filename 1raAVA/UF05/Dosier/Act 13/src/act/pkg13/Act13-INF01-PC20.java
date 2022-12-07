/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act.pkg13;

import java.util.Scanner;

/**
 *
 * @author sanzs
 */
public class Act13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);        
        int max=100, min=1, an=0, num, res;
        boolean seguit=true;
        System.out.println("Pensa un num no decimal del 1 al 100");
        while ( seguit == true ) {
            num=(max+min)/2;
            if (an==99 && num==99) {
                num=100;
            }
            System.out.println("El numero es major(0), menor(1) o igual(2) a "+num+"?");
            res=sc.nextInt();
            switch (res) {
                case 0:
                    min=num;
                    an=num;
                    break;
                case 1:
                    max=num;
                    an=num;
                    break;
                case 2:
                   seguit=false;
                    break;
                default:
                    System.err.println("Error, torna-m'ho a dir");    
            }
                    
        } System.out.println("Encertat");
    }
    
}
