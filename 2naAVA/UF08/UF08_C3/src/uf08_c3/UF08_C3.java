package uf08_c3;

// Andreu Sanz Sanz

import java.util.Scanner;


public class UF08_C3 {
    public static void main(String[] args) {
        Rectangle_c r1=new Rectangle_c(2,4,8,7);
        
        System.out.printf("Coordenades r1: (%d,%d)/(%d,%d)\n",r1.getx1(),r1.gety1(),r1.getx2(),r1.gety2());
        System.out.printf("Perimetre=%.2f\nArea=%.2f\n",r1.perimetre(),r1.area());
        System.out.println();  
        r1.setx1(11); //crida al setter pa que traga misatge
    }
}
