package utf08_b2;

// Andreu Sanz Sanz

import java.util.Scanner;


public class UTF08_B2 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dades persona 1");
        System.out.print("Nom: ");
        String nom = sc.nextLine();
        System.out.print("Cognom: ");
        String cognoms = sc.nextLine();
        System.out.print("DNI: ");
        String dni = sc.nextLine();
        System.out.print("Edat: ");
        int edat = sc.nextInt();
        persona p1=new persona(nom, cognoms, dni, edat);
        sc.nextLine();
        if (p1.edat>=18)    System.out.printf("%s %s amb dni %s es major de edat",p1.nom,p1.cognoms,p1.dni);
        else    System.out.printf("%s %s amb dni %s no es major de edat",p1.nom,p1.cognoms,p1.dni);
        System.out.println();
        
        
    }

}
