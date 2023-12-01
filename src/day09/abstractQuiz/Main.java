package day09.abstractQuiz;

public class Main {
    public static void main(String[] args) {
        Trans[] t = new Trans[2];
        t[0] = new Subway();
        t[1] = new Bus();

        for(int i=0; i<2; i++) {
            t[i].start();
            t[i].stop();
        }
    }
}
