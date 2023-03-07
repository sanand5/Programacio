/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercici2;

/**
 *
 * @author sanand
 */
public class Temps {

    private int hores;
    private int minuts;
    private int segons;

    public Temps(int hores, int minuts, int segons) {
        this.hores = hores;
        this.minuts = minuts;
        this.segons = segons;
        normalitza();
    }

    public void normalitza() {
        int s = this.hores * 3600 + this.minuts * 60 + this.segons;
        this.hores = s / 3600;
        this.minuts = (s % 3600) / 60;
        this.segons = (s % 3600) % 60;
    }
    
    public static Temps sumarORestarObj(Temps A, Temps B, char operador) {
        System.out.println();
        int operando = (operador == '-') ? -1 : 1;
        Temps C = new Temps(A.hores, A.minuts, A.segons);
        C.hores = A.hores+operando*B.hores;
        C.minuts = A.minuts+operando*B.minuts;
        C.segons = A.segons+operando*B.segons;
        C.normalitza();
        return C;
    }

    public void crementarhores(int hores) {
        this.hores += hores;
        normalitza();
    }

    public void crementarmin(int min) {
        this.minuts += min;
        normalitza();
    }

    public void crementarsegons(int segons) {
        this.segons += segons;
        normalitza();
    }

    public int getHores() {
        return hores;
    }

    public int getMinuts() {
        return minuts;
    }

    public int getSegons() {
        return segons;
    }

    public void setHores(int hores) {
        this.hores = hores;
        normalitza();
    }

    public void setMinuts(int minuts) {
        this.minuts = minuts;
        normalitza();
    }

    public void setSegons(int segons) {
        this.segons = segons;
        normalitza();
    }

    @Override
    public String toString() {
        return this.hores + "h " + this.minuts + "m " + this.segons + "s";
    }

}
