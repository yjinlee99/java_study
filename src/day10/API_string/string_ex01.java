package day10.API_string;

public class string_ex01 {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println("str : " + str);

        char[] data = {'a','b','c'};
        str = new String(data);
        System.out.println(str);
    }
}
