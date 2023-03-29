/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf10_10;

/**
 *
 * @author sanand
 */
abstract class Mascotas {

    private String nom;
    private int edat;
    private String estat;
    private String dataNaixement;

    public Mascotas(String nom, int edat, String estat, String dataNaixement) throws Exception{
        setNom(nom);
        this.edat = edat;
        this.estat = estat;
        this.dataNaixement = dataNaixement;
    }

    public void mostrar() {
        System.out.println("Nom: " + nom);
        System.out.println("Edat: " + edat);
        System.out.println("Estat: " + estat);
        System.out.println("Data de naixement: " + dataNaixement);

    }

    public void parla() {
        System.out.print("L'animal diu: ");
    }

    public void aniversari() {
        System.out.println("La seua data de aniversari es: " + dataNaixement.substring(0, 5));
    }

    public void morir() {
        estat = "Mort";
    }

    public String getNom() {
        return nom;
    }

    public int getEdat() {
        return edat;
    }

    public String getEstat() {
        return estat;
    }

    public String getDataNaixement() {
        return dataNaixement;
    }

    private void setNom(String nom) throws Exception {
        if (nom=="") {
            throw new ErrCrearNom();
        }else this.nom = nom;
    }

    public void setEdat(int edat) throws ErrCrearEdat{
        if (edat<0) {
            throw new ErrCrearEdat(edat);
        }else this.edat = edat;
    }
    
    

}
