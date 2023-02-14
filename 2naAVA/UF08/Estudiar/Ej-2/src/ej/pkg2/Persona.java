/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej.pkg2;

/**
 *
 * @author sanzs
 */
public class Persona {
    private String nombre;
    private String DNI;
    private char secso;
    private int edad;
    private double peso;
    private double altura;

    public Persona() {
        this.nombre = "";
        generarDNI();
        this.secso = 'H';
        this.edad = 0;
    }

    public Persona(String nombre, char secso, int edad) {
        this.nombre = nombre;
        generarDNI();
        this.secso = secso;
        comprobarSecso(secso);
        this.edad = edad;
        
    }

    public Persona(String nombre, char secso, int edad, double peso, double altura) {
        this.nombre = nombre;
        generarDNI();
        this.secso = secso;
        comprobarSecso(secso);
        this.edad = edad;
        this.altura=altura;
        this.peso=peso;
    }
    
    final int pesoIdeal=-1;
    final int noPesoIdeal=0;
    final int sobrepeso=1;
    public int calcularIMC() {
        double formula=getPeso()/(Math.pow(getAltura(), 2));
        if (formula<20) {
            return pesoIdeal;
        } else if (formula>=20 && formula <= 25) {
            return noPesoIdeal;
        }
        return noPesoIdeal;
    }
    
    public boolean esMayorDeEdad() {
        if (this.edad>=18) {
            return true;
        }
        return false;
    }
    
    private void comprobarSecso(char secso) {
        if (this.secso!='M') {
            this.secso='H';
        }
    }
    
    private void generarDNI() {
        int max=10000000, min=99999999;
        int nDNI=(int) (Math.random() * (max - min + 1) + min);
        int lDNI=nDNI%23;
        char[] letrasDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        char letraDNI = letrasDNI[lDNI];
        DNI = Integer.toString(nDNI)+letraDNI;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public char getSecso() {
        return secso;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSecso(char secso) {
        this.secso = secso;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", DNI=" + DNI + ", secso=" + secso + ", edad=" + edad + ", peso=" + peso + ", altura=" + altura;
    }

    
    
    
}
