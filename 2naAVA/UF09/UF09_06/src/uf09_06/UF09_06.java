/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf09_06;

import java.util.ArrayList;

/**
 *
 * @author sanand
 */
public class UF09_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Terrestres G1 = new Terrestres("1234ABC", "4x4", 4);
        Cotxe C1 =new Cotxe(true, "4321CBA", "sport");
        Moto M1 =new Moto("Blau", "5678DEF", "GP");
        
        Aeris G2 = new Aeris(023, "ABCD123456", "A2");
        Avions A1 =new Avions(3, 20, "ABCD123456", "NS");
        Helicopters H1 = new Helicopters(7, 0, "ABCD123456", "NS");
        
        Aquatics G3 = new Aquatics(23, "123ABCDEFGHIJ", "V1");
        Vaixell V1 = new Vaixell(true, 0, "123ABCDEFGHIJ", "NS");
        Submarins S1 = new Submarins(4000, 90, "123ABCDEFGHIJ", "NS");
        
        ArrayList <Vehicles> lista =new ArrayList<>();
        lista.add(G1);
        lista.add(G2);
        lista.add(G3);
        lista.add(C1);
        lista.add(M1);
        lista.add(V1);
        lista.add(S1);
        lista.add(A1);
        lista.add(H1);
        
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).imprimir();
        }
        
        System.out.println("");
        System.out.println("-- MAL CREATS --");
        Terrestres Mal1 = new Terrestres("1234ABCD", "4x4", 4);
        Aeris Mal2 = new Aeris(023, "ABCDE123456", "A2");
        Aquatics Mal3 = new Aquatics(23, "1234ABCDEFGHIJ", "V1");
        
    }
    
}
