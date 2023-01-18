/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplesclases;

/**
 *
 * @author sanand
 */
public class Article {
    String cod, titol, format;
    double preu_lloguer;
    public double preudia() {
        return preu_lloguer;
    }
    public double preudos() {
        return (preu_lloguer*2*0.8);
    }
    public double preusemana() {
        return (preu_lloguer*5);
    }
}
