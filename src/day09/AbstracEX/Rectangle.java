package day09.AbstracEX;

public class Rectangle extends Shape{


    @Override
    public double calc(double x) {
        result = x * x;
        return result;
    }

    @Override
    public void show(String name) {
        calc(4);
        System.out.println(result);
    }
}
