package assignment;

public class a1123_3 {
    public static void main(String[] args) {
        double sum = 0;
        for(int i=1; i<=9; i++) {
            sum += (double)i / (i+1);
        }
        System.out.printf("%.2f", sum);
    }
}
