package day09.abstractQuiz;

public class Bus extends Trans{
    String name = "버스";

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println(name + "출발합니다!");
    }

    @Override
    public void stop() {
        System.out.println(name + "도착합니다!");
    }
}
