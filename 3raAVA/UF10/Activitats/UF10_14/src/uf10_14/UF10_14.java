/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf10_14;

import java.util.ArrayList;

/**
 *
 * @author sanand
 */
public class UF10_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Gatos> gats = new ArrayList<>();
        gats.add(new Gatos("Mascle", "Garfield"));
        gats.add(new Gatos("Mascle", "Tom"));
        gats.add(new Gatos("Femella", "Kitty"));
        gats.add(new Gatos("Femella", "Duquesa"));
        
        for (int i = 0; i < 10; i++) {
            try {
                int min = 0, max = gats.size()-1;
                int random = (int) (Math.random() * (max - min + 1) + min);
                int ran = (int) (Math.random() * (max - min + 1) + min);
                gats.get(random).apariar(gats.get(ran));
            } catch (ExceptionApariamentImpossible e) {
                System.out.println(e);
            }
        }
        
    }
    
}
