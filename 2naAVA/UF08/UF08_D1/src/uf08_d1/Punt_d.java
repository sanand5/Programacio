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
        System.out.printf("(%d/%d)%n", getX(), getY());
    }
    public void setxy(int x, int y) {
        this.setX(x);
        this.setY(y);
    }
    public void mou(int dx,  int dy) {
        this.setX(this.getX() + dx);
        this.setY(this.getY() + dy);
    }
    public double distancia(Punt_d p) {
        return Math.sqrt(Math.pow(this.getX()-p.getX(),2)+Math.pow(this.getY()-p.getY(), 2));
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
