package uf08_d1;

// Andreu Sanz Sanz

public class UF08_D1 {
    public static void main(String[] args) {
        Punt_d llanxa=new Punt_d(5,0);
        Punt_d vaixell=new Punt_d(10,10);
        Punt_d barco=new Punt_d(-3,7);
        llanxa.imprimeix();
        llanxa.setxy(2, 3);
        llanxa.imprimeix();
        llanxa.mou(1, 1);
        llanxa.imprimeix();
        System.out.printf("%.2f",llanxa.disancia(vaixell));
        
        
        
        
    }

}
