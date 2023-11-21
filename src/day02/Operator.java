package day02;

public class Operator {
    // 최단산쉬관논삼대콤
    public static void main(String[] args) {
        //단항연산자 : 증감 ==> ++,--,~
        int x = 10, y;
        y = x++; // 후위연산 : 대입먼저, 연산나중
        System.out.println("x= " + x + ", y= "+ y );

        y= ++x; // 전위연산 : 연산먼저, 대입나중
        System.out.println("x= " + x + ", y= "+ y );

        x = -7;
        y = ~x; // 비트 부정 -(원래값 +1) ==> 결과
        System.out.println("x= " + x + ", y= "+ y );

        x = 8;
        int result =x >>3;
        System.out.println(result);

        x = 1;
        result = x << 2;
        System.out.println(result);

        //논리연산자 : && (and), || (or), ! (not) 10진 논리 ==> 결과 : 참, 거짓

        x = 10;
        y = 10;
        int z = 30;
        boolean b;

        b = (x<y) && (y>z);
        System.out.println("&& : " + b);

        //삼항(조건) 연산자 : (조건) ? 참 : 거짓 ;
        //대입(배정) 연산자 : =, +=, -=, ....

    }
}
