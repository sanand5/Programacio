package uf07_8;

//@author Andreu Sanz Sanz

import java.util.Scanner;

public class UF07_8 {
    public static int suma(int x) {
        int i=1;
        int suma=0;
        while (x>=i) {
            suma+=i;
            i++;
        }
        return suma;
    }
    public static double mit(int x) {
        return (x+1)/2;
    }
    public static int mul(int x) {
        int i=1;
        int prod=1;
        while (i<x) {
            prod*=i;
        }
        return prod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero: ");
        int x = sc.nextInt();
        System.out.println("El sumatorio es: "+suma(x));
        System.out.println("La mitad es: "+ mit(x));
        System.out.println("El producto es: "+mul(x));
        
    }

}
