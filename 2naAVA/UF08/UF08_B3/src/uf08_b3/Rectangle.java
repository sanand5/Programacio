/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf08_b3;

/**
 *
 * @author sanand
 */
public class Rectangle {
    int x1,x2,y1,y2;
    
    public Rectangle (int x1, int x2, int y1, int y2){
        if (x1>=x2 || y1>=y2) System.out.println(".zsd,h we5n8rxzmthiupwe4v9umERRORdfntbq9c8wh7f3nv8eawrñ,mtv i8bw4ytcpdsny9tñcfrx8s fnyerhhhhhhrjsdtbnoiñ  9eprylisldxubthpirdyht sen896ev òej5py695ewry uh4ryv+jṕ5eouitf96pcu4jtñio5rytpyev54yefc0w43oivthw4e859phtoiwe4oytvehir");
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
}
