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
    
    public static void preguntar(char[][] tab, int []variables) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Coordenades: ");
        String coord = sc.nextLine();
        int lletra=transcoord(coord);
        if (lletra>variables[1] || lletra<0 || (int) coord.charAt(1)-48>variables[0] || (int) coord.charAt(1)-48<0 ) {
            System.err.println("La cordenada es incorrecta");
            preguntar(tab, variables);
        }else marcar(lletra,(int) coord.charAt(1)-48, tab, variables);
        
    }
    
    public static int transcoord(String coord) {
        coord=coord.toUpperCase();
        char lletra = coord.charAt(0);
        return (int) lletra-65;
    }
    
    public static void marcar(int lletra, int num, char[][] tab, int []variables) {
        variables[2]--;
        switch (tab[lletra][num]) {
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
                           ////////////////////
                            
                           LA SOLUCIUÓ ERA:""");
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
        int filas=10, columnas=10, tirades=5, trobat = 0;
        int variables[] = new int[4];
        variables[0]=filas;
        variables[1]=columnas;
        variables[2]=tirades;
        variables[3]=trobat;
        char tab[][] = new char[filas][columnas];
        rellenar(tab);
        char[][] tabsol = Arrays.stream(tab).map(char[]::clone).toArray(char[][]::new);
        System.out.println("Introdueix les coordenades de la seguenta manera; FilaColumna");
        for (int i = 0; i < tirades; i++) {
            mostrartablero(tab, columnas, variables);
            preguntar(tab,variables);
            if(variables[3]==10) break;
        }
        if (variables[3]==10) {
            win(tabsol);
        }else lose(tabsol);        
    }
}
