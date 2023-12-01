package day09.AbstracEX;

public abstract class Shape {
    double result = 0;
    public abstract double calc(double x);
    public abstract void show(String name);

    public void view () {
        System.out.println("super class Shape");
    }

}
