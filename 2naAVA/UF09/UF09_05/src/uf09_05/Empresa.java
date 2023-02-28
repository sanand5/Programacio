/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf09_05;

import java.util.ArrayList;

/**
 *
 * @author sanand
 */
public class Empresa {

    final String nom;
    final String CIF;
    double tel;
    String adreca;
    ArrayList<Empleat> Empleats = new ArrayList<>();

    public Empresa(String nom, String CIF, double tel, String adreca) {
        this.nom = nom;
        this.CIF = CIF;
        this.tel = tel;
        this.adreca = adreca;
    }

    public void afegir(Empleat e) {
        Empleats.add(e);
    }
    public void eliminar(int a) {
        Empleats.remove(a);
    }
    public void mostrarTot() {
        System.out.println("Les dades de la empresa "+nom+" són:");
        for (int i = 0; i < Empleats.size(); i++) {
            System.out.println("-----------------------");
            Empleats.get(i).mostarDades();
            System.out.println("-----------------------");
        }
    }
    
    public void mostrarSous() {
        System.out.println("El sous dels empleats de la empresa "+nom+" són:");
        for (int i = 0; i < Empleats.size(); i++) {
            System.out.println(Empleats.get(i).getDNI()+" - Brut: "+Empleats.get(i).getBrut()+" - Net: "+Empleats.get(i).calcularNet());
        }
    }
    
    public void sumaBrut() {
        double suma=0;
        for (int i = 0; i < Empleats.size(); i++) {
            suma += Empleats.get(i).getBrut();
        }
        System.out.println("La suma del sou brut dels empleats de la empresa "+nom+" es de: "+suma);
    }
    
    public double sumaNet() {
        double suma=0;
        for (int i = 0; i < Empleats.size(); i++) {
            suma+= Empleats.get(i).calcularNet();
        }
        return suma;
    }

    
    
    
    
    

}
