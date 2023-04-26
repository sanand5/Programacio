/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex6;

import java.io.File;

/**
 *
 * @author sanand
 */
public class Ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File f = new File("nbprojects");
        File[] ls = f.listFiles(); 
        if (!f.exists()) {
            System.out.println("No exixteix");
        }else{
            System.out.println("lenth : " +ls.length);
            System.out.println("");
            for (File l : ls) {
                if (l.isFile()) {
                    System.out.print("[ARX] ");
                }else {
                    System.out.print("[DIR] ");
                }
                System.out.println(l.getName());
                System.out.println("");
            }
        }
    }
    
}
