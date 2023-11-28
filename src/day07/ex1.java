package day07;

class Point {
    private int x,y; // 멤버변수 default

    //멤버함수
    //getter and setter
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

class Circle {
    private int x,y,r;

    //getter and setter

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

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public void display (){
        System.out.println(x + ", "+y+", "+r);
    }
}

public class ex1 {
    public static void main(String[] args) {
        Point pt = new Point(); //객체생성, 메모리에 할당, 생성자 함수 자동호출
//        pt.x = 3;
//        pt.y = 5;
//        System.out.println(pt.x + ", " + pt.y)
        pt.setX(55);
        pt.setY(100);
        pt.display();

        Circle c = new Circle();
        c.setX(3);
        c.setY(5);
        c.setR(6);
        c.display();
    }
}
