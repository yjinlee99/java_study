package day09.interfaceEX;

import day09.AbstracEX.Shape;

public class Multiclass extends Shape implements Test,IDraw{
    String irun = "이순싱";
    @Override
    public double calc(double x) {
        System.out.println("Shape abstract class");
        return 100;
    }

    @Override
    public void show(String name) {

    }

    @Override
    public void draw() {
        System.out.println("IDraw interface method");
    }

    @Override
    public void tshow(String name) {
        System.out.println("Test interface method");
    }
}
