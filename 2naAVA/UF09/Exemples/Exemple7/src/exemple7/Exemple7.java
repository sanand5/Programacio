/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemple7;

import java.util.ArrayList;

/**
 *
 * @author sanand
 */
public class Exemple7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Figura> figuras = new ArrayList();
        //ArrayList figuras = new ArrayList();
        figuras.add(new Cuadrado(3));
        figuras.add(new Cuadrado(4));
        figuras.add(new Cuadrado(5));
        figuras.add(new Circulo(2));
        figuras.add(new Circulo(3));
        figuras.add(new Rectangulo(11, 22));
        figuras.add(new Rectangulo(33, 44));
        float suma=0;
        for (int i = 0; i < figuras.size(); i++) {
            //Figura cast = (Figura) figuras.get(i);
            //suma += cast.area();
            suma += figuras.get(i).area();
        }
        System.out.printf("Tenim un total de %d figures i la seua suma és de %.2f unitats quandrades", figuras.size(), suma);
        
    }
    
}
