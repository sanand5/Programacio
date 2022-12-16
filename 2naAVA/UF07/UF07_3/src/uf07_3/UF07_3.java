package uf07_3;

//@author Andreu Sanz Sanz

import java.util.Scanner;

public class UF07_3 {
    public static int fun(int x, int y) {
        return Math.max(x, y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime x: ");
        int x = sc.nextInt();
        System.out.print("Dime y: ");
        int y = sc.nextInt();
        System.out.println(fun(x,y));
    }

}
