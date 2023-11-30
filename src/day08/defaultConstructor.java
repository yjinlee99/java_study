package day08;

public class defaultConstructor {
    public static void main(String[] args) {
        int x, y, gob = 1;
        char ch = 'A';
        String msg;

        x=5;
        y=10;
        msg = "hello encore!!!";

        gob = gob(x,y);
        System.out.println(ch);
        System.out.println(msg);
    }

    public static int gob(int x , int y) {
        return x*y;
    }
}
