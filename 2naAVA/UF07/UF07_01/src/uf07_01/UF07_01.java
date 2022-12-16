package uf07_01;
//@author sanand

import java.util.Scanner;


public class UF07_01 {
    public static double fun(double x, double y) {
        return x*y;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime el primer num: ");
        double x = sc.nextInt();
        System.out.print("Dime el segundo num: ");
        double y = sc.nextInt();
        System.out.println("La multiplicacioón es: "+fun(x,y));
    }
}
