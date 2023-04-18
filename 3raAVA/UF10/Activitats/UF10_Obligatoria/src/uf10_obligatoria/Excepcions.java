/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf10_obligatoria;

/**
 *
 * @author Andreuet
 */
class LlimitDePantalla extends Exception {

    private Personatges persona;
    private int posicio;
    private String direccio;

    public LlimitDePantalla(Personatges persona, int posicio, String direccio) {
        this.persona = persona;
        this.posicio = posicio;
        this.direccio = direccio;
    }

    @Override
    public String toString() {
        return "*** LimitDePantalla {No es pot col·locar/moure a " + persona.getNom() + " fins a la posició " + posicio + " " + direccio + "}";
    }

}

class SenseBales extends Exception {

    @Override
    public String toString() {
        return "*** SenseBales {No pots disparar. T'has quedat sense trets disponibles}";
    }

}

class EnemicJaMort extends Exception {

    @Override
    public String toString() {
        return "*** EnemicMort {L'enemic ja estava mort}";
    }

}

class DisparEnemic extends Exception {

    String msg;

    // Es el constructor de la excepcio
    // Segons la vida del jugador trau un misatge o un altre
    public DisparEnemic(Enemics enemic) {
        if (enemic.getVida() > 0) {
            msg = "Enemic " + enemic.getNom() + " tocat!!! Vida restant: " + enemic.getVida();
        } else {
            msg = "Enemic " + enemic.getNom() + " ha estat eliminat!!!";
        }
    }

    @Override
    public String toString() {
        return msg;
    }

}
