/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplesclases;

/**
 *
 * @author sanand
 */
public class Alumne {
    private String nom;
    private String cognom;
    private int edat;
    
    public void setNom(String inNom) {
        nom=inNom;
    }
    public void setCognom(String inCognom) {
        cognom=inCognom;
    }
    public void setEdat(int inEdat) {
        edat=inEdat;
    }
    public String toString() {
        return(nom +" "+ cognom+" té " + edat +" anys.");
    }
}
