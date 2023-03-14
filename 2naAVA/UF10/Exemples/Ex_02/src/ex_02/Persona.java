/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex_02;

/**
 *
 * @author sanand
 */
public class Persona {
    String nom;
    int edat;
    
    public Persona(String nom,int edat) throws Exception{
        this.nom=nom;
        setEdat(edat);
    }
    //Estableix el nom de la Persona
    void setNom(String n){
        nom=n;
    }
    //Estableix l'edat de la Persona
    void setEdat(int e) throws Exception{
        edat=e;
        if (true) {
            throw new Exception("jeje");
        }
    }
    //Retorna el nom de la Persona
    String getNom(){
        return nom;
    }
    
    int getEdat(){
        return edat;
    }
    void imrpimeNOm(){
        System.out.println(nom);
    }
    //Retorna true si es major d'edat, fals en cas contrari
    boolean esMajorEdat(){
        return(edat>=18);
    }
    public String toString(){
        return "Nom: "+nom+"\nEdat:"+edat;
    }
}
