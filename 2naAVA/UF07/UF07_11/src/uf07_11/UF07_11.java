package uf07_11;

//@author Andreu Sanz Sanz

import java.util.Scanner;

public class UF07_11 {
    public static void fun(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%2d x%3d = %4d\n",num,i,i*num);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduix un numero: ");
        fun(sc.nextInt());   
    }
}
