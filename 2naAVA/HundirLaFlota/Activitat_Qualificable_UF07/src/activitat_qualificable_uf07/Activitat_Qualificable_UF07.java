package activitat_qualificable_uf07;

// Andreu Sanz Sanz

import java.util.Arrays;
import java.util.Scanner;

public class Activitat_Qualificable_UF07 {
    public static void mostrartablero(char[][] tab, int column, int []variables) {
        
        System.out.print(" ");
        for (int i = 0; i < column; i++) {
            System.out.printf("%3d",i);
        }
        System.out.println();
        for (int i = 0; i < tab.length; i++) {
               System.out.print((char)(65+i));
            for (int j = 0; j < tab[i].length; j++) {
                System.out.printf("%3s",tab[i][j]);
            }
            System.out.println();
        }
        mostrarvariables(variables);
    }
    public static void mostrarvariables(int []variables) {
        System.out.println("Tirades = "+variables[2]+"\tTrobat = "+variables[3]);
    }
    
    public static void rellenar(char[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            Arrays.fill(tab[i], '-');
        }
    }
    public static void barcos(char [][] tabsol) {
        for (int i = 0; i < 5; i++) {
            int fila=(int) (Math.random()*10), columna=(int) (Math.random()*10);
            if (tabsol[fila][columna]=='-') 
                tabsol[fila][columna]='L';
            else i--;
        }
        
        for (int i = 0; i < 1; i++) {
            int fila=(int) (Math.random()*10), columna=(int) (Math.random()*9)+1;
            if (tabsol[fila][columna]=='-' && tabsol[fila][columna-1]=='-' && tabsol[fila][columna+1]=='-') {
                tabsol[fila][columna]='B';
                tabsol[fila][columna-1]='B';
                tabsol[fila][columna+1]='B';
            }else{
                i--;
            }
        }
        for (int i = 0; i < 1; i++) {
            int fila=(int) (Math.random()*10), columna=(int) (Math.random()*8+1);
            if (tabsol[fila][columna-1]=='-' && tabsol[fila][columna]=='-' && tabsol[fila][columna+1]=='-' && tabsol[fila][columna+2]=='-') {
                tabsol[fila][columna-1]='Z';
                tabsol[fila][columna]='Z';
                tabsol[fila][columna+1]='Z';
                tabsol[fila][columna+2]='Z';
            }else{
                i--;
            }
        }
        for (int i = 0; i < 1; i++) {
            int fila=(int) (Math.random()*8+2), columna=(int) (Math.random()*10);
            if (tabsol[fila][columna]=='-' && tabsol[fila-1][columna]=='-' && tabsol[fila-2][columna]=='-' && tabsol[fila+1][columna]=='-' && tabsol[fila+2][columna]=='-') {
                tabsol[fila-1][columna]='P';
                tabsol[fila-2][columna]='P';
                tabsol[fila][columna]='P';
                tabsol[fila+1][columna]='P';
                tabsol[fila+2][columna]='P';
            }else{
                i--;
            }
        }
    }
    
    public static void preguntar(char[][] tab, int []variables, char[][] tabsol) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Coordenades: ");
        String coord = sc.nextLine();
        int lletra=transcoord(coord);
        if (lletra>=variables[1] || lletra<0 || (int) coord.charAt(1)-48>=variables[0] || (int) coord.charAt(1)-48<0 ) {
            System.err.println("La coordenada esta fora de rang");
            preguntar(tab, variables, tabsol);
        }else marcar(lletra,(int) coord.charAt(1)-48, tab, tabsol, variables);
        
    }
    
    public static int transcoord(String coord) {
        coord=coord.toUpperCase();
        char lletra = coord.charAt(0);
        return (int) lletra-65;
    }
    
    public static void marcar(int lletra, int num, char[][] tab, char [][] tabsol, int []variables) {
        variables[2]--;
        switch (tabsol[lletra][num]) {
            case '-':
                tab[lletra][num]='A';
                break;
            case 'A': case 'X':
                System.out.println("Ja habies marcat esta casella pero et conte una tirada, jeje :)");
                break;
            default:
                tab[lletra][num]='X';
                variables[3]++;
                break;
        }
    }
    public static void win(char[][] tabsol, int[] variables) {
        System.out.println("""
                           
                           ////////////////////
                           //////VICTORIA//////
                           ////////////////////
                           
                           Has trobat tots els vaixells.
                           
                           """);
        solucio(tabsol);
        mostrarvariables(variables);
    }
    public static void lose(char[][] tabsol, int[] variables) {
        System.out.println("""
                           ////////////////////
                           /////HAS PERDUT/////
                           ////////////////////
                            
                           LA SOLUCIUÓ ERA:""");
        solucio(tabsol);
        mostrarvariables(variables);
    }
    public static void solucio(char[][] tabsol) {
        System.out.print(" ");
        for (int i = 0; i < tabsol.length; i++) {
            System.out.printf("%3d",i);
        }
        System.out.println();
        
        for (int i = 0; i < tabsol.length; i++) {
               System.out.print((char)(65+i));
            for (int j = 0; j < tabsol[i].length; j++) {
                System.out.printf("%3s",tabsol[i][j]);
            }
            System.out.println();
        }
        
    }
    
    public static void main(String[] args) {
        int filas=10, columnas=10, tirades=50, trobat = 0;
        int variables[] = new int[4];
        variables[0]=filas;
        variables[1]=columnas;
        variables[2]=tirades;
        variables[3]=trobat;
        char tabsol[][] = new char[filas][columnas];
        rellenar(tabsol);
                
        barcos(tabsol);
        char tab[][] = new char[filas][columnas];
        rellenar(tab);
        
        
        System.out.println("Introdueix les coordenades de la seguenta manera; FilaColumna");
        for (int i = 0; i < tirades; i++) {
            solucio(tabsol);
            mostrartablero(tab, columnas, variables);
            preguntar(tab,variables, tabsol);
            if(variables[3]==10) break;
        }
        if (variables[3]==10) {
            win(tabsol, variables);
        }else lose(tabsol, variables);        
    }
}
