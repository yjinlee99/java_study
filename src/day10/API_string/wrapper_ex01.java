package day10.API_string;

class Point {}

public class wrapper_ex01 {
    public static void main(String[] args) {

        Integer Ia = new Integer(9);
        Integer Ib = new Integer("9");
        String su = "30";
        int x = 10;
        Point pt = new Point();

        System.out.println(pt);
        System.out.println(pt.toString());
        System.out.println(pt.hashCode());
        System.out.println();

        System.out.println(Ia); //9
        System.out.println(Ia.hashCode());
        System.out.println(Ia.getClass().getName()+'@'+Integer.toHexString(Ia.hashCode()));
    }
}
