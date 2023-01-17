package uf07_21;

// Andreu Sanz Sanz

import java.util.Scanner;


public class UF07_21 {
    public static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Circ\n2.Area\n3.Volum\n4.Tot\n5.Eixir");
        System.out.print("? ");
        return sc.nextInt();
    }
    public static double demanaradi() {
        Scanner sc = new Scanner(System.in);
        System.out.print("radi: ");
        return sc.nextDouble();
    }
    public static double circum(double radi) {
        return 2*Math.PI*radi;
    }
    public static double area(double radi) {
        return 4*Math.PI*(radi*radi);
        
    }
    public static double volum(double radi) {
        return 4/3*Math.PI*Math.pow(radi, 3);
    }
    public static void main(String[] args) {
        boolean exit=true;
        do {
            System.out.println();
            switch (menu()) {
                case 1:
                    System.out.println("La circ es: "+circum(demanaradi()));
                    break;
                case 2:
                    System.out.println("El area es: "+area(demanaradi()));
                    break;
                case 3:
                    System.out.println("El volumen es: "+volum(demanaradi()));
                    break;
                case 4:
                    double radi=demanaradi();
                    System.out.println("La circ es: "+circum(radi));
                    System.out.println("El area es: "+area(radi));
                    System.out.println("El volumen es: "+volum(radi));
                    break;
                case 5:
                    exit=false;
                    break;
                default:
                    System.err.println("No reconec aquesta ordere");
            }
        } while (exit);
    }
}
