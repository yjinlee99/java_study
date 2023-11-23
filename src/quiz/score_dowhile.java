package quiz;

import java.util.Scanner;

public class score_dowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 객체 생성, 메모리에 할당, 생성자 함수 자동 호출
        String ans;
        while(true) {
            System.out.println("이름을 입력하세요");
            String name = sc.next();
            int k;
            do {
                System.out.println("국어 성적 입력 (0~100 사이의 값만 입력) ");
                k = sc.nextInt();
            } while (k < 0 || k > 100);
            int e;
            do {
                System.out.println("영어 성적 입력 (0~100 사이의 값만 입력) ");
                e = sc.nextInt();
            } while (e < 0 || e > 100);
            int c;
            do {
                System.out.println("전산 성적 입력 (0~100 사이의 값만 입력) ");
                c = sc.nextInt();
            } while (c < 0 || c > 100);
            int total = k + e + c;
            double avg = (double) total / 3;
            char grade;

            if (avg >= 90 && avg <= 100) grade = 'A';
            else if (avg >= 80 && avg < 90) grade = 'B';
            else if (avg >= 70 && avg < 80) grade = 'C';
            else if (avg >= 60 && avg < 70) grade = 'D';
            else grade = 'F';

            System.out.println(name + "님의 성적표 *****");
            System.out.println("수학 : " + k + ", 영어 : " + e + ", 국어 : " + c);
            System.out.println("총점 : " + total + ", 평균 : " + String.format("%.2f", avg) + ", 학점 : " + grade);

            System.out.println("다른 학생도 입력하시겠습니까? Y/N");
            ans = sc.next();
            if(ans.equalsIgnoreCase("N")) break;
        }
    }
}
