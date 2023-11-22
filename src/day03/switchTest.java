package day03;

import java.util.Scanner;

public class switchTest {
    public static void main(String[] args) {
        System.out.println("input jumsu(k,e,c) = ");
        Scanner sc = new Scanner(System.in);
        int total = (sc.nextInt() + sc.nextInt() + sc.nextInt());
        double avg = (double)total / 3;
        char grade;

        switch ((int)avg / 10) {
            case 10: grade = 'A';
                break;
            case 9: grade = 'A';
            case 8: grade = 'B';
            case 7: grade = 'C';
            case 6: grade = 'D';
            default: grade = 'F';
                break;
        }
    }
}
