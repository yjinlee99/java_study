package day08.Inheritance;

public class Point {
    protected int x,y;
    public Point() {
        this(100,100);
        System.out.println("Point default constructor call");
    }

    public Point(int x ){
        super();
        this.x = x;
        System.out.println("point 1개 constructor call");
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("point 2개 constructor call");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void disp() {
        System.out.println(x+ ", "+y);
    }
}
