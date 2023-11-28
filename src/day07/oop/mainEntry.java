package day07.oop;

public class mainEntry {
    public static void main(String[] args) {
        Point pt = new Point();
        pt.display();
        pt.setX(100); pt.setY(100);
        pt.display();

        System.out.println("Circle");

        Circle c = new Circle();
        c.display();
        c.setX(4); c.setY(5); c.setR(9);
        c.display();
    }
}
