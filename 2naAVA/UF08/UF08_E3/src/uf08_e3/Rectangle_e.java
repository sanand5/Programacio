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
    
    public Rectangle_e (int x1, int x2, int y1, int y2){
        if (x1>=x2 || y1>=y2) System.out.println(".zsd,h we5n8òej5py695ewry oytvehir");
        else {
            this.x1=x1;
            this.x2=x2;
            this.y1=y1;
            this.y2=y2;
        }
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
        if (x1>=getX2()) {
            System.out.println("***Error, el valor ha de ser >0, el valor per defecte sera el anterior***");
        }else this.setX1(x1);
    }
    public void setX2(int x2) {
        if (x2<=getX1()) {
            System.out.println("***Error, el valor ha de ser >0, el valor per defecte sera el anterior***");
        }else this.setX2(x2);
        
    }
    public void setY1(int y1) {
        if (y1>=getY2()) {
            System.out.println("***Error, el valor ha de ser >0, el valor per defecte sera el anterior***");
        }else this.setY1(y1);
    }
    public void setY2(int y2) {
        if (y2<=getY1()) {
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
