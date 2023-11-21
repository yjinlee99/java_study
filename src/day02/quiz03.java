package day02;

import java.util.Scanner;

public class quiz03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        int e = sc.nextInt();
        int c = sc.nextInt();
        double d = (k+e+c) / 3.0;

        System.out.println(s + "님의 성적표****");
        System.out.println("국어 : " + k + ", 영어 : " + e + ",  전산 : " + c);
        System.out.println("총점 : " + (k+e+c) + " 평균 : " + String.format("%.2f", d));
    }
}
