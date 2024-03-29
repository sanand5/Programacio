/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e4article;

/**
 *
 * @author sanzs
 */
public class Article {

    private String nom;
    private double preu, iva;
    private int quantsQueden;

    //Aquesta funció és el constructor de la clase
    //*No retorna res
    //*Paràmetres d'entrada:
    // - String nom: Nom del producte
    // - double preu: Preu del producte
    // - double iva: IVA del producte
    // - int quantsQueden: Quantitat restant del producte
    public Article(String nom, double preu, double iva, int quantsQueden) {
        if (preu <= 0) {
            System.out.println("*** ERROR: El preu no pot ser menor que 0");
        } else if (iva != 21 && iva != 10 && iva != 4) {
            System.out.printf("*** ERROR: IVA %.0f%% no vàlid%n", iva);
        } else if (quantsQueden < 0) {
            System.out.println("*** ERROR: El stock no pot ser menor que 0");
        } else {
            this.nom = nom;
            this.preu = preu;
            this.iva = iva;
            this.quantsQueden = quantsQueden;
        }
    }

    //Aquesta funció resta la quantitat de productes venuts a la quantitat de productes emmagatzemats
    //*Retorna un boolean depenent de si la quantitat de productes que es volen vendre en són suficients en la quantitat que tenim
    //*Paràmetres d'entrada:
    // - int x: Quantitat de producte que es vol vendre
    public boolean vendre(int x) {
        if (this.quantsQueden >= x) {
            this.quantsQueden -= x;
            return true;
        } else {
            return false;
        }
    }

    //Aquesta funció resta o suma la quantitat de productes emmagatzemats
    //*Retorna un boolean depenent de si la quantitat de productes que es volen emmagatzemar o restar seria suficient
    //*Paràmetres d'entrada:
    // - int x: Quantitat de producte que es vol emmagatzemar
    public boolean emmagatzema(int x) {
        if (this.quantsQueden + x >= 0) {
            this.quantsQueden += x;
            return true;
        } else {
            return false;
        }
    }

    //Aquesta funció imprimeix la informació del producte
    //*No retorna res
    //*No te paràmetres d'entrada
    public void imprimeix() {
        System.out.printf("%s - Preu: %.1f€ - IVA: %.1f%% - PVP: %.1f€ (queden  %d articles)%n", this.nom, this.preu, this.iva, getPVP(), this.quantsQueden);
    }

    public String getNom() {
        return this.nom;
    }

    public double getPreu() {
        return this.preu;
    }

    public double getIva() {
        return this.iva;
    }

    public int getQuantsQueden() {
        return this.quantsQueden;
    }

    public double getPVP() {
        return this.preu + (this.preu * ((double) this.iva / 100));
    }

    public double getPVPDescompte(int descompte) {
        return getPVP() - (getPVP() * ((double) descompte / 100));
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    //Canvia al preu nou si aquest no és menor que 1
    public void setPreu(double preu) {
        if (preu < 1) {
            System.out.println("*** ERROR: El preu no pot ser menor que 1");
        } else {
            this.preu = preu;
        }
    }

    //Canvia a l'iva nou si aquest és igual a 21, 10 o 4.
    public void setIva(double iva) {
        if (iva != 21 && iva != 10 && iva != 4) {
            System.out.printf("*** ERROR: IVA %.1f%% no vàlid%n", iva);
        } else {
            this.iva = iva;
        }
    }

    //Canvia la quantitat restant si aquesta no és menor que 0
    public void setQuantsQueden(int quantsQueden) {
        if (quantsQueden < 0) {
            System.out.println("*** ERROR no poden quedar articles menors que 0");
        } else {
            this.quantsQueden = quantsQueden;
        }
    }
}
