package day09;

interface A {
    int x = 9; //interface - abstract method, final member 만 가질 수 있다.

    public void show(); //abstract
    public void disp();
    public int plus(int x, int y);
}

interface B{
    void dView();
}

interface C {
    String name = "happy"; //초기값 안들고오면 error
    public void draw();

    //name = "cat"; --> 안됨. final 멤버는 값 변경 금지 - 상수
}

interface D extends B {
    void dView();
}

class Rect implements C {

    @Override
    public void draw() {

    }
}

class Multi extends Shape implements A,B,C {

    @Override
    public double calc() {
        return 0;
    }

    @Override
    public void draw() {

    }

    @Override
    public void disp() {

    }

    @Override
    public int plus(int x, int y) {
        return 0;
    }

    @Override
    public void dView() {

    }
}
public class ex02 {
    public static void main(String[] args) {
        //A a = new A(); --> 안됨. 클래스 아님.(객체 생성 안됨)
    }
}
