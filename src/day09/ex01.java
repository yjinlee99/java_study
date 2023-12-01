package day09;

abstract class Shape {
    double result = 0;
    public abstract double calc();
    public abstract void draw();

    public void show() {
        System.out.println("Super class Shape");
    }
}

class Circle extends Shape {
    double r = 5.0;

    @Override
    public double calc() {
        return 0;
    }

    @Override
    public void draw() {

    }
}

public class ex01 {
    public static void main(String[] args) {

    }
}
