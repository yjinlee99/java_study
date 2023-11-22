package assignment;

import java.util.Scanner;

public class a1122_1 {
    public static void main(String[] args) {
        //사칙연산 프로그램 작성 (예외처리하기)

        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력하세요");
        int n = sc.nextInt();
        System.out.println("두번째 숫자를 입력하세요");
        int m = sc.nextInt();
        System.out.println("연산자를 입력하세요");
        String op = sc.next();

        int result = 0;
        try {
            if (op.equals("+")) result = n + m;
            else if (op.equals("-")) result = n - m;
            else if (op.equals("*")) result = n * m;
            else if (op.equals("/")) result = n / m;
        }catch(Exception e) {
            System.out.println("0으로 나눌 수 없습니다");
        }

        System.out.println(n + " " + op + " " + m + " = " + result);
    }
}
