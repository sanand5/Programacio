/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collatz;

import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class Collatz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        boolean pregunta=true;
        int num=0;
        while(num!=1){
            if (pregunta==true) {   //comproba si ja ha fet la pregunta
                System.out.print("Introdueix un numero major que 1: ");
                num = sc.nextInt();
//                System.out.print(num+"\t");
                pregunta=false;   
            }
            if (num<1) {
                System.err.println("Error, tona a probar");
                pregunta=true;      
                
            } else {
                if (num%2==0) {     //comproba si es par
                num/=2;
                
            }else num=num*3+1;
            System.out.print(num+"\t");
            }
            
        }
        
    }
    
}
