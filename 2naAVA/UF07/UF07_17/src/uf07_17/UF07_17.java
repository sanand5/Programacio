package uf07_17;

// Andreu Sanz Sanz

import java.util.Scanner;


public class UF07_17 {
    public static String fun(int num) {
        boolean primo=true;
        for (int i = 1; i <= num; i++) {
            if (num%i==0) {
                primo=false;
            }
        }
        return (primo)?"Primo":"No primo";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do{
        System.out.print("Numero: ");
        num = sc.nextInt();
        System.out.println(fun(num));
        }while (num>0);
    }
}
