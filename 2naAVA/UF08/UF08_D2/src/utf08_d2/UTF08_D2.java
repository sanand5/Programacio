package utf08_d2;

// Andreu Sanz Sanz

import java.util.Scanner;


public class UTF08_D2 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        persona_d p1=new persona_d("Andreu", "Sanz", "16468354864C", 18);
        p1.imprimeix();
        System.out.println((p1.esMajorEdat()) ? p1.getNom()+" es major de edat":p1.getNom()+" no es major de edat");
        System.out.println(p1.esJubilat()?p1.getNom()+"esta jubilat":p1.getNom()+" no esta jubilat");
        System.out.println();
        persona_d p2=new persona_d("Paco", "Man", "3658114348A", 65);
        p2.imprimeix();
        System.out.println((p2.esMajorEdat()) ? p2.getNom()+" es major de edat":p2.getNom()+" no es major de edat");
        System.out.println(p2.esJubilat()?p2.getNom()+" esta jubilat":p2.getNom()+" no esta jubilat");
        System.out.println("Diferencia: "+p1.diferencia(p1, p2));
        
        
        
    }

}
