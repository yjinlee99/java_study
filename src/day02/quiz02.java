package day02;

public class quiz02 {


    public static void main(String[] args) {
        int su = 12345;
        int sec = 12345 % 60;

        su = su / 60;

        int min = su % 60;
        su = su / 60;
        System.out.println(su + " " + min + " " + sec);
    }
}
