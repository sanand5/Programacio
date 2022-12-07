/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act5;

import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class Act5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Disme un num: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int fact=1;
        
        while (num>1){
            fact=fact*num;
            num--;
        }
        System.out.println("El factorial es: "+fact);
                
    }
    
}
