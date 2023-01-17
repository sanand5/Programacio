package proves2;

// Andreu Sanz Sanz

public class Proves {
    public static void main(String[] args) {
        String jeje="false";
        int z=0;
        for (int i = 0; i < 100; i++) {
            z= (int) (Math.random()*6+2);
            System.out.println(z);
        if (z==8) {
            jeje="true";
        }
        }
        System.out.println(jeje);
    }
}
