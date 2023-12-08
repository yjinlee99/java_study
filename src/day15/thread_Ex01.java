package day15;

public class thread_Ex01 {
    public static void main(String[] args) {
        Thread t1 = new UserThread("t1");
        Thread t2 = new UserThread("t2");
        Thread t3 = new UserThread("t3");
//        t1.run(); --> 이렇게 하면 안됨.
        t1.start();
        t2.start();
        t3.start();
    }
}
