package day15;

class OuterClass {
    static int no;
    String message = "hello~~~";

    public void outerMethod() {
        System.out.println("outer method call~");
    }

    class InnerClass {
        int su = 99;

        public void show() {
            System.out.println(su);
            System.out.println(message);
        }

        public void disp() {
            outerMethod();
        }
    }
}
public class InnerClass_Ex01 {
    public static void main(String[] args) {
        //첫번째 방법
        OuterClass oc = new OuterClass();
        OuterClass.InnerClass inner = oc.new InnerClass();
        inner.disp();
        inner.show();
        System.out.println("---------------------------");

        //두번째 방법
        OuterClass.InnerClass ic = new OuterClass().new InnerClass();
        ic.show();
    }
}
