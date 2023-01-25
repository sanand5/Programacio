package utf08_c2;

// Andreu Sanz Sanz

import java.util.Scanner;


public class UTF08_C2 {
 
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
        persona_c p1=new persona_c(nom, cognoms, dni, edat);
        sc.nextLine();
        if (p1.getEdat()>=18)    System.out.printf("%s %s amb dni %s es major de edat",p1.getNom(),p1.getCognom(),p1.getDni());
        else    System.out.printf("%s %s amb dni %s no es major de edat",p1.getNom(),p1.getCognom(),p1.getDni());
        System.out.println();
        
        
    }

}
