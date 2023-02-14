/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej.pkg1;

/**
 *
 * @author sanzs
 */
public class Cuenta {

    private String titular;
    private double cantidad;

    public Cuenta(String titular) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "titular=" + titular + ", cantidad=" + cantidad + '}';
    }

    public String getTitular() {
        return titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    public void ingresar(double cantidad) {
        if (cantidad>=0) {
            this.cantidad+=cantidad;
        }
    }
    public void retirar(double cantidad) {
        this.cantidad-=cantidad;
        if (this.cantidad<0) {
            this.cantidad=0;
        }
    }

}
