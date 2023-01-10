package uf07_19;

// Andreu Sanz Sanz

import java.util.Scanner;


public class UF07_19 {
    public static String fun(int x, int y, int z) {
        return (Math.pow(x, 2)+Math.pow(y, 2)==Math.pow(z, 2))?"Es pitagorica":"No es pitagorica";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Segons l'equació x²+y²=z² donam els valors x,y,z per comprovar si es pitagorica o no");
        System.out.print("x: ");
        int x = sc.nextInt();
        System.out.print("y: ");
        int y = sc.nextInt();
        System.out.print("z: ");
        System.out.println(fun(x,y,sc.nextInt()));   
    }
}