package day11;

import java.util.TreeSet;

public class collection_TreeSet_ex01 {
    public static void main(String[] args) {

        TreeSet set = new TreeSet();
        int[] score = {86, 94, 69,27, 49,69, 100};

        for (int j : score) {
            set.add(j);
        }
        System.out.println(set);
        System.out.println("50보다 작은 값 : " + set.headSet(50));
        System.out.println("50보다 큰 값 : " + set.tailSet(50));

        System.out.println(set.first());
        System.out.println(set.last());
    }
}
