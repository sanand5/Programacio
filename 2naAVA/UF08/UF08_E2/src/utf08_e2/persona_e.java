/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utf08_e2;

import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class persona_e {
    private final String DNI;
    private String nom;
    private String cognoms;
    private int edat;
    static final int majoriaEdat=18;    
    
    public persona_e(String nom, String cognoms, String DNI, int edat){
        this.cognoms = cognoms;
        this.edat = edat;
        this.nom = nom;
        String chekdni = DNI;
        Scanner sc = new Scanner(System.in);
        
        while(!validarDNI(chekdni)){
            System.out.print("DNI: ");
            chekdni = sc.nextLine();            
        }
        this.DNI = chekdni;
    }
    public void imprimeix() {
        System.out.printf("""
                          Nom: %s %s
                          DNI: %s
                          Edat: %d
                          """,this.nom,this.cognoms,this.DNI,this.edat);
        
    }
    public boolean esMajorEdat() {
        if (this.edat>=majoriaEdat) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean validarDNI(String dni) {
        return dni.matches("^\\d{8}[A-Za-z]$");
    }
    public boolean esJubilat() {
        if (this.edat>=65) {
            return true;
        } else {
            return false;
        }
    }
    public int diferencia(persona_e p1, persona_e p2) {
        return Math.abs(p1.edat-p2.edat);
    }
    
    public String getNom() {
        return this.nom;
    }
    public String getCognom() {
        return this.cognoms;
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
    public void setEdat(int edat) {
        this.edat=edat;
    }
    
}
