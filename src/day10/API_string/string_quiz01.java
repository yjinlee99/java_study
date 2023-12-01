package day10.API_string;

public class string_quiz01 {
    public static void main(String[] args) {
        String str = "abcEDFSLwokefAFOEKW";

        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if(c >='a' && c <='z') c = (char) (c + ('A' - 'a'));
            else c = (char)(c - ('A' - 'a'));
            System.out.print(c);
        }
    }
}
