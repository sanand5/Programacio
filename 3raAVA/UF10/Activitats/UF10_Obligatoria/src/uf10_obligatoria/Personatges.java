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
    private String nom;
    private int x;
    private int y;
    private int velocitat;
    private final int maxX=200;
    private final int minX=-200;
    private final int maxY=100;
    private final int minY=-100;

    public Personatges(String nom, int x, int y, int velocitat) {
        this.nom = nom;
        if (comprovarDesplasament(x, y)) {
            this.x = x;
            this.y = y;
        }
        this.velocitat = velocitat;
    }
    
    // Aquesta funció mou un personatge en posició horitzontal
    // *No retorna res
    // *Paràmetres d'entrada
    // int posicions : quantitat de posicions que ha de moure's el jugador
    //
    public void moveHoritzontal(int posicions) {
        if (comprovarDesplasament(posicions*velocitat, 0)) {
            this.x+=posicions;
        }
    }
    
    // Aquesta funció mou un personatge en posició vertical
    // *No retorna res
    // *Paràmetres d'entrada
    //      int posicions : quantitat de posicions que ha de moure's el jugador
    //
    public void moveVertical(int posicions) {
        if (comprovarDesplasament(0, posicions*velocitat*2)) {
            this.y+=posicions;
        }
    }
   
    // Aquesta funció comprova si la posició a la qual vol moure's el jugador, està dins del tauler
    // *Retorna un boolean true si el desplaçament és possible
    // *Paràmetres d'entrada
    // int x : fa referència a la quantitat de posicions en horitzontal que vol moure's el personatge
    // int y : fa referència a la quantitat de posicions en vertical que vol moure's el personatge
    //
    public boolean comprovarDesplasament(int x, int y) {
        try {
            int posX = this.x+x;
            int posY = this.y+y;
            if (posX > maxX || posX < minX) {
                throw new LlimitDePantalla(this, posX, "horitzontal");
            }else {
                if (posY > maxY || posY < minY){
                    throw new LlimitDePantalla(this, posY, "vertical");
                }
            }
            return true;
        } catch (LlimitDePantalla e) {
            System.out.println(e);
        }
        return false;
    }
    
    // Aquesta funció mostra les dades dels personatges
    // *No retorna res
    // *No té paràmetres d'entrada
    //
    public void mostrar() {
        System.out.println();
        System.out.println("Nom: "+nom);
        System.out.println("Tipus: "+this.getClass().getSimpleName());
        System.out.println("Posició: ("+x+"/"+y+")");
        //System.out.println("Velocitat: "+velocitat); //no demana que la mostrem, descomanda aquesta línia si vols veure la velocitat del jugador
        
    }

    public String getNom() {
        return nom;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getVelocitat() {
        return velocitat;
    }
    
    
    
    
    
}
