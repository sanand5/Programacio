/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act_12;

import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class Act_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int V[]=new int [10];
        boolean salir=false;
        int num, pos;
        String menu;
        System.out.println("###########################");
        System.out.println("     Mostrar valors (a)");
        System.out.println("     Introduir valors (b)");
        System.out.println("     Eixir (c)");
        System.out.println("     Restaurar (d)");
        System.out.println("###########################\n");
        
        while (salir==false){
            System.out.print("Que vols fer: ");
            menu = sc.nextLine();

            switch(menu) {
                case "a":
                    for (int i = 0; i < V.length; i++) {
                        System.out.print(V[i]+"  ");
                        
                    }
                    System.out.println(" ");
                break;

                case "b":
                    System.out.print("Valor: ");
                    num=sc.nextInt();
                    System.out.print("Posició: ");
                    pos=sc.nextInt();
                    sc.nextLine();
                    V[pos]=num;
                    
                break;

                case "c":
                    salir=true;
                break;
                
                case "d":
                    for (int i = 0; i < V.length; i++) {
                        V[i]=0;
                        
                    }
                    
                break;
                default:
                    System.err.println("No reconeix aquest commando");

            }
        }
    }
    
}
