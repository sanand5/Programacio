package uf08_d3;

// Andreu Sanz Sanz

import java.util.Scanner;


public class UF08_D3 {
    public static void main(String[] args) {
        Rectangle_d r1=new Rectangle_d(2,4,6,7);
        r1.print();
        r1.setAll(2, 3, 4, 5);
        r1.print();
        r1.setX1(11); //crida al setter pa que traga misatge
    }
}
