package day09.interfaceQuiz;

public class Bus implements Trans{
    @Override
    public void start() {
        System.out.println("버스가 출발 합니다");
    }

    @Override
    public void stop() {
        System.out.println("버스가 도착 합니다");
    }
}
