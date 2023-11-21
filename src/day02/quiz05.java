package day02;

import java.util.Scanner;

public class quiz05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("년도를 입력하시오");
        int a = sc.nextInt();

        if(a % 4 == 0) {
            if (a % 100 !=0 || a % 400 == 0) {
                System.out.println("윤년");
            }
            else System.out.println("평년");
        }
        else System.out.println("평년");
    }
}
