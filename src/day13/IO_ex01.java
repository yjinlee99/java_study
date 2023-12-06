package day13;

import java.io.InputStream;

public class IO_ex01 {
    public static void main(String[] args) {
        InputStream is = System.in;

        try {
            System.out.println("단일 문자 입력 : ");
            int num = is.read() - 48;
            is.skip(2);
            // 문제 발생 처리 - 자바에서는 '문자' 2바이트 처리됨. 화이트 스페이스 처리를 위해 2번 씀.
            int num2 = is.read() - 48;

            System.out.println(num + num2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
