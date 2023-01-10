package uf07_18;

// Andreu Sanz Sanz

import java.util.Scanner;


public class UF07_18 {
    public static String fun(int num) {
        String V[] = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        return V[num%23];
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numeros DNI: ");
        int dni = sc.nextInt();
        System.out.println("La teua lletra es: "+ fun(dni));
    }

}
