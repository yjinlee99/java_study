package quiz.oop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Score s1 = new Score();

        System.out.println("이름을 입력하세요");
        s1.setName(sc.next());
        System.out.println("국어점수를 입력하세요");
        s1.setKor(sc.nextInt());
        System.out.println("영어점수를 입력하세요");
        s1.setEng(sc.nextInt());
        System.out.println("전산점수를 입력하세요");
        s1.setCom(sc.nextInt());

        s1.make_report();
        s1.write_report();
    }
}
