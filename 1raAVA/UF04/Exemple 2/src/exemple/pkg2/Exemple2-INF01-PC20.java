/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemple.pkg2;

/**
 *
 * @author sanand
 */
public class Exemple2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=100;
        int pares=0;
        int impar=0;
        while(i<=200){
            
            if (i%2==0) {
                pares=i+pares;
            }else impar=impar+i;
            i++;
        } System.out.println("La suna dels pars es: "+pares+"\nLa suma dels impars es: "+impar);
    }
    
}
