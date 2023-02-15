/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemple4;

import java.util.ArrayList;

/**
 *
 * @author sanand
 */
public class Alumne extends Persona {
    private int exp;
    private int curs;
    private String cicle;
    private ArrayList notes = new ArrayList();

    public Alumne(int exp, int curs, String cicle, String nom, String dni, String adreca, int telefon, ArrayList notes) {
        super(nom, dni, adreca, telefon);
        this.exp = exp;
        this.curs = curs;
        this.cicle = cicle;
        this.notes = notes;
    }

    @Override
    public void mostrarPersona() {
        super.mostrarPersona(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("Alumne{" + "exp=" + exp + ", curs=" + curs + ", cicle=" + cicle + ", notes=" + notes + '}');
    }
    
    public int getExp() {
        return exp;
    }

    public int getCurs() {
        return curs;
    }

    public String getCicle() {
        return cicle;
    }

    public ArrayList getNotes() {
        return notes;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public void setCurs(int curs) {
        this.curs = curs;
    }

    public void setCicle(String cicle) {
        this.cicle = cicle;
    }

    public void setNotes(ArrayList notes) {
        this.notes = notes;
    }
    
}
