package activitat_qualificable_uf07;

// Andreu Sanz Sanz
import java.util.Arrays;
import java.util.Scanner;

public class Activitat_Qualificable_UF07 {

    public static void menu() {
        System.out.print("""
                             ¡Selecciona el nivell!
                           //////////////////////////
                           ///////////MENU///////////
                           //////////////////////////
                           ///   1. Facil         ///
                           ///   2. Mitja         ///
                           ///   3. Difiçil       ///
                           ///   4. Personalitzat ///
                           ///   5. Informació    ///
                           //////////////////////////
                         
                           ?""");
    }

    public static void menuinfo() {
        System.out.print("""
                           1. Controls
                           2. Explicació joc
                           3. Eixir
                         
                           ?""");
    }

    public static void info(int[] variables) {
        Scanner sc = new Scanner(System.in);
        boolean preguntar;
        do {
            preguntar = false;
            switch (sc.nextInt()) {
                case 1:
                    System.out.print("""
                                   Bé, per comensar millor saber un poc com podem jugar.
                                   Cuan vagues a seleccionar les coordenades, asegurat que les has escrit adecuadament,
                                   si escrius mes del compte t'ho fare saber, el meu maxim esta entre 2 i 3 caracters, segons les columnes
                                   del tauler. El primer caracter es per a la fila i els dos restants per a la columna indicada.
                                   
                                   ?""");
                    info(variables);
                    break;
                case 2:
                    System.out.print("""
                                  Bé, per comensar millor saber un poc com funciona el jugar. Per jugar existeixen 4 modes de joc.
                                                            Façil | Mitja | Difiçil | Personalitçat
                                  El nivell façil compta amb:
                                                        Tauler de 10x10
                                                        5  llanxes
                                                        3  vaixells
                                                        1  cuirassat
                                                        1  portaavio
                                                        50 tirades
                                  El nivell mitja compta amb:
                                                        Tauler de 10x10
                                                        2  llanxes
                                                        1  vaixells
                                                        1  cuirassat
                                                        1  portaavio
                                                        30 tirades
                                  El nivell difiçil compta amb:
                                                        Tauler de 10x10
                                                        1  llanxes
                                                        1  vaixells
                                                        0  cuirassat
                                                        0  portaavio
                                                        10 tirades
                                   Ademes en el nivell personalitzat aquestes dades les pots triar al teu gust
                                   
                                   ?""");
                    info(variables);
                    break;
                case 3:
                    menu();
                    nivell(variables);
                    break;
                default:
                    preguntar = true;
                    System.out.println("***No reconec aquesta ordre***");
                    menuinfo();
            }
        } while (preguntar);
    }

