/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf10_obligatoria;

/**
 *
 * @author Andreuet
 */
public abstract class Personatges {
    String nom;
    int x;
    int y;
    int velocitat;
    final int maxX=200;
    final int minX=200;
    final int maxY=100;
    final int minY=-100;

    public Personatges(String nom, int x, int y, int velocitat) {
        this.nom = nom;
        this.x = x;
        this.y = y;
        this.velocitat = velocitat;
    }

    public void moveRight() {
        
    }
    
    public void moveLeft() {
        
    }
    
    public void saltar() {
        
    }
    
    public void baixar() {
        
    }
    public void comprovarDesplasament(int x, int y) {
        if (this.x+x > maxX || this.x+x < minX) {
            
        }else if (this.y+y > maxY || this.y+y < minY){
        }
        
    }
    public void mostrar() {
        System.out.println("Nom: "+nom);
        System.out.println("Tipus: "+this.getClass().getName());
        System.out.println("Posició: ("+x+"/"+y+")");
        //System.out.println("Velocitat: "+velocitat); //no demana que la mostrem
        
    }
    
    
    
    
}
