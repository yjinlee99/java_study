package day01;

public class data_type {

    public static void main(String[] args) {
        short sh; // -32768 ~ 32767
        int su = 32769;

        sh = (short)su; // 범위를 2개 벗어나면 다시 32767 -> -32768 -> -32767 로 돌아감

        System.out.println(sh);

        float a = 1.12342F;
        System.out.printf("%10.1f %3.2f", 333.22222, a); //%(전체 자리 수).(소숫점 아래 자리 수)
    }
}

