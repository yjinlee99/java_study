package day09.abstractQuiz;

public class Subway extends Trans{
    String name = "지하철";

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println(name + "출발합니다");
    }

    @Override
    public void stop() {
        System.out.println(name + "도착합니다");
    }
}
