package uf08_a3;

// Andreu Sanz Sanz

public class UF08_A3 {
    public static void main(String[] args) {
        rectangle r1=new rectangle();
        r1.x1=0; r1.y1=0;
        r1.x2=5; r1.y2=5;
        rectangle r2=new rectangle();
        r2.x1=7; r2.y1=9;
        r2.x2=2; r2.y2=3;
        int base=Math.abs(r1.x1-r1.x2);
        int altura=Math.abs(r1.y1-r1.y2);
        int perimetre=(base+altura)*2;
        int area=base*altura;
        System.out.printf("Coordenades r1: (%d,%d)/(%d,%d)\n",r1.x1,r1.y1,r1.x2,r1.y2);
        System.out.printf("Perimetre=%d\nArea=%d\n",perimetre,area);
        System.out.println();
        base=Math.abs(r2.x1-r2.x2);
        altura=Math.abs(r2.y1-r2.y2);
        perimetre=(base+altura)*2;
        area=base*altura;
        System.out.printf("Coordenades r2: (%d,%d)/(%d,%d)\n",r2.x1,r2.y1,r2.x2,r2.y2);
        System.out.printf("Perimetre=%d\nArea=%d;",perimetre,area);
        
    }

}
