package assignment;

public class a1123_1 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i<=5; i++) {
            if(i != 1) System.out.print("(");
            for(int j=1; j<=i; j++) {
                if(i == 5 && j == 5) System.out.print(j + ") = ");
                else if( j == i && i != 1) System.out.print(j + ") + ");
                else System.out.print(j + " + ");
                sum = sum + j;
            }
        }
        System.out.print(sum);
    }
}
