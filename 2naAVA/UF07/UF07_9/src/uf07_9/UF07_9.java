package uf07_9;

//@author Andreu Sanz Sanz

import java.util.Scanner;

public class UF07_9 {
    public static int fun(int x, int z) {
        
        return Math.max(x, z);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor 01: ");
        int x = sc.nextInt();
        System.out.print("Valor 02: ");
        int y = sc.nextInt();
        System.out.print("Valor 03: ");
        int z = sc.nextInt();
        System.out.println("El mayor es: "+fun(fun(x, y),z));
        
    }

}
