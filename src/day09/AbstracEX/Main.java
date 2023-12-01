package day09.AbstracEX;

public class Main {
    public static void main(String[] args) {
        Shape[] s = new Shape[3];
        s[0] = new Circle();
        s[1] = new Rectangle();
        s[2] = new Triangle();

        String[] name = {"Circle", "Rectangle", "Triangle"};
        for(int i=0; i<s.length;i++) {
            s[i].show(name[i]);
        }
        System.out.println("*****************");
    }
}
