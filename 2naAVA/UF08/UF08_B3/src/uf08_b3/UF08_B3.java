package uf08_b3;

// Andreu Sanz Sanz

public class UF08_B3 {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(0, 5, 0, 5);
        System.out.printf("Coordenades r1: (%d,%d)/(%d,%d)\n",r1.x1,r1.y1,r1.x2,r1.y2);
        System.out.printf("Perimetre=%.2f\nArea=%.2f\n",r1.perimetre(),r1.area());
        System.out.println();
        Rectangle r2=new Rectangle(45, 4, 6, 4);
        System.out.printf("Coordenades r2: (%d,%d)/(%d,%d)\n",r2.x1,r2.y1,r2.x2,r2.y2);
        System.out.printf("Perimetre=%.2f\nArea=%.2f\n",r2.perimetre(),r2.area());
        System.out.println();
    }
}
