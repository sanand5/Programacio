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
    private String cod, titol, format;
    
    private double preu_lloguer;
    
    public static final double IVA=0.16;
    
    final String id;
    
    private static int num;
    
    
    //setter
    
    Article(String cod, String titol, String format, double preu_lloguer, String id){
        this.cod=cod;
        this.titol=titol;
        this.format=format;
        this.preu_lloguer=preu_lloguer;
        this.id=id;
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
    
    //getters
    public String getCod() {
        return this.cod;
    }
    public String getFormat() {
        return this.format;
    }
    public String getTitol() {
        return this.titol;
    }
    public double getPreu_lloguer() {
        return this.preu_lloguer;
    }
    
    public void modificarTots(String cod, String titol, String format, double preu_lloguer) {
        this.cod=cod;
        this.titol=titol;
        this.format=format;
        this.preu_lloguer=preu_lloguer;
    }
    
}
