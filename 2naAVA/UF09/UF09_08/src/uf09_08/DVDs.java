/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf09_08;

import java.util.ArrayList;

/**
 *
 * @author sanand
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
}
