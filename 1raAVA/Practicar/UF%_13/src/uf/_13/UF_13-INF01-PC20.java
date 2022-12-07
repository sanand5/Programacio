/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf._13;

import java.util.Scanner;

/**
 *
 * @author sanzs
 */
public class UF_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int max=101;
        int min=1;
        boolean resolt =false;
        do {
            int p=(max+min)/2;
            System.out.println("es: "+p);
            int res = sc.nextInt();
            switch (res) {
                case 1:
                    max=p;
                    break;
                case 2:
                    min=p;
                    break;
                case 0:
                    resolt=true;
                    break;
                default:
                    System.out.println("Com?");
            }
        } while (resolt==false);
    }
    
}
