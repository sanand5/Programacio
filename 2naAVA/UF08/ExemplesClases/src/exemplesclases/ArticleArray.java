/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplesclases;

/**
 *
 * @author sanand
 */
public class ArticleArray {
    private String cod, titol, format;
    
    private double preu_lloguer;
    
    private static double IVA=0.16;
    
    private String id;
    
    private static int num;
    
    ArticleArray(String cod, String titol, String format, double preu_lloguer, String id){
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
    public void modificarTots(String cod, String titol, String format, double preu_lloguer) {
        this.setCod(cod);
        this.setTitol(titol);
        this.setFormat(format);
        this.setPreu_lloguer(preu_lloguer);
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
    

    public void setCod(String cod) {
        this.cod = cod;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setPreu_lloguer(double preu_lloguer) {
        this.preu_lloguer = preu_lloguer;
    }

    public static void setIVA(double aIVA) {
        IVA = aIVA;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static void setNum(int aNum) {
        num = aNum;
    }
    
}
