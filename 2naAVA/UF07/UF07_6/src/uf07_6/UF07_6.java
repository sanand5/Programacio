package uf07_6;

//@author Andreu Sanz Sanz

import java.util.Scanner;

public class UF07_6 {
    public static double fun(double num) {
        return num*1.21;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            double x;
            System.out.print("Preu sense IVA: ");
            x = sc.nextDouble();
            System.out.printf("El preu amb IVA: %.2f€\n",fun(x));
        }
    }

}
