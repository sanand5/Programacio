/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package uf09_08;

// @author sanzs

public class UF09_08 {
    public static void main(String[] args) {
        Pokemon.rellenarArray();
        //Pokemon p1 = new Pokemon(73, 12, 12, 12);
        //Pokemon p2 = new Pokemon(23, 12, 12, 12);
        PC.añadirPokemon(PC.caixa1, new Pokemon(13, 12, 12, 12));
        PC.añadirPokemon(PC.caixa1, new Pokemon(23, 12, 12, 12));
        PC.añadirPokemon(PC.caixa1, new Pokemon(33, 12, 12, 12));
        PC.añadirPokemon(PC.caixa1, new Pokemon(43, 12, 12, 12));
        PC.añadirPokemon(PC.caixa1, new Pokemon(53, 12, 12, 12));
        PC.añadirPokemon(PC.caixa1, new Pokemon(63, 12, 12, 12));
        
        PC.mostrar(PC.caixa1);
    }

}
