/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act17;

import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class Act17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int max =0, num, contn=0, contf=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Donam un numero inicial: ");
        num=sc.nextInt();
        
        while( num != 0 ){
            
            if ( max > num ) {
                System.err.println("El numero es menor");
                contf++;
            } 
            contn++;
            max=num;
            System.out.print("Donam un numero: ");
            num=sc.nextInt();
            
        }
        System.out.println("La cantitat de nombres introduits es: "+contn+"\nLa cantitat de nombres fallats es: "+contf);
    }
    
}
