package uf07_20;

// Andreu Sanz Sanz

import java.util.Scanner;


public class UF07_20 {
    public static void fun(int num) {
        for (int i = 1; i <= 10; i++) 
            System.out.printf("%2d x %d = %d\n",i,num,num*i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tabla del: ");
        fun(sc.nextInt());
    }
}