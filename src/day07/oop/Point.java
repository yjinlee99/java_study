package day07.oop;

public class Point {
    private int x,y;

    public Point() {
        x=100;
        y=100;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
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

    public void display() {
        System.out.println(x+", "+y);
    }
}
