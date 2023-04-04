/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf10_obligatoria;

/**
 *
 * @author Andreuet
 */
class LlimitDePantalla extends Exception{
    Personatges persona;
    int posicio;
    String direccio;

    public LlimitDePantalla(Personatges persona, int posicio, String direccio) {
        this.persona=persona;
        this.posicio = posicio;
        this.direccio = direccio;
    }
    
}
class SenseBales extends Exception{

    @Override
    public String toString() {
        return "*** SenseBales {No pots disparar. T'has quedat sense trets disponibles}";
    }
    
}
class EnemicJaMort extends Exception{

    @Override
    public String toString() {
        return "*** EnemicMort {L'enemic ja estava mort}";
    }
    
}
class DisparEnemic extends Exception{
    Enemics enemic;
    String msg;

    public DisparEnemic(Enemics enemic) {
        this.enemic = enemic;
        if (enemic.vida>0) {
            msg="Enemic "+enemic.nom+" tocat!!! Vida restant: "+enemic.vida;
        }else msg="Enemic Snoke ha estat eliminat!!!";
    }

    @Override
    public String toString() {
        return msg;
    }
    
    
    
    
    
}