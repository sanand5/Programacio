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
    
}
class EnemicMort extends Exception{
    
}
class DisparEnemic extends Exception{
    Enemics enemic;

    public DisparEnemic(Enemics enemic) {
        this.enemic = enemic;
    }

    
    
    
}