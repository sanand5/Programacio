/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf10_14;

/**
 *
 * @author sanand
 */
public class Gatos {
    private String sexo;
    private String nom;
    String V[] = {"Mascle","Femella"};

    public Gatos(String sexo, String nom) {
        this.sexo = sexo;
        this.nom = nom;
    }
    public Gatos(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public String getNom() {
        return nom;
    }
    
    public Gatos apariar(Gatos gat) throws ExceptionApariamentImpossible {
        if (!this.sexo.equals(gat.sexo)) {
            int random = (int) (Math.random() * 2);
            System.out.print("L'apariament de "+this.nom+" amb "+gat.nom+" ha resultat en un gatet");
            if (random == 1) System.out.print("a");
            System.out.println("");
            return new Gatos(V[random]);
        }else throw new ExceptionApariamentImpossible(this, gat);
    }
    
}
