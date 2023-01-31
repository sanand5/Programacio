package proves2;

// Andreu Sanz Sanz

import java.nio.file.Files;
import java.util.Scanner;


public class Proves {
        
    public static void fun(char c, int f) {
        for (int i = 0; i < f; i++) {
            for (int j = i; j < f-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i*2+1; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        //fun('o',50);
        String h="hola";
        String a="a";
        System.out.println(h.equalsIgnoreCase(a));
        h.contentEquals(a);
    }
}

