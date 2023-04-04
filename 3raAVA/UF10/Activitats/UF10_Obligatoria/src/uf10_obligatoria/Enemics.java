/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf10_obligatoria;

/**
 *
 * @author Andreuet
 */
public class Enemics extends Personatges{
    int vida;

    public Enemics(int vida, String nom, int x, int y, int velocitat) {
        super(nom, x, y, velocitat);
        this.vida = vida;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Punts de vida: "+vida);
    }
    
}
