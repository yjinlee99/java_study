package day03;

import java.util.Scanner;

public class ifScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름 : ");
        String name = sc.nextLine();
        System.out.println("국어 : ");
        int kor = sc.nextInt();
        System.out.println("영어 : ");
        int eng = sc.nextInt();
        System.out.println("전산 : ");
        int com = sc.nextInt();

        int total = kor + eng + com;
        double avg = total / 3.0f; //3f

        System.out.print(name + "님의 학점은 ");

        if ((int) avg == 100) {
            System.out.print("A 입니다");
        } else if ((int) avg >= 90) {
            System.out.print("B 입니다");
        } else if ((int) avg >= 80) {
            System.out.print("C 입니다");
        } else if ((int) avg >= 70) {
            System.out.print("D 입니다");
        } else if ((int) avg >= 60) {
            System.out.print("E 입니다");
        } else {
            System.out.print("F 입니다");
        }
    }
}
