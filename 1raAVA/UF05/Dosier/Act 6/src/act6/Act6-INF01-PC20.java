/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act6;

import java.util.Scanner;

/**
 *
 * @author sanzs
 */
public class Act6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereç
        System.out.println("Introdueix 10 numeros perfavor");
        Scanner sc=new Scanner(System.in);
        int num;
        boolean neg=false;
        for (int i = 0; i < 10; i++) {
            num=sc.nextInt();
            if(num<0){
            neg=true;
            }
        }
        if (neg==true) {
            System.out.println("Segons els meus calculs eres una persona negativa, ves al psicoleg :(");
        }else System.out.println("Eres una persona molt positiva");
    }
    
}
