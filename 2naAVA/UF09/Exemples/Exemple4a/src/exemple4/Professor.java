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
public class Professor extends Persona {
    private String dept;
    private String horari;
    private int cod;
    private ArrayList moduls = new ArrayList();

    public Professor(String dept, String horari, int cod, String nom, String dni, String adreca, int telefon, ArrayList moduls) {
        super(nom, dni, adreca, telefon);
        this.dept = dept;
        this.horari = horari;
        this.cod = cod;
        this.moduls = moduls;
    }
    
    @Override
    public void mostrarPersona() {
        super.mostrarPersona(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("Professor{" + "dept=" + dept + ", horari=" + horari + ", cod=" + cod + ", moduls=" + moduls + '}');
    }
            
    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getHorari() {
        return horari;
    }

    public void setHorari(String horari) {
        this.horari = horari;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public ArrayList getModuls() {
        return moduls;
    }

    public void setModuls(ArrayList moduls) {
        this.moduls = moduls;
    }
    
    
    
    
}
