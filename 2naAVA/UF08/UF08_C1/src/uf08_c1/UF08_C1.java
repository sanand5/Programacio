package uf08_c1;

// Andreu Sanz Sanz

public class UF08_C1 {
    public static void main(String[] args) {
        Punt llanxa=new Punt(5,0);
        Punt vaixell=new Punt(10,10);
        Punt barco=new Punt(-3,7);
        
        System.out.printf("|%d,%d|\n|%d,%d|\n|%d,%d|\n",llanxa.getX(),llanxa.getY(),vaixell.getX(),vaixell.getY(),barco.getX(),barco.getY());
        System.out.println();
        
        llanxa.setX(llanxa.getX()+1); llanxa.setY(llanxa.getY()+1);
        vaixell.setX(vaixell.getX()-1); vaixell.setY(vaixell.getY()-1);
        barco.setX(barco.getX()+2);barco.setY(barco.getY()+2);
        
        System.out.printf("|%d,%d|\n|%d,%d|\n|%d,%d|\n",llanxa.getX(),llanxa.getY(),vaixell.getX(),vaixell.getY(),barco.getX(),barco.getY());
        System.out.println();
        
        
        
    }

}
