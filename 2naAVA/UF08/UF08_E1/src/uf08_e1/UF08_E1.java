package uf08_e1;

// Andreu Sanz Sanz

import java.util.Arrays;


public class UF08_E1 {
    public static void main(String[] args) {
        Punt_e llanxa=new Punt_e(5,0);
        Punt_e vaixell=new Punt_e(10,10);
        Punt_e barco=new Punt_e(-3,7);
        llanxa.imprimeix();
        llanxa.setxy(2, 3);
        llanxa.imprimeix();
        llanxa.mou(1, 1);
        llanxa.imprimeix();
        System.out.printf("%.2f",llanxa.distancia(vaixell));
        System.out.println();
        System.out.println();
        Punt_e V[] = new Punt_e[30];
        for (int i = 0; i < 30; i++) {
            V[i]=Punt_e.crearpuntaleatori();
            V[i].imprimeix();
        }
    }
}
