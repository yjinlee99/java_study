package day09.interfaceEX;

public class BB implements IDraw{
    @Override
    public void draw() {
        System.out.println("BB 클래스 에서 인터페이스 IDraw의 메소드를 오버라이드함");
        System.out.println(su);
    }

    public void show() {
        System.out.println(su);
//        su = 3000; 값변경 금지
    }
}
