/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package booraarr;

import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class Booraarr {

    public static final int FILAS = 10;
    public static final int COLUMNAS = 10;
    public static final int LONGITUD_PORTAAVIONES = 5;
    public static final int LONGITUD_ACORAZADO = 4;
    public static final int LONGITUD_BARCO = 3;
    public static final int LONGITUD_LANCHA = 1;
    public static int barcos_hundidos = 0;

    public static void main(String[] args) {

        char[][] tablero = new char[FILAS][COLUMNAS];
        char[][] tableroSolucion = new char[FILAS][COLUMNAS];
        menu(tablero, tableroSolucion);

    }

    public static int menu(char[][] tablero, char[][] tableroSolucion) {

        System.out.println("\n HUNDIR LA NOTA \n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Elige el modo de juego : \n\n 1. Fácil \n 2. Medio \n 3. Difícil \n 4. Personalizado \n 5. Información \n \n ");
        int n = 1;//sc.nextInt();

        switch (n) {
            case 1 ->
                modoFacil(tablero, tableroSolucion);

            default -> {
            }
        }

        return 0;
    }

    public static void inicializarTablero(char[][] tablero) {
        for (int fila = 0; fila < FILAS; fila++) {
            for (int columna = 0; columna < COLUMNAS; columna++) {
                tablero[fila][columna] = '~';
            }
        }
    }

    public static void colocarPortaaviones(char[][] tableroSolucion) {
        comprobarBarcosV(tableroSolucion, LONGITUD_PORTAAVIONES, 'P');
    }

    public static void colocarAcorazado(char[][] tableroSolucion) {
        comprobarBarcosH(tableroSolucion, LONGITUD_ACORAZADO, 'Z');
    }

    public static void colocarBarco(char[][] tableroSolucion) {
        comprobarBarcosH(tableroSolucion, LONGITUD_BARCO, 'B');
    }

    public static void colocarLancha(char[][] tableroSolucion) {
        comprobarBarcosH(tableroSolucion, LONGITUD_LANCHA, 'L');
    }

    public static void comprobarBarcosH(char[][] tableroSolucion, int longitudBarco, char simboloBarco) {
        int filaInicial = (int) (Math.random() * FILAS);
        int columnaInicial = (int) (Math.random() * COLUMNAS);
        // Verifica si el espacio está libre
        boolean espacioDisponible = true;
        if (columnaInicial + longitudBarco <= COLUMNAS) {
            for (int i = 0; i < longitudBarco; i++) {
                if (tableroSolucion[filaInicial][columnaInicial + i] != '~') {
                    espacioDisponible = false;
                    break;
                }
            }
        } else {
            espacioDisponible = false;
        }

        // Si el espacio está libre, coloca el barco
        if (espacioDisponible) {
            for (int i = 0; i < longitudBarco; i++) {
                tableroSolucion[filaInicial][columnaInicial + i] = simboloBarco;
            }
        } else {
            // Si no está libre, llama a la función recursivamente para buscar otro espacio
            comprobarBarcosH(tableroSolucion, longitudBarco, simboloBarco);
        }
    }

    public static void comprobarBarcosV(char[][] tableroSolucion, int longitudBarco, char simboloBarco) {
        int filaInicial = (int) (Math.random() * FILAS);
        int columnaInicial = (int) (Math.random() * COLUMNAS);
        // Verifica si el espacio está libre
        boolean espacioDisponible = true;
        if (filaInicial + longitudBarco <= FILAS) {
            for (int i = 0; i < longitudBarco; i++) {
                if (tableroSolucion[filaInicial + i][columnaInicial] != '~') {
                    espacioDisponible = false;
                    break;
                }
            }
        } else {
            espacioDisponible = false;
        }

        // Si el espacio está libre, coloca el barco
        if (espacioDisponible) {
            for (int i = 0; i < longitudBarco; i++) {
                tableroSolucion[filaInicial + i][columnaInicial] = simboloBarco;
            }
        } else {
            // Si no está libre, llama a la función recursivamente para buscar otro espacio
            comprobarBarcosV(tableroSolucion, longitudBarco, simboloBarco);
        }
    }

    public static void modoFacil(char[][] tablero, char[][] tableroSolucion) {

        System.out.println("\n");

        inicializarTablero(tablero);
        inicializarTablero(tableroSolucion);
        colocarPortaaviones(tableroSolucion);
        colocarAcorazado(tableroSolucion);
        for (int i = 0; i < 3; i++) {
            colocarBarco(tableroSolucion);
        }

        for (int i = 0; i < 5; i++) {
            colocarLancha(tableroSolucion);
        }
        mostrartablero(tablero);
        mostrartablero(tableroSolucion);// eliminar pa entregar
        for (int i = 0; i < 50; i++) {
            coordenadasDisparar(tablero, tableroSolucion);
        }

    }

    public static void coordenadasDisparar(char[][] tablero, char[][] tableroSolucion) {
        Scanner sc = new Scanner(System.in);
        char arrayletras[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        System.out.println(" ");
        System.out.println("Introduce las coordenadas donde deseas disparar (ejemplo: A 0):\n");
        String coordenadas = sc.nextLine();
        char letra = coordenadas.toUpperCase().charAt(0);
        int fila = 0;
        for (int i = 0; i < arrayletras.length; i++) {
            if (letra == arrayletras[i]) {
                fila = i;
                break;
            }
        }
        int columna = Character.getNumericValue(coordenadas.charAt(2));
        System.out.println(" ");
        System.out.println("Has elegido disparar a la posición: " + letra + " " + columna + "\n");
        // Código para disparar y verificar si ha impactado en un barco
        actualizarTablero(tablero, tableroSolucion, fila, columna);
        mostrartablero(tablero);
        mostrartablero(tableroSolucion); //eliminar pa entregar
    }

    public static void actualizarTablero(char[][] tablero, char[][] tableroSolucion, int fila, int columna) {
        if (tableroSolucion[fila][columna] != '~') {
            tablero[fila][columna] = 'X';
            System.out.println("Tocado.\n");
        } else {
            tablero[fila][columna] = 'A';
            System.out.println("¡Agua!\n");
        } 
    }

    
    public static void mostrartablero(char[][] tablero) {
        int V[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};;
        System.out.print(" ");
        for (int i = 0; i < tablero.length; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        for (int i = 0; i < tablero.length; i++) {
            System.out.print((char) (65 + i)); //força a que la ixida siga una lletra per a traure la lletra corresponent
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.printf("%4s", tablero[i][j]);
            }
            System.out.println();
        }
    }
}
