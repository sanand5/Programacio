/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex_04;

/**
 *
 * @author sanand
 */
public class Propia extends Exception{
    int num;

    public Propia(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Propia{" + "num=" + num + '}';
    }
    
    
    
}
