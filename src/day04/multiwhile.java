package day04;

public class multiwhile {
    public static void main(String[] args) {
        int a = 1, b = 1; // 변수 초기화

        while (a <= 2) {
            while (b<=3) {
                System.out.println(b+"\t");
                b++; //증감식
            } // b end
            a++;
            System.out.println();
        } // a end
    }
}
