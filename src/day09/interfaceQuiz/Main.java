package day09.interfaceQuiz;

public class Main {
    public static void main(String[] args) {
        Bus b = new Bus();
        b.start();
        b.stop();

        Subway s = new Subway();
        s.start();
        s.stop();
    }
}
