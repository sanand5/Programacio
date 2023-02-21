/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemple5;

/**
 *
 * @author sanand
 */
public class Exemple5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Mare mare1 = new Mare();
        Filla1 filla1 = new Filla1();
        Filla2 filla2 = new Filla2();
        
        System.out.println("mare1");
        mare1.crida();
        
        Mare mare2;
        
        System.out.println("mare2");
        mare2=mare1;
        mare2.crida();
        
        System.out.println("mare2");
        mare2 = filla1;
        mare2.crida();
        
        System.out.println("mare2");
        mare2 = filla2;
        mare2.crida();
        
        System.out.println("crida edat");
        filla2.crida(18);
        System.out.println("filla tipo fena");
        System.out.println();
        filla2.crida(18, "puta");
        System.out.println();
        filla2.crida(18, "puta", 800);
        
    }
}

class Filla1 extends Mare {
    @Override
    public void crida() {
        System.out.println("Estic a la classe Filla1");
    }      
}

class Mare {
    public void crida() {
        System.out.println("Estic a la classe Mare");
    }
}

class Filla2 extends Mare{

    @Override
    public void crida() {
        System.out.println("Estic a la classe Filla2");
    }
    public void crida(int edat) {
        System.out.println("Estic a la classe Filla2 i tinc "+edat+" anys");
    }
    public void crida(int edat, String faenaString) {
        System.out.println("Estic a la classe Filla2, tinc "+edat+" anys i soc "+ faenaString);
    }
    public void crida(int edat, String faenaString, int faena) {
        System.out.println("Estic a la classe Filla2, tinc "+edat+" anys, soc "+ faenaString+" i cobre "+ faena + "€ al més");
    }

}

