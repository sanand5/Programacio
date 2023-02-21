/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemple7;

/**
 *
 * @author sanand
 */
public class Circulo implements Figura{
    private float diametro;

    public Circulo(float diametro) {
        this.diametro = diametro;
    }
    
    @Override
    public float area() {
        return (float) (PI*Math.pow(diametro/2, 2));
    }
    
}
