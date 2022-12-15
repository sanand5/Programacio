/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package treball.obligatori;

import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class TreballObligatori {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
//        Demanar dades
        
        System.out.print("Donam un numero: ");
        int num = sc.nextInt(), res;
        
        boolean asterisco=true;
        System.out.print("Vols fer la piramide amb numeros Si(0) / No (1): ");
        res=sc.nextInt();
        
        if (res==0) asterisco=false;
        
//        Creació de les espais
        for (int fila = 0; fila < num+1; fila++) {
            for (int espais = 0; espais < (num-fila); espais++) {
                System.out.print(" ");
            }
            
//            Creació de les files
            for (int relleno = 0; relleno < (fila*2)-1; relleno++) {
                if (asterisco==true){
                System.out.print("*");
                }else System.out.print(fila);
            }
            
            
            System.out.println("");
            
        }
    }
    
}
