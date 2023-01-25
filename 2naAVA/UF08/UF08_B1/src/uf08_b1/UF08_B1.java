package uf08_b1;

// Andreu Sanz Sanz

public class UF08_B1 {
    public static void main(String[] args) {
        punt_b llanxa=new punt_b();
        punt_b vaixell=new punt_b();
        punt_b barco=new punt_b();
        llanxa.x=5; llanxa.y=0;
        vaixell.x=10; vaixell.y=10;
        barco.x=-3;barco.y=7;
        System.out.printf("|%d,%d|\n|%d,%d|\n|%d,%d|\n",llanxa.x,llanxa.y,vaixell.x,vaixell.y,barco.x,barco.y);
        System.out.println();
        llanxa.x+=1; llanxa.y+=1;
        vaixell.x-=1; vaixell.y-=1;
        barco.x+=1;barco.y+=1;
        System.out.printf("|%d,%d|\n|%d,%d|\n|%d,%d|\n",llanxa.x,llanxa.y,vaixell.x,vaixell.y,barco.x,barco.y);
        
        
    }

}
