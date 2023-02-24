/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package argumentsvariables;

/**
 *
 * @author sanand
 */
public class ArgumentsVariables {

    /**
     * @param args the command line arguments
     */
    public static void fun(String str, int... a) {
        System.out.println(str);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    public static void funa(Calse... a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {
        
        fun("hoal", 22, 23);
        Calse a1 = new Calse();
        Calse a2 = new Calse();
        funa(a1, a2);
        
    }
    
}
