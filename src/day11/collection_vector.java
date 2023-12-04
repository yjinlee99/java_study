package day11;

import java.util.Vector;

public class collection_vector {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        System.out.println("length / capacity");
        System.out.println(v.size() + "      /      " + v.capacity());

        Vector<Integer> v2 = new Vector<>(3,4);
        v2.add(20);
        v2.add(12);
        v2.add(55);
        v2.add(99);
        v2.add(55);
        System.out.println();
    }
}
