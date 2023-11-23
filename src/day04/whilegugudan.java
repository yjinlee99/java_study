package day04;

import java.util.Scanner;

public class whilegugudan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("원하는 단 입력");
        int n = sc.nextInt();
        int i = 0;
        //while
        while(i++ < 10) {
            System.out.println(n + " * " + i + " = "  + n * i);
        }

        System.out.println();
        //do ~ while
        i = 1;
        do {
            System.out.println(n + " * " + i + " = "  + n * i);
        }while(i++ < 10);
    }
}
