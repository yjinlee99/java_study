package day10.API_object;

class Point {}

public class ex01 {
    public static void main(String[] args) {
        Point pt = new Point();
        System.out.println("Point pt information");
        System.out.println("Class name : " + pt.getClass());
        System.out.println("hash code : " + pt.hashCode());
        System.out.println("Object String : " + pt.toString());
        System.out.println("Object String : " + pt);
        System.out.printf("10진수 %d\n", 0x566776ad);
        System.out.println("=============================================");

        Point pt2 = new Point();
        System.out.println("Point pt2 information");
        System.out.println("Class name : " + pt2.getClass());
        System.out.println("hash code : " + pt2.hashCode());
        System.out.println("Object String : " + pt2.toString());
        System.out.println("Object String : " + pt2);

        System.out.println("==============================================");
        System.out.println("pt.toString() : toString의 의미 - day10.API_object.Point@3a82f6ef");
        System.out.println(pt2.getClass().getName()+'@'+Integer.toHexString(pt2.hashCode()));

        Point pt3 = new Point();

        if(pt.hashCode() == pt3.hashCode()) {
            System.out.println("same");
        } else {
            System.out.println("not same");
        }

        Point pt4;
        pt4 = pt;
        if(pt4.hashCode() == pt.hashCode()) {
            System.out.println("same");
        } else {
            System.out.println("not same");
        }



    }
}
