package day04;

public class breakmain {
    public static void main(String[] args) {
        int count = 0;
        for(int i=2; i<=100; i+=2) {
            count++;
            System.out.print(i  + "\t");
            if(count%10 == 0) System.out.println();
        }
        System.out.println(count);
    }
}
