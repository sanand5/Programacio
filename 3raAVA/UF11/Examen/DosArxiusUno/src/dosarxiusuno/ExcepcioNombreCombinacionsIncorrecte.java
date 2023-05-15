/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dosarxiusuno;

/**
 *
 * @author sanand
 */
public class ExcepcioNombreCombinacionsIncorrecte extends Exception{
    int lines;

    public ExcepcioNombreCombinacionsIncorrecte(int lines) {
        this.lines = lines;
    }

    @Override
    public String toString() {
        return "***Error : El nombre de combinacions no pot ser "+lines;
    }
    
    
    
    
}
