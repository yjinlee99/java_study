package day04;

public class dowhile_gugudan {

    public static void main(String[] args) {
        int a = 1, b=1;

        do {
            b = 1;
            do{
                System.out.println(a + " * " + b + " = "  + a * b);
                b++;
            }while (b<10);
            a++;
        }while (a<10);
    }
}
