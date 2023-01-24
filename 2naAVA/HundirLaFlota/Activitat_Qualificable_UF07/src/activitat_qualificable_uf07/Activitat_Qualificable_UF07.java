package activitat_qualificable_uf07;

// Andreu Sanz Sanz

import java.util.Arrays;
import java.util.Scanner;

public class Activitat_Qualificable_UF07 {
    public static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                             ¡Selecciona el nivell!
                           //////////////////////////
                           /////////MENU/////////////
                           //////////////////////////
                           ///   1. Facil         ///
                           ///   2. Mitja         ///
                           ///   3. Difiçil       ///
                           ///   4. Personalitzat ///
                           //////////////////////////
                           """);
        System.out.print("? ");
        return sc.nextInt();
    }
    
    public static void nivell(int[] variables) {
                                            /*
                                            variables[0]=filas;
                                            variables[1]=columnas;
                                            variables[2]=enfonsats; 
                                            variables[3]=llanxes; 
                                            variables[4]=vaixells; 
                                            variables[5]=cuirassats; 
                                            variables[6]=portaavions; 
                                            variables[7]=tirades; 
                                            */
        String nivell="";
        boolean menu=false;
        do {
            menu=false;
            switch (menu()) {
                case 1 -> {
                    nivell="fàcil";
                    variables[3]=5;
                    variables[4]=3;
                    variables[5]=1;
                    variables[6]=1;
                    variables[7]=50;
                }
                case 2 -> {
                    nivell="mitja";
                    variables[3]=2;
                    variables[4]=1;
                    variables[5]=1;
                    variables[6]=1;
                    variables[7]=30;
                }
                case 3 -> {
                    nivell="difícil";
                    variables[3]=1;
                    variables[4]=1;
                    variables[5]=0;
                    variables[6]=0;
                    variables[7]=10;
                }
                case 4 -> {
                    nivell="personalitzat";
                    personalitzat(variables);
                }
                default -> {
                    System.out.println("***No reconec aqueta ordre***");    
                    menu = true;
                }
            }
        } while (menu);
    }
    
    public static void personalitzat(int[] variables) {
        Scanner sc = new Scanner(System.in);
        String nomvaixells[] = {"Les files","Les columnes","","Les llanxes","Els vaixells","Els cuirassats","Els portaavions","Les tirades"};
        int total=0;
        System.out.println("Recorda que les files tenen que estar entre 5-26 i les columnes entre 5-100");
        for (int i = 0; i < 8; i++) {
            System.out.printf("Nombre de %s: ",nomvaixells[i].substring(4));
            variables[i] = sc.nextInt();
            if (i==0 && (variables[i]<5 || variables[i]>26)) {
                System.err.printf("%s han de ser majors o iguals a 5 i menors que 26\n",nomvaixells[i]);
                i--;
            }else if (i==1 && (variables[i]<=0 || variables[i]>100)) {
                System.err.printf("%s han de ser majors a 0 i menors que 100\n",nomvaixells[i]);
                i--;
            }else if (i==1) {
                i++;
            }else if (i>2 && variables[i]<0 && i<7) {
                System.err.printf("%s han de ser majors o iguals a 0\n",nomvaixells[i]);
                i--;
            }else if (i==6) {
                total=variables[3]+variables[4]*3+variables[5]*4+variables[6]*5;
            }else if (i==7 && variables[7]<total) {
                System.err.printf("%s han de ser majors o iguals a %d\n",nomvaixells[7],total);
                i--;
            }
        }
    }
    
    public static void mostrartablero(char[][] tab, int []variables) {
        
        System.out.print(" ");
        for (int i = 0; i < variables[1]; i++) {
            System.out.printf("%4d",i);
        }
        System.out.println();
        for (int i = 0; i < tab.length; i++) {
               System.out.print((char)(65+i));
            for (int j = 0; j < tab[i].length; j++) {
                System.out.printf("%4s",tab[i][j]);
            }
            System.out.println();
        }
        mostrarvariables(variables);
    }
    
    public static void mostrarvariables(int []variables) {
        System.out.println("\tTirades = "+variables[7]+"\tTrobat = "+variables[2]);
    }
    
    public static void rellenar(char[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            Arrays.fill(tab[i], '-');
        }
    }
    
    public static boolean barcos(char [][] tabsol, int[] variables) {
        int cont=0;
        int min=2, max=variables[1]-3;
        for (int i = 0; i < variables[6]; i++) {
            cont++;
            int fila=(int) (Math.random()*(max-min+1)+min), columna=(int) (Math.random()*variables[1]);
            if (tabsol[fila][columna]=='-' && tabsol[fila-1][columna]=='-' && tabsol[fila-2][columna]=='-' && tabsol[fila+1][columna]=='-' && tabsol[fila+2][columna]=='-') {
                tabsol[fila-1][columna]='P';
                tabsol[fila-2][columna]='P';
                tabsol[fila][columna]='P';
                tabsol[fila+1][columna]='P';
                tabsol[fila+2][columna]='P';
            }else{
                i--;
            }
            if (cont>=1000) return false;
        }
        cont=0;
        min=1;
        for (int i = 0; i < variables[5]; i++) {
            cont++;
            int fila=(int) (Math.random()*variables[0]), columna=(int) (Math.random()*(max-min+1)+min);
            if (tabsol[fila][columna-1]=='-' && tabsol[fila][columna]=='-' && tabsol[fila][columna+1]=='-' && tabsol[fila][columna+2]=='-') {
                tabsol[fila][columna-1]='Z';
                tabsol[fila][columna]='Z';
                tabsol[fila][columna+1]='Z';
                tabsol[fila][columna+2]='Z';
            }else{
                i--;
            }
            if (cont>=1000) return false;
            
        }
        cont=0;
        max=variables[1]-2;
        for (int i = 0; i < variables[4]; i++) {
            cont++;
            int fila=(int) (Math.random()*variables[0]), columna=(int) (Math.random()*(max-min+1)+min);
            if (tabsol[fila][columna]=='-' && tabsol[fila][columna-1]=='-' && tabsol[fila][columna+1]=='-') {
                tabsol[fila][columna]='B';
                tabsol[fila][columna-1]='B';
                tabsol[fila][columna+1]='B';
            }else{
                i--;
            }
            if (cont>=1000) return false;
            
        }
        cont=0;
        for (int i = 0; i < variables[3]; i++) {
            cont++;
            int fila=(int) (Math.random()*variables[0]), columna=(int) (Math.random()*variables[1]);
            if (tabsol[fila][columna]=='-') 
                tabsol[fila][columna]='L';
            else i--;
            if (cont>=1000) return false;
        }
        return true;
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
                variables[2]++;
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
            System.out.printf("%4d",i);
        }
        System.out.println();
        
        for (int i = 0; i < tabsol.length; i++) {
               System.out.print((char)(65+i));
            for (int j = 0; j < tabsol[i].length; j++) {
                System.out.printf("%4s",tabsol[i][j]);
            }
            System.out.println();
        }
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas=10, columnas=10, enfonsats = 0;
        int variables[] = new int[8];
        variables[0]=filas;
        variables[1]=columnas;
        variables[3]=enfonsats;
        nivell(variables);
        char tabsol[][] = new char[variables[0]][variables[1]];
        char tab[][] = new char[variables[0]][variables[1]];
        rellenar(tabsol);
        while (!barcos(tabsol, variables)) {
            System.out.println("***No puc crear aquesta combinació***");
            personalitzat(variables);
            barcos(tabsol, variables);
        }
        rellenar(tab);
        
        
        int total=variables[3]+variables[4]*3+variables[5]*4+variables[6]*5;
        System.out.println("Introdueix les coordenades de la seguenta manera; FilaColumna");
        for (int i = 0; i < variables[7]; i++) {
            solucio(tabsol);
            mostrartablero(tab, variables);
            preguntar(tab,variables, tabsol);
            if(variables[2]==total) break;
        }
        if (variables[2]==total) {
            win(tabsol, variables);
        }else lose(tabsol, variables);        
    }
}
