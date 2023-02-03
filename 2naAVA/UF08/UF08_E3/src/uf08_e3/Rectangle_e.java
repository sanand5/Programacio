/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf08_e3;

/**
 *
 * @author sanand
 */
public class Rectangle_e {
    private int x1,x2,y1,y2;
    final static int MIN=0, MAX=100;
    
    public Rectangle_e (int x1, int x2, int y1, int y2){
        if (x1>=x2 || y1>=y2 || x1>MAX || x1<MIN|| x2>MAX || x2<MIN|| y1>MAX || y1<MIN|| y2>MAX || y2<MIN) System.out.println("ERROR");
        else {
            this.x1=x1;
            this.x2=x2;
            this.y1=y1;
            this.y2=y2;
        }
    }
    public static Rectangle_e rectangleAleatori() {
        int a=(int) (Math.random() * (MAX - MIN + 1) + MIN);
        int b=(int) (Math.random() * (MAX - MIN + 1) + MIN);
        int c=(int) (Math.random() * (MAX - MIN + 1) + MIN);
        int d=(int) (Math.random() * (MAX - MIN + 1) + MIN);
        return new Rectangle_e(Math.min(a, b),Math.max(a, b),Math.min(c, d),Math.max(c, d));
    }
    public void imprimeix() {
        System.out.printf("(%d,%d)/(%d,%d)%n",getX1(),getY1(),getX2(),getY2());
    }
    double getperimetre() {
        return (double)(Math.abs(getX1()-getX2())+Math.abs(getY1()-getY2()))*2;
    }
    
    double getarea() {
        return (double)(Math.abs(getX1()-getX2())*Math.abs(getY1()-getY2()));
    }
    
    public void print() {
        System.out.printf("""
                          Coord: (%d,%d)/(%d,%d)
                          Perimetre: %.2f
                          Area: %.2f
                          """, getX1(), getY1(), getX2(), getY2(), getperimetre(), getarea());
        
    }
    public void setX1(int x1) {
        if (x1>=getX2() || x1>MAX || x1<MIN ) {
            System.out.println("***Error, el valor ha de ser >0, el valor per defecte sera el anterior***");
        }else this.setX1(x1);
    }
    public void setX2(int x2) {
        if (x2<=getX1()|| x2>MAX || x2<MIN) {
            System.out.println("***Error, el valor ha de ser >0, el valor per defecte sera el anterior***");
        }else this.setX2(x2);
        
    }
    public void setY1(int y1) {
        if (y1>=getY2() || y1>MAX || y1<MIN) {
            System.out.println("***Error, el valor ha de ser >0, el valor per defecte sera el anterior***");
        }else this.setY1(y1);
    }
    public void setY2(int y2) {
        if (y2<=getY1() || y2>MAX || y2<MIN) {
            System.out.println("***Error, el valor ha de ser >0, el valor per defecte sera el anterior***");
        }else this.setY2(y2);
    }
    public int getX1() {
        return this.x1;
    }
    public int getX2() {
        return this.x2;
    }
    public int getY1() {
        return this.y1;
    }
    public int getY2() {
        return this.y2;
    }

    

    
}
