/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proves;

/**
 *
 * @author sanand
 */
public class Proves {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String jj="abc1234";
        System.out.println(jj.matches("[abc]+.*"));
        System.out.println(jj.matches("[abc]+\\d{4}"));
        System.out.println(jj.matches("[abc]+\\d{1,10}"));
    }
    
}
