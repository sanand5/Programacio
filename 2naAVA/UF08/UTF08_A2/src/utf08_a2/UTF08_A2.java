package utf08_a2;

// Andreu Sanz Sanz

import java.util.Scanner;


public class UTF08_A2 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        persona_a p1=new persona_a();
        System.out.println("Dades persona 1");
        System.out.print("Nom: ");
        p1.nom = sc.nextLine();
        System.out.print("Cognom: ");
        p1.cognoms = sc.nextLine();
        System.out.print("DNI: ");
        p1.dni = sc.nextLine();
        System.out.print("Edat: ");
        p1.edat = sc.nextInt();
        sc.nextLine();
        persona_a p2=new persona_a();
        System.out.println("Dades persona 2");
        System.out.print("Nom: ");
        p2.nom = sc.nextLine();
        System.out.print("Cognom: ");
        p2.cognoms = sc.nextLine();
        System.out.print("DNI: ");
        p2.dni = sc.nextLine();
        System.out.print("Edat: ");
        p2.edat = sc.nextInt();
        if (p1.edat>=18)    System.out.printf("%s %s amb dni %s es major de edat",p1.nom,p1.cognoms,p1.dni);
        else    System.out.printf("%s %s amb dni %s no es major de edat",p1.nom,p1.cognoms,p1.dni);
        System.out.println();
        if (p2.edat>=18)    System.out.printf("%s %s amb dni %s es major de edat",p2.nom,p2.cognoms,p2.dni);
        else    System.out.printf("%s %s amb dni %s no es major de edat",p2.nom,p2.cognoms,p2.dni);
        System.out.println();
        
        
    }

}
