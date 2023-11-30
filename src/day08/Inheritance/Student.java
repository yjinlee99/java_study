package day08.Inheritance;

public class Student extends Person{
    private int score;

    public Student() {
    }

    public Student(String name, String gender, String age, int score) {
        super(name, gender, age);
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
