package day11;

import java.util.HashSet;
import java.util.Iterator;

public class collection_set_ex01 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("키보드");
        hs.add("마우스");
        hs.add("모니터");
        hs.add("컵");
        hs.add("볼펜");

        System.out.println("요소 개수 : " + hs.size());

        Iterator it = hs.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        HashSet<Integer> hs2 = new HashSet<>();
        hs2.add(32);
        hs2.add(499);
        hs2.add(4952);
        hs2.add(4);
        hs2.add(95);

        for(Integer item : hs2) {
            System.out.println(item);
        }
        for(String item : hs) {
            System.out.println(item);
        }
        for(Object item : hs) {
            System.out.println(item);
        }
    }
}
