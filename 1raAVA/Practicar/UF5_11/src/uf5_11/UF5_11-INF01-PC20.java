/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf5_11;

/**
 *
 * @author sanzs
 */
public class UF5_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int spar=0;
        int simpar=0;
        for (int i = 100; i <= 200; i++) {
            if (i%2==0) {
                spar+=i;
            }else simpar+=i;
        }
        System.out.println(spar+" "+simpar);
    }
    
}
