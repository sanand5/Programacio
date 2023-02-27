/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf09_03;

/**
 *
 * @author sanand
 */
public class Gat extends Mascotas{
    private String color;
    private boolean isPelLlarg;

    public Gat(String nom, int edat, String estat, String dataNaixement, String color, boolean isPelLlarg) {
        super(nom, edat, estat, dataNaixement);
        this.color = color;
        this.isPelLlarg = isPelLlarg;
    }

    @Override
    public void mostrar() {
        super.mostrar(); 
        System.out.println("Color: "+color);
        System.out.print("Tipo de pel: ");
        if (isPelLlarg) {
            System.out.println("Llarg");
        }else System.out.println("Ah");
    }

    @Override
    public void parla() {
        super.parla(); 
        System.out.println("Miau");
    }
    
    
    
    

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isIsPelLlarg() {
        return isPelLlarg;
    }

    public void setIsPelLlarg(boolean isPelLlarg) {
        this.isPelLlarg = isPelLlarg;
    }
    
}
