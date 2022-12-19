package uf07_7;

//@author Andreu Sanz Sanz

import java.util.Scanner;

public class UF07_7 {
    public static double area(double ample, double alt) {
        return ample*alt;
    }
    public static double per(double ample, double alt) {
        return ample*2+alt*2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Disme les mesures en metres\n");
        System.out.print("Ample: ");
        double ample = sc.nextDouble();
        System.out.print("Alt: ");
        double alt = sc.nextDouble();
        System.out.printf("El area del rectangle es: %.3fm2\n",area(ample, alt));
        System.out.printf("El perimetre del rectangle es: %.3fm\n",per(ample,alt));
    }

}
