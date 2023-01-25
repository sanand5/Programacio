package uf08_d1;

// Andreu Sanz Sanz

public class UF08_D1 {
    public static void main(String[] args) {
        Punt_d llanxa=new Punt_d(5,0);
        Punt_d vaixell=new Punt_d(10,10);
        Punt_d barco=new Punt_d(-3,7);
        
        System.out.printf("|%d,%d|\n|%d,%d|\n|%d,%d|\n",llanxa.getX(),llanxa.getY(),vaixell.getX(),vaixell.getY(),barco.getX(),barco.getY());
        System.out.println();
        
        llanxa.setX(llanxa.getX()+1); llanxa.setY(llanxa.getY()+1);
        vaixell.setX(vaixell.getX()-1); vaixell.setY(vaixell.getY()-1);
        barco.setX(barco.getX()+2);barco.setY(barco.getY()+2);
        
        System.out.printf("|%d,%d|\n|%d,%d|\n|%d,%d|\n",llanxa.getX(),llanxa.getY(),vaixell.getX(),vaixell.getY(),barco.getX(),barco.getY());
        System.out.println();
        
        
        
    }

}
