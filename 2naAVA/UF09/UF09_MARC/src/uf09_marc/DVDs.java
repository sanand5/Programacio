/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf09_marc;

/**
 *
 * @author sanzs
 */
public class DVDs extends Elements{
    double durada;
    String format;
    final String DEFAULTFORMAT="No conegut";

    public DVDs(double durada, String format, String titol) {
        super(titol);
        this.durada = durada;
        if (format.matches("(video|rom|audio)")) {
            this.format = format;
        }else this.format = DEFAULTFORMAT;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println(durada);
        System.out.println(format);
    }

    @Override
    void fun() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
