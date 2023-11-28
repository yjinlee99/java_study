package day07;

class A{
    int x,y;
    //static method;
    public static void setData(int xx, int yy) {
        System.out.println(xx + ", " + yy);
    }
}
public class staticMethod {
    public static void main(String[] args) {
        A.setData(3,5);

        A obj = new A();
        obj.x = 9;
        System.out.println(obj.x);
    }
}
