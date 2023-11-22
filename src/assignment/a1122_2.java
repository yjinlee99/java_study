package assignment;

public class a1122_2 {
    public static void main(String[] args) {
        // 별찍기 1번
        for(int i = 0; i < 5; i++) {
            for(int j=0; j<i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // 별찍기 2번
        for(int i=0; i<5; i++) {
            for(int j=0; j<(5-i);j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        //별찍기 3번
        for(int i=4; i>=0; i--) {
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<(5-i);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
