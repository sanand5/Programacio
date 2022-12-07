/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act_14;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class Act_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Tamany de l'array: ");
        int V[] = new int [sc.nextInt()];
        System.out.print("Num: ");
        int num = sc.nextInt();
        Arrays.fill(V,num);
        System.out.println(Arrays.toString(V));
        
    }
    
}
