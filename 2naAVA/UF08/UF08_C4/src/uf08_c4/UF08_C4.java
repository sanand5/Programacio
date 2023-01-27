/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package uf08_c4;

// @author sanzs

public class UF08_C4 {
    public static void main(String[] args) {
        Article_c A1 = new Article_c("Pijama", 10, 21, 0);
        System.out.printf("%s - Preu:  %.0f€ - IVA: %.0f%% - PVP: %.2f€\n",A1.getnom(),A1.getpreu(),A1.getiva(),(A1.getpreu()+(A1.getpreu()*A1.getiva())/100));
        A1.setpreu(-1);
        System.out.println();
        System.out.printf("%s - Preu:  %.0f€ - IVA: %.0f%% - PVP: %.2f€\n",A1.getnom(),A1.getpreu(),A1.getiva(),(A1.getpreu()+(A1.getpreu()*A1.getiva())/100));
    }

}
