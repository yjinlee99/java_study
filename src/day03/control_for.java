package day03;

public class control_for {
    public static void main(String[] args) {
        for(int i=0; i<5; i++) {
            System.out.println("hi");
        }

        for(int i=1; i<101; i++) {
            System.out.print(i + "\t");
            if(i%10 == 0) System.out.print("\n");
        }

        for(int i=0; i<5; i++) {
            System.out.print("*");
        }
    }
}
