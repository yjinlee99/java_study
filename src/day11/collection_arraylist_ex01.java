package day11;

import java.util.ArrayList;

public class collection_arraylist_ex01 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(1);
        list.add(2);
        list.add(5);
        list.add(0);
        list.add(3);

        ArrayList list2 = new ArrayList(list.subList(1,4));


    }
}
