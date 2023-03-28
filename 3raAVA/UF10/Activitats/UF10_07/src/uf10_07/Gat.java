/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf10_07;

/**
 *
 * @author sanand
 */
public class Gat {
    private String nom;
    private int edat;

    public Gat(String nom, int edat) throws Exception {
        setNom(nom);
        setEdat(edat);
    }
    
    public void imprimir() {
        System.out.println("Nom : "+nom);
        System.out.println("Edat : "+edat);
        System.out.println("");
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) throws Exception {
        if (edat<0) {
            throw new Exception("Error : La edat ha de ser positiva");
        }else this.edat = edat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) throws Exception {
        if (nom.matches("^[a-zA-Z]{3,}$")) {
            this.nom = nom;
        }else throw new Exception("Error : El nom ha de tindre al menys 3 lletres y SOLS lletres perq Angel o vol aixina");
    }
    
    
    
}


/*
- `^`: Indica el inicio de una línea.
- `[a-zA-Z]`: Representa cualquier carácter alfabético, tanto en mayúsculas como en minúsculas.
- `{3,}`: Especifica que debe haber al menos 3 caracteres alfabéticos consecutivos.
- `$`: Indica el final de una línea.
*/