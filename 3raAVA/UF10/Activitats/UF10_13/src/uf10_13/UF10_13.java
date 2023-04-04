/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf10_13;

import com.sun.jdi.AbsentInformationException;
import java.nio.channels.AlreadyBoundException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.InputMismatchException;

/**
 *
 * @author sanand
 */
public class UF10_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        int min = 0, max = 4;
        int random = (int) (Math.random() * (max - min + 1) + min);
        ArrayList <Exception> Errors = new ArrayList<>();
        Errors.add(new InputMismatchException());
        Errors.add(new IndexOutOfBoundsException());
        Errors.add(new NumberFormatException());
        Errors.add(new AbsentInformationException());
        Errors.add(new AlreadyBoundException());
        try {
            throw Errors.get(random);
        } catch (Exception e) {
            System.out.println(e);
        }
    }   
    
}
