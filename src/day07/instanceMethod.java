package day07;

//instance method는 객체를 반드시 생성하고 사용해야함
class B {
    int x,y;
    //instance method
    public void setDta(int xx, int yy) {
        System.out.println(xx + ", " + " yy");
    }
}

public class instanceMethod {
    public static void main(String[] args) {
        B b = new B();
    b.setDta(100,200);}
}
