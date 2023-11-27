package day06;

import java.util.Scanner;

public class method_quiz {
    //문제1] info() { 이름, 연락, 주소 출력 함수 }
    public static void info() {
        System.out.println("이름 : 이영진, 연락처 : 01042991435, 주소 : 은평구 역촌동");
    }
    //문제2] abs(int x) {절대값 구하는 함수}
    public static int abs(int x) {
        if(x < 0 ) return x*(-1);
        else return x;
    }

    //문제3] max() {정수 2개 입력받아서 큰수 출력 함수}
    public static void max() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a > b) System.out.println(a);
        else System.out.println(b);
    }
    public static void main(String[] args) {

    }
}
