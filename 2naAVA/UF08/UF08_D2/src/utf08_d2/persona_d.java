/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utf08_d2;

/**
 *
 * @author sanand
 */
public class persona_d {
    private String nom;
    private String cognoms;
    private String dni;
    private int edat;
    
    public persona_d(String nom, String cognom, String dni, int edat){
        this.dni=dni;
        this.nom=nom;
        this.cognoms=cognom;
        this.edat=edat;
    }
    
    public String getNom() {
        return this.nom;
    }
    public String getCognom() {
        return this.cognoms;
    }
    public String getDni() {
        return this.dni;
    }
    public int getEdat() {
        return this.edat;
    }
    
    public void setNom(String nom) {
        this.nom=nom;
    }
    public void setCognom(String cognom) {
        this.cognoms=cognom;
    }
    public void setDni(String dni) {
        this.dni=dni;
    }
    public void setEdat(int edat) {
        this.edat=edat;
    }
    
}
