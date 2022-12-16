package uf07_2;

//@author Andreu Sanz Sanz

import java.util.Scanner;

public class UF07_2 {
    public static boolean fun(int num) {
        if (num>=18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix la teua edat: ");
        int x = sc.nextInt();
        if (fun(x)) {
            System.out.println("Eres major de edat");
        }else {
            System.out.println("Eres menor de edat");
        }
    }

}
