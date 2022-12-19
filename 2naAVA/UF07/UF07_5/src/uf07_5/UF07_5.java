package uf07_5;

//@author Andreu Sanz Sanz

import java.util.Scanner;

public class UF07_5 {
    public static double fun(int x) {
        return x*1.60934;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime una distancia en milles: ");
        int x = sc.nextInt();
        System.out.printf("En kilometres es: %f km\n",fun(x));
    }

}
