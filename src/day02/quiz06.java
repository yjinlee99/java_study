package day02;

import java.util.Scanner;

public class quiz06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("전산 점수 입력");
        int j = sc.nextInt();
        if(j <= 40) {
            System.out.println("전산 점수 과락");
            return;
        }
        System.out.println("영어 점수 입력");
        int e = sc.nextInt();
        if(e <= 40) {
            System.out.println("영어 점수 과락");
            return;
        }
        System.out.println("국어 점수 입력");
        int k = sc.nextInt();
        if(k <= 40) {
            System.out.println("국어 점수 과락");
            return;
        }

        if ((j+e+k)/3.0 >= 60) System.out.println("통과");
        else System.out.println("평균 점수 미달로 불합격");
    }
}
