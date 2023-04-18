/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf10_obligatoria;

/**
 *
 * @author Andreuet
 */
public class Enemics extends Personatges {

    private int vida;

    public Enemics(String nom, int x, int y, int velocitat, int vida) {
        super(nom, x, y, velocitat);
        this.vida = vida;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Punts de vida: " + vida);
    }

    // Aquesta funció decrementa la vida de l'enemic si és possible
    // *No retorna res
    // *No té paràmetres d'entrada
    //
    public void decrementarVida() {
        try {
            if (vida > 0) {
                vida--;
            } else {
                throw new EnemicJaMort();
            }
        } catch (EnemicJaMort e) {
            System.out.println(e);
        }
    }

    public int getVida() {
        return vida;
    }

}
