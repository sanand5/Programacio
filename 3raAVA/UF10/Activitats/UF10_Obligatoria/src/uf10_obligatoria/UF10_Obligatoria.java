/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf10_obligatoria;

/**
 *
 * @author Andreuet
 */
public class UF10_Obligatoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Creem tots els personatges
        Jugadors J1 = new Jugadors("Mario", 2, -100, 2, 10);
        Jugadors J2 = new Jugadors("Luigi", 1, -100, 2, 10);
        Jugadors J3 = new Jugadors("Peach", 0, -100, 3, 5);
        Jugadors J4 = new Jugadors("Toad", -1, -100, 1, 15);
        Jugadors J5 = new Jugadors("Yoshi", -2, -100, 4, 7);
        Enemics E1 = new Enemics("Bowser", (int) (Math.random() * (200 - (-200) + 1) + (-200)), (int) (Math.random() * (100 - (-100) + 1) + (-100)), 2, 20);
        //Bowser Jr i Wario fora de tauler
        Enemics E2 = new Enemics("Bowser Jr", -1111, -20, 3, 10);
        Jugadors J6 = new Jugadors("Wario", -2, -1000, 1, 20);

        //Un dispar per jugador
        System.out.println("""
                           
                           ##############################
                           # Tots els jugadors disparen #
                           ##############################
                           """);
        disparar(J1, E1);
        disparar(J2, E1);
        disparar(J3, E1);
        disparar(J4, E1);
        disparar(J5, E1);
        
        //Bowser vol escapar
         System.out.println("""
                            
                           ##############################
                           #     Bowser vol escapar     #
                           ##############################
                           """);
        E1.moveHoritzontal(1000);
        E1.moveVertical(-1000);
        
        //La mort de Bowser
         System.out.println("""
                            
                           ##############################
                           #      La mort de Bowser     #
                           ##############################
                           """);
        for (int i = 0; i < 5; i++) {
            disparar(J3, E1);
        }
        for (int i = 0; i < 10; i++) {
            disparar(J1, E1);
        }
        for (int i = 0; i < 3; i++) {
            disparar(J5, E1);
        }
    }

    // Aquesta funció fa que un jugador dispare a un enemic i mostra les seues dades
    // *No retorna res
    // *Paràmetres d'entrada
    // int posicions : quantitat de posicions que ha de moure's el jugador
    //
    public static void disparar(Jugadors J, Enemics E) {
        J.disparar(E);
        J.mostrar();
        E.mostrar();

    }

}
