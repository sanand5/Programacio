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
    
    Article(String cod, String titol, String format, double preu_lloguer){
        this.cod=cod;
        this.titol=titol;
        this.format=format;
        this.preu_lloguer=preu_lloguer;
    }
    
    
    
    
    double preudia() {
        return preu_lloguer;
    }
    double preudos() {
        return (preu_lloguer*2*0.8);
    }
    double preusemana() {
        return (preu_lloguer*5);
    }
    
}
