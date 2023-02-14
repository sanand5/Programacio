/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej.pkg3;

import java.awt.image.ImageConsumer;

/**
 *
 * @author sanzs
 */
public class Pasword {

    private int longitud;
    private String contrasenya;
    final int DEF_LINGITUD=8;

    public Pasword() {
        this.longitud=DEF_LINGITUD;
    }

    public Pasword(int longitud) {
        this.longitud = longitud;
        generarPassword();
    }

    public boolean esFuerte() {
        int mayus = 0, minus = 0, num = 0;
        for (int i = 0; i < getLongitud(); i++) {
            if ((int) getContrasenya().charAt(i) >= 65 && (int) getContrasenya().charAt(i) <= 90) {
                mayus++;
            } else if ((int) getContrasenya().charAt(i) >= 97 && (int) getContrasenya().charAt(i) <= 122) {
                minus++;
            } else {
                num++;
            }
        }
        if (mayus >= 2 && minus >= 1 && num >= 5) {
            return true;
        } else {
            return false;
        }
    }

    public void generarPassword() {
        int min = 0, max = 2;
        String password = "";
        for (int i = 0; i < getLongitud(); i++) {
            int tipo = (int) (Math.random() * (max - min + 1) + min);
            switch (tipo) {
                case 0://numeros
                    password += Integer.toString((int) (Math.random() * (9 - 0 + 1) + 0));
                    break;
                case 1://minus
                    password += (char) (int) (Math.random() * (0x7A - 0x61 + 1) + 0x61);
                    break;
                case 2://mayus
                    password += (char) (int) (Math.random() * (0x5A - 0x41 + 1) + 0x41);
                    break;
            }
        }
        this.contrasenya=password;
        
    }

    public int getLongitud() {
        return longitud;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    
    

}
