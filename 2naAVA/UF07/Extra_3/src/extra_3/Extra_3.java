package extra_3;

// Andreu Sanz Sanz

import java.util.Scanner;


public class Extra_3 {
    
    public static void rellenarmatriu(int[][] V) {          //pregunta el valor i el replena en la matriu en la posició corresponent, te com a parametre dentarda la matriu i no retorna res, ja que el parametre de entrada es un punter no un valor
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < V.length; i++) {
            for (int j = 0; j < V[i].length; j++) {
                System.out.printf("Valor en %d %d: ",i, j);
                V[i][j] = sc.nextInt();
            }
        }
    }
    public static boolean comprovar(int[][] V) {            // comprova que siga magica o no, te com a parametre dentarda la matriu i retorna un boolean de si es magica o no
        int fila1=0;
        boolean magica=true;
        for (int j = 0; j < V[0].length; j++) {             //suma la primera fila que servira de referència
            fila1+=V[0][j];
        }
        for (int i = 0; i < V.length; i++) {                //suma files, suma columnes i compara en la suma de la primera fila, si alguna ja no coinsidei magica = false i acaba
            int sumafila=0, sumacolumn=0 ;
            for (int j = 0; j < V[i].length; j++) {
                sumafila += V[i][j];
                sumacolumn += V[j][i];
            }
            if (fila1 != sumafila || fila1 != sumacolumn) {
                magica = false;
                break;
            }
        }
        int diagonaldreta=0, diagonalesquerre=0;
        for (int i = 0; i < V.length; i++) {                //suma la diagonal dreta i compara
            diagonaldreta +=V[i][i];
            diagonalesquerre +=V[i][V.length-(i+1)];
        }
        if (diagonaldreta != fila1 || diagonalesquerre != fila1) {
            magica = false;
        }
        return magica;
        
    }
    public static void mostrarmatriu(int[][] V) {           //mostra matriu, te com a parametre dentarda la matriu i no retorna res
        System.out.println("MATRIU:");
        for (int i = 0; i < V.length; i++) {
            for (int j = 0; j < V[i].length; j++) {
                System.out.printf("%-3d",V[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.print("""
                           /////////////////////////
                           ///   QUADRAT MAGIC   ///
                           /////////////////////////
                           """);
        System.out.println();
        int dimensio=1;
        boolean preguntat=false;
        do {                                //si l'usuari no introduei un numero >= a 1 torna a preguntar la dimensio de la matriu
            preguntat=false;
            System.out.print("Dimensió: ");
            Scanner sc = new Scanner(System.in);
            dimensio = sc.nextInt();
            if (dimensio<1) {
                System.err.println("No pots introduir un numero menor a 1");
                preguntat=true;
            }
        } while (preguntat);
        int V[][] = new int[dimensio][dimensio];
        rellenarmatriu(V);
        mostrarmatriu(V);
        System.out.println((comprovar(V))?"La matriu es magica":"La matriu no es magica"); 
        
        
    }

}
