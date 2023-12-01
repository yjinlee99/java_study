package day09.interfaceEX;


import day09.AbstracEX.Shape;

public class Main {
    public static void main(String[] args) {
        Multiclass mc = new Multiclass();

        mc.draw();;
        mc.tshow("강감찬");
        mc.show("광개토대왕");
        System.out.println("===================");
        IDraw i = new Multiclass();
        i.draw();
        System.out.println(i.su);
        System.out.println("=============================");
        Shape s = new Multiclass();
        System.out.println(s.calc(3.3));
    }
}
