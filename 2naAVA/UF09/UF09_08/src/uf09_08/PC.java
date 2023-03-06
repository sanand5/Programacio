/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf09_08;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author sanzs
 */
/*public static*/ class PC {

    static Pokemon caixa1[] = new Pokemon[30];
    static Pokemon caixa2[] = new Pokemon[30];
    static Pokemon caixa3[] = new Pokemon[30];
    static Pokemon caixa4[] = new Pokemon[30];
    static Pokemon caixa5[] = new Pokemon[30];
    static Pokemon caixa6[] = new Pokemon[30];

    public static void mvPokemon(Pokemon[] caixaA, int a, int b) {
        Pokemon tmp = caixaA[a];
        caixaA[a] = caixaA[b];
        caixaA[b] = tmp;
    }

    public static void mvPokemon(Pokemon[] caixaA, int a , Pokemon[] caixaB, int b) {
        Pokemon tmp = caixaA[a];
        caixaA[a] = caixaB[b];
        caixaB[b]=tmp;
    }
    
    public static void mostrar(Pokemon[]... caixa) {
        for (Pokemon[] caixaA : caixa) {
            for (Pokemon caixaB : caixaA) {
                System.out.printf("""
                                  %s - %s
                                       Tipo - %s
                                       Pokedex - %s
                                       Nivell - %d
                                       PC - %d
                                       P. Vida - %d
                                   """, caixaB.getNomPokemon(), caixaB.getApodo(), caixaB.getTipo(), caixaB.getNumPokedex(), caixaB.getNivell(), caixaB.getPc(), caixaB.getVida());
            }
        }
    }
    public static void añadirPokemon(Pokemon[] caixa, Pokemon poke) {
        for (int i = 0; i < caixa.length; i++) {
            if (caixa[i]==null) {
                caixa[i]=poke;
                break;
            }
        }
    }

}

