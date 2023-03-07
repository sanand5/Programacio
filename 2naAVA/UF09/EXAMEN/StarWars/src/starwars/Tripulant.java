/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package starwars;

/**
 *
 * @author sanand
 */
public class Tripulant {
    private String nom;
    private int id;
    private String perfil;

    public Tripulant(String nom, int id, String perfil) {
        this.nom = nom;
        this.id = id;
        compPerfil(perfil);
    }
    
    private void compPerfil(String perfil) {
        if (perfil.matches("(Piloto|Copiloto|Passatger)")) {
            this.perfil = perfil;
        }else this.perfil = "Passatger";
    }
    
    public void mostrar() {
        System.out.printf("%s - %03d - %s", nom, id, perfil);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
}
