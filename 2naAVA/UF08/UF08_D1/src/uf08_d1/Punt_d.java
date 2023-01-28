package uf08_d1;
// Andreu Sanz Sanz
public class Punt_d {
    private int x;
    private int y;
    
    public Punt_d(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void imprimeix() {
        System.out.printf("(%d/%d)%n",x,y);
    }
    public void setxy(int x, int y) {
        this.x=x;
        this.y=y;
    }
    public void mou(int dx,  int dy) {
        this.x+=dx;
        this.y+=dy;
    }
    public double disancia(Punt_d p) {
        return Math.sqrt(Math.pow(this.x-p.x,2)+Math.pow(this.y-p.y, 2));
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    
}
