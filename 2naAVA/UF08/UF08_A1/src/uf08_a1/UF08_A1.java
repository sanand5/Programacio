package uf08_a1;

// Andreu Sanz Sanz

public class UF08_A1 {
    public static void main(String[] args) {
        punt_a llanxa=new punt_a();
        punt_a vaixell=new punt_a();
        punt_a barco=new punt_a();
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