    public static void nivell(int[] variables) {
        Scanner sc = new Scanner(System.in);
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
        String nivell = "";
        boolean menu = false;
        do {
            menu = false;
            switch (sc.nextInt()) {
                case 1 -> {
                    nivell = "fàcil";
                    variables[3] = 5;
                    variables[4] = 3;
                    variables[5] = 1;
                    variables[6] = 1;
                    variables[7] = 50;
                }
                case 2 -> {
                    nivell = "mitja";
                    variables[3] = 2;
                    variables[4] = 1;
                    variables[5] = 1;
                    variables[6] = 1;
                    variables[7] = 30;
                }
                case 3 -> {
                    nivell = "difícil";
                    variables[3] = 1;
                    variables[4] = 1;
                    variables[5] = 0;
                    variables[6] = 0;
                    variables[7] = 10;
                }
                case 4 -> {
                    nivell = "personalitzat";
                    personalitzat(variables);
                }
                case 5 -> {
                    menuinfo();
                    info(variables);
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
        String nomvaixells[] = {"Les files", "Les columnes", "", "Les llanxes", "Els vaixells", "Els cuirassats", "Els portaavions", "Les tirades"};
        int total = 0;
        System.out.println("Recorda que les files tenen que estar entre 5-26 i les columnes entre 5-100");
        for (int i = 0; i < 8; i++) {
            System.out.printf("Nombre de %s: ", nomvaixells[i].substring(4));
            variables[i] = sc.nextInt();
            if (i == 0 && (variables[i] < 5 || variables[i] > 26)) {
                System.err.printf("%s han de ser majors o iguals a 5 i menors que 26\n", nomvaixells[i]);
                i--;
            } else if (i == 1 && (variables[i] <= 0 || variables[i] > 100)) {
                System.err.printf("%s han de ser majors a 0 i menors que 100\n", nomvaixells[i]);
                i--;
            } else if (i == 1) {
                i++;
            } else if (i > 2 && variables[i] < 0 && i < 7) {
                System.err.printf("%s han de ser majors o iguals a 0\n", nomvaixells[i]);
                i--;
            } else if (i == 6) {
                total = variables[3] + variables[4] * 3 + variables[5] * 4 + variables[6] * 5;
            } else if (i == 7 && variables[7] < total) {
                System.err.printf("%s han de ser majors o iguals a %d\n", nomvaixells[7], total);
                i--;
            }
        }
    }

    public static void mostrartablero(char[][] tab, int[] variables) {

        System.out.print(" ");
        for (int i = 0; i < variables[1]; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        for (int i = 0; i < tab.length; i++) {
            System.out.print((char) (65 + i));
            for (int j = 0; j < tab[i].length; j++) {
                System.out.printf("%4s", tab[i][j]);
            }
            System.out.println();
        }
    }

    public static void mostrarvariables(int[] variables) {
        System.out.println("\tTirades = " + variables[7] + "\tTocats = " + variables[2]);
    } //es podria borrar

    public static void rellenar(char[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            Arrays.fill(tab[i], '-');
        }
    }

    public static boolean barcos(char[][] tabsol, int[] variables) {
        int cont = 0;
        int min = 2, max = variables[1] - 3;
        for (int i = 0; i < variables[6]; i++) {
            cont++;
            int fila = (int) (Math.random() * (max - min + 1) + min), columna = (int) (Math.random() * variables[1]);
            if (tabsol[fila][columna] == '-' && tabsol[fila - 1][columna] == '-' && tabsol[fila - 2][columna] == '-' && tabsol[fila + 1][columna] == '-' && tabsol[fila + 2][columna] == '-') {
                tabsol[fila - 1][columna] = 'P';
                tabsol[fila - 2][columna] = 'P';
                tabsol[fila][columna] = 'P';
                tabsol[fila + 1][columna] = 'P';
                tabsol[fila + 2][columna] = 'P';
            } else {
                i--;
            }
            if (cont >= 1000) {
                return false;
            }
        }
        cont = 0;
        min = 1;
        for (int i = 0; i < variables[5]; i++) {
            cont++;
            int fila = (int) (Math.random() * variables[0]), columna = (int) (Math.random() * (max - min + 1) + min);
            if (tabsol[fila][columna - 1] == '-' && tabsol[fila][columna] == '-' && tabsol[fila][columna + 1] == '-' && tabsol[fila][columna + 2] == '-') {
                tabsol[fila][columna - 1] = 'Z';
                tabsol[fila][columna] = 'Z';
                tabsol[fila][columna + 1] = 'Z';
                tabsol[fila][columna + 2] = 'Z';
            } else {
                i--;
            }
            if (cont >= 1000) {
                return false;
            }

        }
        cont = 0;
        max = variables[1] - 2;
        for (int i = 0; i < variables[4]; i++) {
            cont++;
            int fila = (int) (Math.random() * variables[0]), columna = (int) (Math.random() * (max - min + 1) + min);
            if (tabsol[fila][columna] == '-' && tabsol[fila][columna - 1] == '-' && tabsol[fila][columna + 1] == '-') {
                tabsol[fila][columna] = 'B';
                tabsol[fila][columna - 1] = 'B';
                tabsol[fila][columna + 1] = 'B';
            } else {
                i--;
            }
            if (cont >= 1000) {
                return false;
            }

        }
        cont = 0;
        for (int i = 0; i < variables[3]; i++) {
            cont++;
            int fila = (int) (Math.random() * variables[0]), columna = (int) (Math.random() * variables[1]);
            if (tabsol[fila][columna] == '-') {
                tabsol[fila][columna] = 'L';
            } else {
                i--;
            }
            if (cont >= 1000) {
                return false;
            }
        }
        return true;
    }

    public static void preguntar(char[][] tab, int[] variables, char[][] tabsol) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Coordenades: ");
        String coord = sc.nextLine();
        int lletra = translletra(coord), num = 0;
        switch (coord.length()) {
            case 2 -> num = (coord.charAt(1) - 48);
            case 3 -> num = (coord.charAt(1) - 48) * 10 + (coord.charAt(2) - 48);
            default -> {
                System.out.println("***La coordenada no esta en el tauler***");
                preguntar(tab, variables, tabsol);
            }
        }
        if (lletra >= variables[0] || lletra < 0 || num >= variables[1] || num < 0) {
            System.out.println("***La coordenada no esta en el tauler***");
            preguntar(tab, variables, tabsol);
        } else {
            marcar(lletra, num, tab, tabsol, variables);
        }

    }

    public static int translletra(String coord) {
        coord = coord.toUpperCase();
        char lletra = coord.charAt(0);
        return (int) lletra - 65;
    }

    public static void marcar(int lletra, int num, char[][] tab, char[][] tabsol, int[] variables) {
        if (tab[lletra][num] != '-') {
            System.out.println("Ja habies marcat esta casella pero et conte una tirada, jeje :)");
        } else if (tabsol[lletra][num] == '-') {
            tab[lletra][num] = 'A';
        } else  {
            tab[lletra][num] = 'X';
            variables[2]++;
        }
        variables[7]--;
    }

    public static void win(char[][] tabsol, int[] variables) {
        System.out.println("""
                           
                           ////////////////////
                           //////VICTORIA//////
                           ////////////////////
                           
                           Has enfonsat tots els vaixells.
                           
                           """);
        mostrartablero(tabsol, variables);
    }

    public static void lose(char[][] tabsol, int[] variables) {
        System.out.println("""
                           ////////////////////
                           /////HAS PERDUT/////
                           ////////////////////
                            
                           LA SOLUCIUÓ ERA:""");
        mostrartablero(tabsol, variables);
    }

    public static void main(String[] args) {
        int filas = 10, columnas = 10, enfonsats = 0;
        int variables[] = new int[8];
        variables[0] = filas;
        variables[1] = columnas;
        variables[3] = enfonsats;
        menu();
        nivell(variables);
        char tabsol[][] = new char[variables[0]][variables[1]];
        char tab[][] = new char[variables[0]][variables[1]];
        rellenar(tabsol);
        barcos(tabsol, variables);
        rellenar(tab);
        int total = variables[3] + variables[4] * 3 + variables[5] * 4 + variables[6] * 5;
        System.out.println("Introdueix les coordenades de la seguenta manera; FilaColumna");
        for (int i = 0; i < variables[7]; i++) {
            mostrartablero(tabsol, variables); //Mostra la solucio, la eliminare pa entregar
            mostrartablero(tab, variables);
            mostrarvariables(variables);
            preguntar(tab, variables, tabsol);
            if (variables[2] == total) {
                break;
            }
        }
        if (variables[2] == total) {
            win(tabsol, variables);
        } else {
            lose(tabsol, variables);
        }
    }
}
/*
Falta:
    Comentaris
    Coordenades mes grans per a nueros de dos xifres
    Gestionar barcos en personalitzat
    Mesaje de si has ja marcat ixa coordenada
    Cuan tirades =5 acaba i ns perque
    Preguntar si ni ha un minim de files i columnes en el personalitzat(si, 5x5)
 */
