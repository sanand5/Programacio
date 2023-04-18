/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf10_obligatoria;

/**
 *
 * @author Andreuet
 */
public class Jugadors extends Personatges {

    private int trets;

    public Jugadors(String nom, int x, int y, int velocitat, int trets) {
        super(nom, x, y, velocitat);
        this.trets = trets;
    }

    // Aquesta funció dispara a un enemic i resta un tir al jugador
    // *No retorna res
    // *Paràmetres d'entrada
    //      Enemics enemic : fa referència a l'enemic que se li vol disparar
    //
    public void disparar(Enemics enemic) {
        try {
            if (trets <= 0) {
                throw new SenseBales();
            }
            trets--;
            enemic.decrementarVida();
            throw new DisparEnemic(enemic);
        } catch (SenseBales | DisparEnemic e) { //Per al meu paréixer seria millor ficar en el mètode decrementar vida dels enemics: throws EnemicJaMort per a poder ficar en aquest catch EnemicJaMort, perquè quede més clar les excepcions que poden hi hauré, com estaria millor?
            System.out.println(e);
        }
    }

    public int getTrets() {
        return trets;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Trets: " + trets);
    }

}
