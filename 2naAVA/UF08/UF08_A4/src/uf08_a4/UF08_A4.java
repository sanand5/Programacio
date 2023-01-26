/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package uf08_a4;

// @author sanzs

public class UF08_A4 {
    public static void main(String[] args) {
        Article_a A1 = new Article_a();
        A1.preu=10;A1.iva=21;A1.nom="Pijama";
        System.out.printf("%s - Preu:  %.0f€ - IVA: %.0f%% - PVP: %.2f€",A1.nom,A1.preu,A1.iva,(A1.preu+(A1.preu*A1.iva)/100));
        A1.preu=15;
        System.out.println();
        System.out.printf("%s - Preu:  %.0f€ - IVA: %.0f%% - PVP: %.2f€",A1.nom,A1.preu,A1.iva,(A1.preu+(A1.preu*A1.iva)/100));
    }

}
