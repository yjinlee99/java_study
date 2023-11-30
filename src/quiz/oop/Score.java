package quiz.oop;

public class Score {
    private String name;
    private int kor;
    private int eng;
    private int com;
    private int total;
    private double avg;
    private String score;

    public Score() {
        name = " ";
        kor = 0;
        eng = 0;
        com = 0;
    }

    public Score(String name, int kor, int eng, int com) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.com = com;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getCom() {
        return com;
    }

    public void setCom(int com) {
        this.com = com;
    }

    //성적표 만들기
    public void make_report() {
        total = kor + eng + com;
        avg = total / 3.0;

        if(avg >= 90) score = "A";
        else if(avg >= 80) score = "B";
        else if(avg >= 70) score = "C";
        else if(avg >= 60) score = "D";
        else score = "F";
    }

    public void write_report() {
        System.out.println(name + "님의 성적표 *****");
        System.out.println("국어 : " + kor + ", 영어 : " + eng + ", 전산 : "+com);
        System.out.println("총점 : " + total +", 평균 : "+String.format("%.2f", avg) + ", 학점 : "+score);
    }
}
