/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf08_d3;

/**
 *
 * @author sanand
 */
public class Rectangle_d {
    private int x1,x2,y1,y2;
    
    public Rectangle_d (int x1, int x2, int y1, int y2){
        if (x1>=x2 || y1>=y2) System.out.println(".zsd,h we5n8òej5py695ewry oytvehir");
        else {
            this.x1=x1;
            this.x2=x2;
            this.y1=y1;
            this.y2=y2;
        }
    }
    double perimetre() {
        return (double)(Math.abs(x1-x2)+Math.abs(y1-y2))*2;
    }
    double area() {
        return (double)(Math.abs(x1-x2)*Math.abs(y1-y2));
    }
    public void setx1(int x1) {
        if (x1>=x2) {
            System.out.println("***Error, el valor ha de ser >0, el valor per defecte sera el anterior***");
        }else this.x1=x1;
    }
    public void setx2(int x2) {
        if (x2<=x1) {
            System.out.println("***Error, el valor ha de ser >0, el valor per defecte sera el anterior***");
        }else this.x2=x2;
        
    }
    public void sety1(int y1) {
        if (y1>=y2) {
            System.out.println("***Error, el valor ha de ser >0, el valor per defecte sera el anterior***");
        }else this.y1=y1;
    }
    public void sety2(int y2) {
        if (y2<=y1) {
            System.out.println("***Error, el valor ha de ser >0, el valor per defecte sera el anterior***");
        }else this.y2=y2;
    }
    public int getx1() {
        return this.x1;
    }
    public int getx2() {
        return this.x2;
    }
    public int gety1() {
        return this.y1;
    }
    public int gety2() {
        return this.y2;
    }
}
