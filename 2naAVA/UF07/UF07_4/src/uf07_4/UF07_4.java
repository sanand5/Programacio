package uf07_4;

//@author Andreu Sanz Sanz

import java.util.Scanner;

public class UF07_4 {
    public static int fun(int x) {
        if (x>0) 
            return 2;
        else if (x<0) 
                return 1;
        else return 0;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un numero: ");
        int x = sc.nextInt();
        switch (fun(x)) {
            case 0 -> System.out.println("El valor es nulo");
            case 1 -> System.out.println("El valor es negativo");
            case 2 -> System.out.println("El valor es positivo");
        }
    }
}