/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf10_obligatoria;

/**
 *
 * @author Andreuet
 */
public class Jugadors extends Personatges{
    int trets;

    public Jugadors(int trets, String nom, int x, int y, int velocitat) {
        super(nom, x, y, velocitat);
        this.trets = trets;
    }
    public void disparar(Enemics enemic) {
        try {
            if (trets<=0) throw new SenseBales();
            trets--;
            enemic.decrementarVida();
            throw new DisparEnemic(enemic);
        } catch (SenseBales | EnemicJaMort | DisparEnemic e) {
            System.out.println(e);
        }
    }
}
