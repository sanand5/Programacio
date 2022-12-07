/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temp;

import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class Temp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String[] mes= {"Gener", "Febrer", "Març", "Abril", "Maig", "Juny", "Juliol", "Agost", "Setembre", "Octubre", "Novembre", "Decembre"};
        int V[] = new int[mes.length];              //array de temperatura

        for (int i = 0; i < mes.length; i++) {
            System.out.print("Temperatura mitjana que ha fet el mes de "+mes[i]+": ");      //pregunta la temperatura i guarda en una altra arry
            V[i] = sc.nextInt();
        }
        
        for (int i = 0; i < V.length; i++) {        //dira quans asteriscos aura d'escriure
            System.out.printf("\n"+mes[i]+"    \t|");     
            for (int j = 0; j < V[i]; j++) {        //esfcriu els asteriscos
                System.out.print("*");
            }
            System.out.print(" "+V[i]+"ºC");        //escriu la temperatura
        }    
    }
}
