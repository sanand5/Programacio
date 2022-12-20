package uf07_10;

//@author Andreu Sanz Sanz

import java.util.Scanner;

public class UF07_10 {
    public static String fun(int dia, int mes, int ano) {
        return (dia>30 || dia<=0 || mes>12 || mes<=0 || ano<0)?"La data es incorrecta":"La data es correcta";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dia: ");
        int dia = sc.nextInt();
        System.out.print("Mes: ");
        int mes = sc.nextInt();
        System.out.print("Any: ");
        System.out.println(fun(dia, mes, sc.nextInt()));
    }

}
