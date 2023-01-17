package exemplesclases;
// Andreu Sanz Sanz
public class Persona {
    String nom;
    int edat;
    void setNom(String n) {
        nom=n;
    }
    void setEdat(int e) {
        edat=e;
    }
    String getNm() {
        return nom;
    }
    int getEdat() {
        return edat;
    }
    void impreimeNom() {
        System.out.println(nom);
    }
    boolean esMajorEdat() {
        return (edat>=18);
    }
}
