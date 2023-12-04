package day11;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

public class collection_vector_ex02 {
    public static void main(String[] args) {

        int i;
        Date date = new Date();
        Vector v = new Vector(3, 5);

        v.addElement("자바");
        v.addElement(new Double(12.34));
        v.addElement(date);

        System.out.println("---------------3개 객체 추가--------------");
        System.out.println(v.size() + ", capacity : " + v.capacity());

        Enumeration enu = v.elements();

        while (enu.hasMoreElements()) {
            System.out.println(enu.nextElement() + "\t");
        }
        if (v.contains("자바")) {
            System.out.println("자바 문자열 포함 되어 있음");
        } else {
            System.out.println("해당요소 없음");
        }

        System.out.println("12.34 객체 위치는? " + v.indexOf(new Double(12.34)));
        System.out.println("입력 시간은 ? " + date);

        System.out.println(v.get(v.indexOf(date)));
    }

}
