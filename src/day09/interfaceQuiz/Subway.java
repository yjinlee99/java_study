package day09.interfaceQuiz;

public class Subway implements Trans {
    @Override
    public void start() {
        System.out.println("지하철 출발 합니다");
    }

    @Override
    public void stop() {
        System.out.println("지하철 도착 합니다");
    }
}
