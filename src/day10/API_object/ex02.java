package day10.API_object;

class Circle {
    int x,y;
}
public class ex02 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();

        if(c1 == c2) System.out.println("same");
        else System.out.println("not same");
        System.out.println(c1.hashCode() + ", " + c2.hashCode());

        int x=3,y=3;
        System.out.println("기본 자료형 비교");
        if(x==y) System.out.println("same");
        else System.out.println("not same");

        String s1 = new String("korea");
        String s2 = new String("korea");
        System.out.println("참조 자료형 비교");
        if(s1.equals(s2)) System.out.println("same");
        else System.out.println("not same");

        System.out.println("println ***** equalsIgnoreCase method");

    }
}

