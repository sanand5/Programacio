package activitat_qualificable_uf07;

// Andreu Sanz Sanz
import java.util.Arrays;
import java.util.Scanner;

public class Activitat_Qualificable_UF07 {

    // Aquesta funció mostra el menú principal de selecció de nivell de joc
    // *No retorna res
    // *No te parametres de entrada
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

    // Aquesta funció mostra el menú d'informació del joc
    // *No retorna res
    // *No te parametres de entrada
    public static void menuInfo() {
        System.out.print("""
                           1. Controls
                           2. Explicació joc
                           3. Eixir
                         
                           ?""");
    }

    // Aquesta funció mostra informació sobre el joc, les seves controls, explicació, crèdits i eixir
    // *No retorna res
    // * Parámetres d'entrada:
    //      - int[] variables: Referència a la matriu de variables per a obtenir les dades del joc
    public static void info(int[] variables) {
        Scanner sc = new Scanner(System.in);
        boolean preguntar;
        do {
            preguntar = false;
            switch (sc.nextLine()) {
                case "1" -> {
                    System.out.print("""
                                        Bé, per comensar millor saber un poc com podem jugar.
                                        Per comenzar, cuan vagues a seleccionar les coordenades, asegurat que les has escrit adecuadament (FilaColumna), del contrari no entendre res i t'ho tornare a preguntar.
                                        Recorda que si el teu tauler es de 10x10 les cordenades fora de rang no les entendre ,en canvi en els taulers de mes de 10x10 si que et marcare si estas fora de rang i si escrius una casella ja marcada et restare una tirada..
                                        Sempre que vegues un "?" es perque estare esperant la teua resposta.
                                        Els misatges entre ## son mistges d'error i auras de tornar a introduir un valor o un caracter.
                                        En el moment que et canses de jugar escriu "esc" per acabar la partida.
                                        Si vols saber mes informació de com jugar escriu 2.
                                     
                                        1.Controls | 2.Explicació joc | 3.Credits | 4.Eixir
                                        
                                        ?""");
                    info(variables);
                }
                case "2" -> {
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
                                                                1  vaixell
                                                                1  cuirassat
                                                                1  portaavio
                                                                30 tirades
                                        El nivell difiçil compta amb:
                                                                Tauler de 10x10
                                                                1  llanxa
                                                                1  vaixell
                                                                0  cuirassats
                                                                0  portaavions
                                                                10 tirades
                                        Ademes en el nivell personalitzat aquestes dades les pots triar al teu gust
                                        1.Controls | 2.Explicació joc | 3.Credits | 4.Eixir
                                        
                                        ?""");
                    info(variables);
                }
                case "3" -> {
                    menu();
                    nivell(variables);
                }
                default -> {
                    System.out.println("# No reconec aquesta ordre #");
                    preguntar = true;
                    menuInfo();
                }

            }
        } while (preguntar);
    }

    // Aquesta funció selecciona el nivell de joc i retorna el nombre de tirades
    // *Retorna: int nombre de tirades per al nivell seleccionat
    // *Paràmetres d'entrada:
    //      - int[] variables: Referència a la matriu variables per conèixer i modificar les dades del joc
    public static int nivell(int[] variables) {
        Scanner sc = new Scanner(System.in);
//        variables[0]=filas;
//        variables[1]=columnas;
//        variables[2]=enfonsats; 
//        variables[3]=llanxes; 
//        variables[4]=vaixells; 
//        variables[5]=cuirassats; 
//        variables[6]=portaavions; 
//        variables[7]=tirades; 
        String nivell = "";
        boolean menu;
        do {
            menu = false;
            switch (sc.nextLine()) {
                case "1" -> {
                    nivell = "fàcil";
                    variables[3] = 5;
                    variables[4] = 3;
                    variables[5] = 1;
                    variables[6] = 1;
                    variables[7] = 50;
                }
                case "2" -> {
                    nivell = "mitja";
                    variables[3] = 2;
                    variables[4] = 1;
                    variables[5] = 1;
                    variables[6] = 1;
                    variables[7] = 30;
                }
                case "3" -> {
                    nivell = "difícil";
                    variables[3] = 1;
                    variables[4] = 1;
                    variables[5] = 0;
                    variables[6] = 0;
                    variables[7] = 10;
                }
                case "4" -> {
                    nivell = "personalitzat";
                    personalitzat(variables);
                }
                case "5" -> {
                    menuInfo();
                    info(variables);
                }
                default -> {
                    System.out.println("# No reconec aqueta ordre #");
                    menu = true;
                }
            }
        } while (menu);
        if (nivell != "personalitzat") {
            infonivell(nivell, variables);
        }
        return variables[7];
    }

    // Aquesta funció mostra informació sobre la selecció de nivell al joc, incloent les dades del tauler, les tipus i quantitats de vaixells, i les tirades disponibles
    // *No retorna res
    // *Paràmetres d'entrada:
    //      - String nivell: Nom del nivell seleccionat
    //      - int[] variables: Referència a la matriu de variables per a obtenir les dades del joc
    public static void infonivell(String nivell, int[] variables) {
        String nomBarcos[] = {"llanx", "vaixell", "cuirassat", "portaavio"};
        //Gestio de el nom si es plural o singular
        if (variables[3] == 0 || variables[3] > 1) {
            nomBarcos[0] += "es";
        } else {
            nomBarcos[0] += "a";
        }
        if (variables[4] == 0 || variables[4] > 1) {
            nomBarcos[1] += "s";
        }
        if (variables[5] == 0 || variables[5] > 1) {
            nomBarcos[2] += "s";
        }
        if (variables[6] == 0 || variables[6] > 1) {
            nomBarcos[3] += "ns";
        }
        System.out.printf("""
                          Has seleccionat el nivell %s.
                          Constes de:
                                Tauler de 10x10
                                %d  %s
                                %d  %s
                                %d  %s
                                %d  %s
                                %d tirades
                          
                          """, nivell, variables[3], nomBarcos[0], variables[4], nomBarcos[1], variables[5], nomBarcos[2], variables[6], nomBarcos[3], variables[7]);
    }

    // Aquesta funció personalitza els paràmetres per al joc, incloent les dades del tauler, les tipus i quantitats de vaixells, i les tirades disponibles
    // *No retorna res
    // *Paràmetres d'entrada:
    //      - int[] variables: Referència a la matriu variables per a emmagatzemar les dades personalitzades
    public static void personalitzat(int[] variables) {
        Scanner sc = new Scanner(System.in);
        String nomvaixells[] = {"Les files", "Les columnes", "", "Les llanxes", "Els vaixells", "Els cuirassats", "Els portaavions", "Les tirades"};
        int total = 0;
        System.out.println("Recorda que les files tenen que estar entre 5-26 i les columnes entre 5-100");
        for (int i = 0; i < 8; i++) {
            System.out.printf("Nombre de %s: ", nomvaixells[i].substring(4));
            variables[i] = sc.nextInt();
            if (i == 0 && (variables[i] < 5 || variables[i] > 26)) { //files
                System.out.printf("# %s han de ser majors o iguals a 5 i menors que 26 #\n", nomvaixells[i]);
                i--; //per a que torne a pregunta, aixina en tots
            } else if (i == 1 && (variables[i] <= 0 || variables[i] > 100)) { //columnes
                System.out.printf("# %s han de ser majors a 0 i menors que 100 #\n", nomvaixells[i]);
                i--;
            } else if (i == 1) { //bota una posició de variables[] perque variables[2]=enfonsats
                i++;
            } else if (i > 2 && variables[i] < 0 && i < 7) { //llanxes, vaixells, cruissats i portaavions
                System.out.printf("# %s han de ser majors o iguals a 0 #\n", nomvaixells[i]);
                i--;
            } else if (i == 6) { // gestiona el minim de tirades
                total = variables[3] + variables[4] * 3 + variables[5] * 4 + variables[6] * 5;
                if (total > variables[0] * variables[1]) {
                    total = variables[0] * variables[1];
                }
            } else if (i == 7 && variables[7] < total) { // tirades
                System.out.printf("# %s han de ser majors o iguals a %d #\n", nomvaixells[7], total);
                i--;
            }
        }
    }

    // Aquesta funció mostra el tauler de joc
    // *No retorna res
    // *Paràmetres d'entrada:
    //      - char[][] tab: Referència a la matriu de caràcters que representa el tauler
    //      - int[] variables: Referència a la matriu de variables per a obtenir les dades del joc
    public static void mostrarTauler(char[][] tab, int[] variables) {

        System.out.print(" ");
        for (int i = 0; i < variables[1]; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        for (int i = 0; i < tab.length; i++) {
            System.out.print((char) (65 + i)); //força a que la ixida siga una lletra per a traure la lletra corresponent
            for (int j = 0; j < tab[i].length; j++) {
                System.out.printf("%4s", tab[i][j]);
            }
            System.out.println();
        }
    }

    // Aquesta funció mostra les variables actuals del joc, incloent el nombre de tirades disponibles i el nombre de vaixells tocats
    // *No retorna res
    // *Paràmetres d'entrada:
    //      - int[] variables: Referència a la matriu de variables per a obtenir les dades del joc
    public static void mostrarVariables(int[] variables) {
        System.out.println("\tTirades = " + variables[7] + "\tTocats = " + variables[2]);
    }

    // Aquesta funció omple la matriu amb valors per defecte, en aquest cas amb guions '-'
    // *No retorna res
    // *Paràmetres d'entrada:
    //      - char[][] tab: Referència a la matriu del tauler per a omplir-la
    public static void replenarTauler(char[][] tab) {
        for (char[] tab1 : tab) {
            Arrays.fill(tab1, '-');
        }
    }

    // Aquesta funció fica els vaixells en el tauler 
    // *No retorna res
    // *Paràmetres d'entrada:
    //      - char[][] tabsol: Referència a la matriu del tauler amb les solucions
    //      - int[] variables: Referència a la matriu de variables per a obtenir les dades del joc
    public static void barcos(char[][] tabsol, int[] variables) {
        int cont = 0;
        int min = 2, max = variables[0] - 3;
        int Pficats = 0, Zficats = 0, Bficats = 0;
        for (int i = 1; i <= variables[6]; i++) {
            cont++;
            int fila = (int) (Math.random() * (max - min + 1) + min), columna = (int) (Math.random() * variables[1]); //fila(entre 2-(files-3), columna (entre 0-columnes))
            if (tabsol[fila][columna] == '-' && tabsol[fila - 1][columna] == '-' && tabsol[fila - 2][columna] == '-' && tabsol[fila + 1][columna] == '-' && tabsol[fila + 2][columna] == '-') { // comprova que tots els espais estiguen buits i aixina en tots
                tabsol[fila - 1][columna] = 'P';
                tabsol[fila - 2][columna] = 'P';
                tabsol[fila][columna] = 'P';
                tabsol[fila + 1][columna] = 'P';
                tabsol[fila + 2][columna] = 'P';
                Pficats++;
            } else {
                i--;
            }
            if (cont >= 10000) {
                if (i == 0) {
                    System.out.println("# No he pogut ficar-te cap portaavio #");
                } else {
                    System.out.printf("# No he pogut ficar tots els portaavions, pero n'he ficat %d #%n", i);
                }
                break;
            }
        }
        cont = 0;
        min = 1;
        max = variables[1] - 3;
        for (int i = 1; i <= variables[5]; i++) {
            cont++;
            int fila = (int) (Math.random() * variables[0]), columna = (int) (Math.random() * (max - min + 1) + min); //fila(entre 0-files), columna (entre 1-(columnes-3)))
            if (tabsol[fila][columna - 1] == '-' && tabsol[fila][columna] == '-' && tabsol[fila][columna + 1] == '-' && tabsol[fila][columna + 2] == '-') {
                tabsol[fila][columna - 1] = 'Z';
                tabsol[fila][columna] = 'Z';
                tabsol[fila][columna + 1] = 'Z';
                tabsol[fila][columna + 2] = 'Z';
                Zficats++;
            } else {
                i--;
            }
            if (cont >= 10000) {
                if (i == 0) {
                    System.out.println("# No he pogut ficar-te cap cruissat #");
                } else {
                    System.out.printf("# No he pogut ficar tots els cruissats, pero n'he ficat %d #%n", i);
                }
                break;
            }

        }
        cont = 0;
        max = variables[1] - 2;
        for (int i = 1; i <= variables[4]; i++) {
            cont++;
            int fila = (int) (Math.random() * variables[0]), columna = (int) (Math.random() * (max - min + 1) + min);//fila(entre 0-files), columna (entre 1-(columnes-2))
            if (tabsol[fila][columna] == '-' && tabsol[fila][columna - 1] == '-' && tabsol[fila][columna + 1] == '-') {
                tabsol[fila][columna - 1] = 'B';
                tabsol[fila][columna] = 'B';
                tabsol[fila][columna + 1] = 'B';
                Bficats++;
            } else {
                i--;
            }
            if (cont >= 10000) {
                if (i == 0) {
                    System.out.println("# No he pogut ficar-te cap vaixell #");
                } else {
                    System.out.printf("# No he pogut ficar tots els vaixells, pero n'he ficat %d #%n", i);
                }
                break;
            }

        }
        cont = 0;
        int posicionsRestants = (variables[0] * variables[1]) - (Bficats * 3 + Zficats * 4 + Pficats * 5);
        if (posicionsRestants==0) {
            System.out.println("# No he pogut ficar-te cap llanxa #");
        } else if (posicionsRestants < variables[3]) {
            System.out.printf("# No he pogut ficar totes les llanxes, pero n'he ficat %d #%n", posicionsRestants);
        }
//        while (posicionsRestants > 0 || variables[3]==0) {
//            int fila = (int) (Math.random() * variables[0]), columna = (int) (Math.random() * variables[1]);//fila(entre 0-files), columna (entre 0-columnes)
//            if (tabsol[fila][columna] == '-') {
//                tabsol[fila][columna] = 'L';
//                posicionsRestants--;
//            }
//        }
        for (int i = 0; i < variables[3] && posicionsRestants > 0; i++) {
            int fila = (int) (Math.random() * variables[0]), columna = (int) (Math.random() * variables[1]);//fila(entre 0-files), columna (entre 0-columnes)
            if (tabsol[fila][columna] == '-') {
                tabsol[fila][columna] = 'L';
                posicionsRestants--;
            }
        }
    }

    // Aquesta funció pregunta la coordebada i gestiona errors que puga escriure el usuari per a les coordenades, també mostra el tauler i les variables
    // *Retorna: boolean per saber si el rendixes al escriure "esc"
    // *Paràmetres d'entrada:
    //      - char[][] tab: Referència a la matriu del tauler del jugador
    //      - int[] variables: Referència a la matriu de variables per a obtenir les dades del joc
    //      - char[][] tabsol: Referència a la matriu del tauler amb les solucions
    public static boolean preguntar(char[][] tab, int[] variables, char[][] tabsol) {
        Scanner sc = new Scanner(System.in);
        boolean preguntar = true;
        do { // si no respon lo esperat, torna a preguntar
            if (variables[7] == 0) {
                break;
            }
            System.out.print("Coordenades: ");
            String coord = sc.nextLine();
            if ("esc".equals(coord)) {
                return true;
            }
            int lletra = translletra(coord), num;
            switch (coord.length()) {
                case 2 ->
                    num = (coord.charAt(1) - 48);
                case 3 ->
                    num = (coord.charAt(1) - 48) * 10 + (coord.charAt(2) - 48);
                default -> {
                    System.out.println("# La coordenada no esta en el tauler #");
                    continue;
                }
            }
            if (lletra >= variables[0] || lletra < 0 || num >= variables[1] || num < 0) {
                System.out.println("# La coordenada no esta en el tauler #");
            } else if (tab[lletra][num] != '-') {
                System.out.println("# Ja habies marcat esta casella pero et conte una tirada, jeje :) #");
                variables[7]--;
                mostrarVariables(variables);
            } else {
                marcar(lletra, num, tab, tabsol, variables);
                mostrarTauler(tabsol, variables); //Mostra la solucio, la eliminare pa entregar
                mostrarTauler(tab, variables);
                mostrarVariables(variables);
                preguntar = false;
            }

        } while (preguntar);
        return false;
    }

    // Aquesta funció transforma la lletra de la coordenada en un numero per ha poder apunta a eixa posicio de la fila.
    // *Retorna: int la posicio de la fila seleccionada
    // *Paràmetres d'entrada:
    //      - String coord: Referència a la coordenada seleccionada
    public static int translletra(String coord) {
        coord = coord.toUpperCase();
        char lletra = coord.charAt(0);
        return (int) lletra - 65;
    }

    // Aquesta funció marca amb una A o una X la posició seleccionada i informa si has tocat un vaixell
    // *No retorna res
    // *Paràmetres d'entrada:
    //      - int lletra: Referència a la fila ha marcar
    //      - int num: Referència a la columna a marcar
    //      - char[][] tab: Referència a la matriu del tauler del jugador
    //      - char[][] tabsol: Referència a la matriu del tauler amb les solucions
    //      - int[] variables: Referència a la matriu de variables per a obtenir les dades del joc
    public static void marcar(int lletra, int num, char[][] tab, char[][] tabsol, int[] variables) {
        if (tabsol[lletra][num] == '-') {
            tab[lletra][num] = 'A';
        } else {
            System.out.println("""
                                    ###############
                                    #   ¡TOCAT!   #
                                    ###############
                               """);
            tab[lletra][num] = 'X';
            variables[2]++;
        }
        variables[7]--;
    }

    // Aquesta funció mostra un misatge de victoria i el tauler amb les solucions
    // *Retorna: boolean per ha saber que el judor ja ha guanyat
    // *Paràmetres d'entrada:
    //      - char[][] tabsol: Referència a la matriu del tauler amb les solucions
    //      - int[] variables: Referència a la matriu de variables per a obtenir les dades del joc
    public static boolean win(char[][] tabsol, int[] variables) {
        System.out.println("""
                                                                                                           
                                                                                                           
                                                                              .     #@@@@                  
                                                         ,%%%#              %##   @@@@@@@@@%               
                                                         ,%%%%%%         .##% #&@@@@ *@@@@@@@@             
                                                    ,*      %%%%%%(    %##, %@@@@@@.  @@@@@@@@@            
                                                  %%%%%#      ,%%%%%%##%,,&@@@@   #@@@@@@@@@@@@            
                                                    %%%%%%/      ####, #@@@@@@@@@@@@@@@@@@@@@@@            
                                                      /%%%%%%  .##% ,&@@@@@   &@@@@@@@@@@@@@@,             
                                                         %%%%#### #@@@@/,@@@@@@@@@@@@@@@@@@                
                                                          .##% (&@@@@@@   @@@@@@@@@@@@@@,                  
                                                        %##. #@@@@@@@@@@@@@@@@@@@@@@@@                     
                                                      ##% .@@@@@@@@@@@@@@@@@@@@@@@@.                       
                                                   %##  #@@@@@@@@@@@@@@@@@@@@@@@@                          
                           ,      .             .##% .@@(@@@@@@@@@@@@@@@@@@@@@.      (      .              
                           **/  ****/  ,***/.  /***#@@#%%%#@@&%%%#@@&%%%%&@@/*/*,  (/**/  ,*/*/. .//**,  //
                           *********************/#%%%%%%%%%%%%%%%%%%%%%%%/*********************************
                           ********************%%%%%%%%%%%%%%%%%%%%%%%%************************************
                           *****************#%%%%%%%%%%%%%%%%%%%%%%%/**************************************
                           ***************%%%%%%%%%%%%%%%%%%%%%%%%*****************************************
                           *****************%%%%%%%%%%%%%%%%%%%/*******************************************
                           *******************(%%%%%%%%%%%%%%**********************************************
                           *********************/#%%%%%%%%*************************************************
                           ********************************************************************************
                           
                           d88888b d8b   db  .d88b.  d8888b.  .d8b.  d8888b.  .d88b.  d8b   db  .d8b.  
                           88'     888o  88 .8P  Y8. 88  `8D d8' `8b 88  `8D .8P  Y8. 888o  88 d8' `8b 
                           88ooooo 88V8o 88 88    88 88oobY' 88ooo88 88oooY' 88    88 88V8o 88 88ooo88 
                           88~~~~~ 88 V8o88 88    88 88`8b   88~~~88 88~~~b. 88    88 88 V8o88 88~~~88 
                           88.     88  V888 `8b  d8' 88 `88. 88   88 88   8D `8b  d8' 88  V888 88   88 
                           Y88888P VP   V8P  `Y88P'  88   YD YP   YP Y8888P'  `Y88P'  VP   V8P YP   YP     
                                                                                                                                                                                                                              
                                                Has enfonsat tots els vaixells.
                           
                           """);
        mostrarTauler(tabsol, variables);
        return true;
    }

    // Aquesta funció mostra un misatge de derrota i el tauler amb les solucions
    // *No retorna res
    // *Paràmetres d'entrada:
    //      - char[][] tabsol: Referència a la matriu del tauler amb les solucions
    //      - int[] variables: Referència a la matriu de variables per a obtenir les dades del joc
    public static void gameOver(char[][] tabsol, int[] variables) {
        System.out.println("""                                                                                                        
                                                        ////                  ////                                               
                                                        *,,////            ///,,,/                                               
                                                        ////(&#////////////###////                                               
                                                    ////&&&#////&&&#&%%&&&(////&&&*//*                                           
                                                *,.*&&&&%&&#..,/&&&#%&&&&&(.../&&&#&&#..,.                                       
                                                /%%&(%%%&&%#%%%(&&&(%&%%&&#%&&(&&&/&&(%%&/                                       
                                                *&&&    &&&#&&&(&&&(&&%&&&(&&&#&&&    &&&/                                       
                                            .&%&,       @&&#                  /&&&       /&%%,                                   
                                                        &&&%&&&/          *%&&(&&&                                               


                              .***************       ,**********        *******   ********  .***************                     
                              ******               *****.    ******     ******************  ******                               
                              */**/*  ***/***/     //**/******/****     //***  ***  ***//*  *//********                          
                              *#(//*     ((///     /((//.    *((//*     /#(//       */////  */((/*                               
                                 //(((//(((,       /(///.    *((///     ((///       *///((  *(((//((((//((//                     



                                 ,,,,.**,,.        ,,.**.    .*.,*,     *,,,*,,,,*,,,,,.     ,,,,*,,,,*,*                        
                              (%%%%(     %%%%%     %%%%%.    /%%%%%     %%%%%               /%%%%#     %%%%#                     
                              #&&&&(     &&&&&     &&&&&.    /&@&&%     &&&&&               /&&&&&     &&&&#                     
                              (&@@@(     &@@@&     %&@@@*    /&@@@&     %&@@&*////          /&&&@@&%&@@//.                       
                              #&@@@%     @@@@@       *@@&@@@@&&@        &@@@@               /@&@@&  @@@@&.                       
                                 &&&&&&&@&@/            %&&&&/          &&&&&&&&&&@&&&&/    /&&&&%     &&&&%                     
                                                                                                                                                      
                                                                                                       
                              LA SOLUCIUÓ ERA:""");
        mostrarTauler(tabsol, variables);
    }

    // Aquesta funció es la que fa la funcio de jugar
    // *No retorna res
    // *No te parametres de entrada
    public static void jugar() {
        int files = 10, columnes = 10, enfonsats = 0;
        boolean guanyat = false;
        int variables[] = new int[8];
        variables[0] = files;
        variables[1] = columnes;
        variables[3] = enfonsats;
        menu();
        int tiradesfixes = nivell(variables);
        char tabsol[][] = new char[variables[0]][variables[1]];
        char tab[][] = new char[variables[0]][variables[1]];
        replenarTauler(tabsol);
        barcos(tabsol, variables);
        replenarTauler(tab);
        int total = variables[3] + variables[4] * 3 + variables[5] * 4 + variables[6] * 5; //total de vegades tocat
        System.out.println("Introdueix les coordenades de la seguenta manera; FilaColumna");
        mostrarTauler(tabsol, variables); //Mostra la solucio, la eliminare pa entregar
        mostrarTauler(tab, variables);
        mostrarVariables(variables);
        for (int i = 0; i < tiradesfixes; i++) {
            if (preguntar(tab, variables, tabsol)) { // acaba al escriure esc ja que retornaria true
                break;
            }
            if (variables[2] == total) { // compara si has tocat tots els vaixells per si has guañat o no 
                guanyat = win(tabsol, variables);
                break;
            }
        }
        if (variables[7] == 0 && guanyat == false) { // la segona comprovació esta creada per ha evitar que quan gunyes en la ultima tirada cride a win i a lose a la vegada
            gameOver(tabsol, variables);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean jugar;
        do {
            jugar();
            System.out.print("""
                             Vols tornar a jugar?(s/n)
                             ?""");
            if ("n".equals(sc.nextLine())) {
                break;
            }
        } while (true);
    }
}
