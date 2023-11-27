package day06;

import java.util.Arrays;

public class sortTest {
    public static void main(String[] args) {
        int[] a = {7,4,3,9,2};
        System.out.println("sort 전");
        for (int i=0; i<a.length; i++){
            System.out.print(a[i] +"\t");
        }
        System.out.println();
        Arrays.sort(a);
        for (int i=0; i<a.length; i++){
            System.out.print(a[i] +"\t");
        }
    }
}
