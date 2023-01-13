package proves;

// Andreu Sanz Sanz

import java.util.Arrays;


public class Proves {
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
            System.out.println("B");
            int fila=(int) (Math.random()*10), columna=(int) (Math.random()*8)+1;
            System.out.println(fila+" "+columna);
            if (tabsol[fila][columna]=='-' && tabsol[fila][columna-1]=='-' && tabsol[fila][columna+1]=='-') {
                tabsol[fila][columna]='B';
                tabsol[fila][columna-1]='B';
                tabsol[fila][columna+1]='B';
            }else{
                i--;
            }
        }
        for (int i = 0; i < 1; i++) {
            System.out.println("Z");
            int fila=(int) (Math.random()*10), columna=(int) (Math.random()*7+1);
            System.out.println(fila+" "+columna);
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
            int fila=(int) (Math.random()*6+2), columna=(int) (Math.random()*10);
            System.out.println("P");
            System.out.println(fila+" "+columna);
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
//        for (int i = 0; i < 10; i++) {
//        char tabsol[][] = new char[filas][columnas];
//        rellenar(tabsol);
//        barcos(tabsol);
//        solucio(tabsol);
          System.out.println("B");  
        boolean nou=false;
        for (int i = 0; i < 10000; i++) {
            int v=(int)(Math.random()*9)+1;
            if (v==10) {
                nou=true;
            }
        }
        if (nou) {
            System.err.println("sique skdl.hjfglkdsajhgdsklfj");
        }
            
        
        
    }

}
