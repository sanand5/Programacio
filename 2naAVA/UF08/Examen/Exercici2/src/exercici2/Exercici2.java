/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici2;

/**
 *
 * @author sanand
 */
public class Exercici2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Temps t1 = new Temps(12, 25, 352);
        System.out.println("--T1--");
        System.out.println(t1.toString());
        Temps t2 = new Temps(5, 100, -5);
        System.out.println("--T2--");
        
        System.out.println(t2.toString());
        System.out.println("--Operació T1 i T2--");
        Temps t3 = Temps.sumarORestarObj(t1, t2, '+');
        System.out.println(t3.toString());
        System.out.println("--Incrementar T1--");
        t1.crementarsegons(70);
        System.out.println(t1.toString());
        System.out.println("--Decrementar T2--");
        t2.crementarsegons(-70);
        System.out.println(t2.toString());

        System.out.println("--Incrementar T1--");
        t1.crementarmin(102);
        System.out.println(t1.toString());
        System.out.println("--Decrementar T2--");
        t2.crementarmin(-102);
        System.out.println(t2.toString());

        System.out.println("--Incrementar T1--");
        t1.crementarhores(4);
        System.out.println(t1.toString());
        System.out.println("--Decrementar T2--");
        t2.crementarhores(-4);
        System.out.println(t2.toString());

        System.out.println("--Canviar minuts  T1--");
        t1.setMinuts(78);
        System.out.println(t1.toString());
        System.out.println("--Canviar minuts  T2--");
        t2.setSegons(-120);
        System.out.println(t2.toString());
        

    }

}
