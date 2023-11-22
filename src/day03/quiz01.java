package day03;

import java.util.Scanner;

public class quiz01 {
    public static void main(String[] args) {

        System.out.println("숫자를 입력하시오 : ");
        int su = new Scanner(System.in).nextInt();
        int na = su % 2 ;

        switch(na) {
            case 1 :
                System.out.println("홀수");
                break;
            case 0 :
                System.out.println("짝수");
                break;
            default :
                System.out.println("무슨 수를 입력한거니?");
        }
    }
}
