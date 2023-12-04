package day11;

import java.util.TreeSet;

public class collection_TreeSet_ex02 {
    public static void main(String[] args) {

        TreeSet set = new TreeSet();
        String from = "a";
        String to = "d";

        set.add("abc");
        set.add("alien");
        set.add("zero");
        set.add("bat");
        set.add("car");
        set.add("cake");
        set.add("elephant");
        set.add("flower");

        System.out.println(set);
        System.out.println("range search : from " + from +" to " + to);
        System.out.println("result : " + set.subSet(from,to));
    }
}
