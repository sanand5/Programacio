/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uf10_05;

/**
 *
 * @author Andreuet
 */
public class ErrorSigne extends Exception{
    int num;
    boolean positiu;

    // Constructor de la clase, també trau un misatge de error segons el valor 
    // *No retorna res
    // *Parametres de entrada
    //      int num = fa referencia al numero intrduit per l'usuari
    //      boolean positiu = per ha saber quin error ha de traure segons la funcio
    //
    public ErrorSigne(int num, boolean positiu) {
        this.num = num;
        this.positiu = positiu;
        if (positiu) {
            System.out.println("Error: Has d'escriure un valor superior a 0");
        }else System.out.println("Error: Has d'escriure un valor inferiror o igual a 0");
    }
    
    
    
    
}
