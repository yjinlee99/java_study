package day03;

import java.util.Scanner;

public class exception {
    // 예외처리
    //형식
    //try {} catch {}
    public static void main(String[] args) {

        int x;
        int y;
        int result;
        try{
            x = new Scanner(System.in).nextInt();
            y = new Scanner(System.in).nextInt();

            result = x/y;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
