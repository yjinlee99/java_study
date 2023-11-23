package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class a1123_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        for(int i=0; i<3; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for(int i=2; i>=0; i--) {
            System.out.println(a[i]);
        }
    }
}
