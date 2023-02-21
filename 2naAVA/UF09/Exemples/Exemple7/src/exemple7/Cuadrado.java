/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemple7;

/**
 *
 * @author sanand
 */
public class Cuadrado implements Figura{
    private float lado;

    public Cuadrado(float lado) {
        this.lado = lado;
    }
    

    @Override
    public float area() {
        return (float) Math.pow(lado, 2);
    }

    
    
}
