package activitat_qualificable_uf07;

// Andreu Sanz Sanz

import java.util.Arrays;
import java.util.Scanner;

public class Activitat_Qualificable_UF07 {
    public static void mostrartablero(char[][] tab, int column, int tirades) {
        
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
        
//        mostrarvariables(tirades);
        
    }
    public static void mostrarvariables(int tirades, int trobat) {
        System.out.println("Tirades = "+tirades);
        System.out.println("Trobat = "+trobat);
    }
    
    public static char[][] rellenar(char[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            Arrays.fill(tab[i], '-');
        }
        
        for (int i = 0; i < tab.length; i++) {
            int fila=(int) (Math.random()*9+1),columna=(int) (Math.random()*9+1);
            if (tab[fila][columna]=='-') 
                tab[fila][columna]='L';
            else i--;
            
        }
        return tab;
    }
    
    public static void preguntar(char[][] tab, int tirades, int trobat) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Coordenades: ");
        String coord = sc.nextLine();
        compcoord(transcoord(coord),(int) coord.charAt(1)-48, tab, trobat);
    }
    
    public static int transcoord(String coord) {
        coord=coord.toUpperCase();
        char lletra = coord.charAt(0);
        return (int) lletra-65;
    }
    
    public static void compcoord(int lletra, int num, char[][] tab, int trobat) {
        if (tab[lletra][num]=='-'){ 
            tab[lletra][num]='A';
        }
        else {
            tab[lletra][num]='X';
            trobat++;
        } 
    }
    public static void win(char[][] tab) {
        System.out.println("""
                           ////////////////////
                           //////VICTORIA//////
                           ////////////////////""");
        solucio(tab);
    }
    public static void lose(char[][] tab) {
        System.out.println("""
                           ////////////////////
                           /////HAS PERDUT/////
                           ////////////////////""");
        solucio(tab);
    }
    public static void solucio(char[][] tab) {
        System.out.print(" ");
        for (int i = 0; i < tab.length; i++) {
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
        
    }
    
    public static void main(String[] args) {
        int filas=10, columnas=10, tirades=50, trobat = 0;
        char tab[][] = new char[filas][columnas];
        rellenar(tab);
        for (int i = 0; i < tirades; i++) {
            mostrartablero(tab, columnas, tirades);
            preguntar(tab,tirades, trobat);
            mostrarvariables(tirades, trobat);
            if(trobat==10) break;
        }
        if (trobat==10) {
            win(tab);
        }else lose(tab);
        
        
        
    }

}
