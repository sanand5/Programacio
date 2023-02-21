/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemples;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author sanand
 */
public class Exemples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*//--Exemple 1--
        ArrayList llista = new ArrayList();
        llista.add(-25);
        llista.add(3.14);
        llista.add('a');
        llista.add('b');
        System.out.println("Forma 1");
        for (int i = 0; i < llista.size(); i++) {
            System.out.println(llista.get(i));
        }
        llista.set(1, 'c');
        System.out.print("N posiciones:");
        System.out.println(llista.size());
        System.out.println("Forma 2");
        for (int i = 0; i < llista.size(); i++) {
            System.out.println(llista.get(i));
        }
        System.out.println("Repe");
        Iterator iter = llista.iterator();
        llista.set(0, "aaa");
        System.out.println("wh");
        while (iter.hasNext() ) {
            System.out.println(iter.next());
        }
        System.out.println("for");
        for (Iterator itera = llista.iterator() ; itera.hasNext() ; ) {
            System.out.println(itera.next());
        }*/
        
        //--Exemple 2--
        ArrayList Productes = new ArrayList();
        Producte A1 = new Producte("A1",5);
        Producte A2 = new Producte("A2",4);
        Producte A3 = new Producte("A3",3);
        Producte A4 = new Producte("A4",2);
        Producte A5 = new Producte("A5",1);
        Productes.add(A1);
        Productes.add(A2);
        Productes.add(A3);
        Productes.add(A4);
        Productes.add(A5);
        Productes.add(2, A1);
        Producte Mostrar = new Producte();
        System.out.println("FOR:");
        for (Iterator iter = Productes.iterator(); iter.hasNext() ; ) {
            Mostrar = (Producte) iter.next();
            System.out.println(Mostrar.getNom());
            System.out.println(Mostrar.getQuantitat());
        }
        
        Productes.remove(4);
        Iterator iter = Productes.iterator();
        while (iter.hasNext()){
            Mostrar = (Producte) iter.next();
            System.out.println(Mostrar.getNom());
            System.out.println(Mostrar.getQuantitat());
        }
        Productes.clear();
        if (Productes.isEmpty()) {
            System.out.println("La llsita no conte elements");
        }
                
    }
    
}
