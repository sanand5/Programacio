package uf08_e3;

// Andreu Sanz Sanz

import java.util.Scanner;


public class UF08_E3 {
    public static void main(String[] args) {
        Rectangle_e r1=new Rectangle_e(2,4,6,7);
        r1.print();
        r1.setX1(11); //crida al setter pa que traga misatge
        Rectangle_e V[] = new Rectangle_e[30];
        for (int i = 0; i < 30; i++) {
            V[i]=Rectangle_e.rectangleAleatori();
            V[i].imprimeix();
            System.out.println();
        }
    }
}
