/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplesclases;

/**
 *
 * @author sanand
 */
public class Quadrat {
    int x1, y1;
    int x2, y2;
    
    double longh=Math.abs(x1-x2);
    double longv=Math.abs(y1-y2);
    
    double diagonal() {
        return Math.pow(Math.pow(longh, 2)+Math.pow(longv, 2),  1.0/2.0);
    }
    double perimetre(double diag) {
        return 4*(diag/Math.pow(2, (double) 1/2));
    }
    double area(double diag) {
        return 0.5*(Math.pow(diag, 2));
    }
}
