package quiz;

import java.util.Scanner;

// 3과목 입력받고, 총점, 평균,  (IF, SWITCH) 구하기
public class score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 객체 생성, 메모리에 할당, 생성자 함수 자동 호출
        System.out.println("이름을 입력하세요");
        String name = sc.next();
        System.out.println("수학 성적 입력");
        int m = sc.nextInt();
        System.out.println ("영어 성적 입력");
        int e = sc.nextInt();
        System.out.println("국어 성적 입력");
        int k = sc.nextInt();

        int total = m+e+k;
        double avg = (double)total/3;
        char grade;

        if(avg >= 90 && avg <= 100) grade = 'A';
        else if (avg >= 80 && avg < 90) grade = 'B';
        else if (avg >= 70 && avg < 80) grade = 'C';
        else if (avg >= 60 && avg < 70) grade = 'D';
        else grade = 'F';

        System.out.println(name + "님의 성적표 *****");
        System.out.println("수학 : " + m + ", 영어 : " + e + ", 국어 : "+k);
        System.out.println("총점 : " + total + ", 평균 : " + String.format("%.2f", avg) + ", 학점 : " + grade);
    }
}
