package day13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IOquiz01 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String t = st.nextToken();

        switch (t) {
            case "+" :
                System.out.println(n+m);
                break;
            case "-" :
                System.out.println(n-m);
                break;
            case "*" :
                System.out.println(n*m);
                break;
            case "/" :
                System.out.println(n/m);
                break;
        }
    }
}
