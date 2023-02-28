/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf09_05;

/**
 *
 * @author sanand
 */
public class Empleat {
    private final String nom;
    private final String DNI;
    private String adreca;
    private double brut;
    private double tel;
    private int edat;

    public Empleat(String nom, String DNI, double brut) {
        this.nom = nom;
        this.DNI = DNI;
        this.brut = brut;
    }

    public Empleat(String nom, String DNI, double brut, String adreca, double tel, int edat) {
        this.nom = nom;
        this.DNI = DNI;
        this.adreca = adreca;
        this.brut = brut;
        this.tel = tel;
        this.edat = edat;
    }
    
    public void mostarDades() {
        System.out.println("Nom\t\t: "+nom);
        System.out.println("DNI\t\t: "+DNI);
        System.out.println("Sou brut\t: "+brut);
        System.out.println("Sou net\t\t: "+calcularNet());
        if (adreca != null) {
            System.out.println("Edat\t\t: "+edat);
            System.out.println("Telèfon\t\t: "+tel);
            System.out.println("Adreça\t\t: "+adreca);
        }
    }
    public double calcularNet() {
        int irpf;
        double anualbrut = brut*12;
        if (anualbrut<12000) {
            irpf = 20;
        }else if (anualbrut<25000) {
            irpf = 30;
        }else irpf = 40;
        return brut-(brut*((double)irpf/100));
    }
    
    public String getNom() {
        return nom;
    }

    public String getDNI() {
        return DNI;
    }

    public String getAdreca() {
        return adreca;
    }

    public double getBrut() {
        return brut;
    }

    public double getTel() {
        return tel;
    }

    public int getEdat() {
        return edat;
    }
    
    
}
