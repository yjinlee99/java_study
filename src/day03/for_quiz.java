package day03;

import java.util.Scanner;

public class for_quiz {
    public static void main(String[] args) {
        // 1. 원하는 숫자 입력받아서 구구단 출력
        /*Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        int n = sc.nextInt();

        for(int i=1; i<11; i++) {
            System.out.println(n*i);
        }
        */
        // 2. 1~100 중에 3의 배수의 합과 개수 구하는 프로그램 작성
//        int total = 0;
//        int num = 0;
//        for(int i=1; i<=100; i++) {
//            if(i%3 == 0) {
//                total += i;
//                num++;
//            }
//        }
//        System.out.println("합 : " + total + ", 개수 : " + num);

        // 1~100 합

        int sum = 0;
        for(int i=1; i<=100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
