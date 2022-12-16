/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemple_01;

/**
 *
 * @author sanand
 */
public class Exemple_01 {

    public static int suma(int a, int b ) {return a+b;}
    public static void par(int a) {
        if (a%2==0) {
            System.out.println("par");
        } else {
            System.out.println("impar");
        }
    a++;
    a++;
    }
    
    public static void main(String[] args) {
        int h=0;
        h++;
        System.out.println(suma(2, 3));
        par(3);
    }
    
}
