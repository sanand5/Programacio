package uf07_3;

//@author Andreu Sanz Sanz

import java.util.Scanner;

public class UF07_3 {
    public static int fun(int x, int y) {
        if(x<y)
            return x;
        else return y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un numero: ");
        int x = sc.nextInt();
        System.out.print("Dime otro numero: ");
        int y = sc.nextInt();
        System.out.println("El numero menor es: "+fun(x,y));
    }

}



