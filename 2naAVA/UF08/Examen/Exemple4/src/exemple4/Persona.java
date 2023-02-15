/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemple4;

/**
 *
 * @author sanand
 */
public class Persona {
    private String nom;
    private String dni;
    private String adreca;
    private int telefon;

    public Persona(String nom, String dni, String adreca, int telefon) {
        this.nom = nom;
        this.dni = dni;
        this.adreca = adreca;
        this.telefon = telefon;
    }
    
    public void mostrarPersona() {
        System.out.println("Persona{" + "nom=" + nom + ", dni=" + dni + ", adreca=" + adreca + ", telefon=" + telefon + '}');
    }
    
    public String getNom() {
        return nom;
    }

    public String getDni() {
        return dni;
    }

    public String getAdreca() {
        return adreca;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setAdreca(String adreca) {
        this.adreca = adreca;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }
    
}
