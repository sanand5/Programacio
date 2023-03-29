/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf10_10;

/**
 *
 * @author sanand
 */
class ErrEliminar extends Exception {

    Mascotas m;

    public ErrEliminar(Mascotas m) {
        this.m = m;
    }

    @Override
    public String toString() {
        return "### La mascota" + m.getNom() + "no s'ha pogut eliminar";
    }

}

class ErrMostrar extends Exception {

    int n;

    public ErrMostrar(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "### La mascota numero " + n + " no s'a pogut eliminar";
    }
}

class ErrCrearNom extends Exception {

    @Override
    public String toString() {
        return "### No es pot crear una mascota sense nom";
    }
}

class ErrCrearEdat extends Exception {

    int edat;

    public ErrCrearEdat(int edat) {
        this.edat = edat;
    }

    @Override
    public String toString() {
        return "### La mascota amb edat \"" + edat + "\" no s'a pogut crear";
    }

}
