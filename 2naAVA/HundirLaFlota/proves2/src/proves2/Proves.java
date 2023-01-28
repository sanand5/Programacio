package proves2;

// Andreu Sanz Sanz

import java.util.Scanner;


public class Proves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean si=true;
        do {
            si=false;
            System.out.print("?");
            int x = sc.nextInt();
            if (x==1) {
                si=true;
                break;
            }
        } while (si);
        
        
    }
}
