package day15;

public class thread_Ex02 {
    public static void main(String[] args) {
//        Runnable t1 = new UserRunnable("u1");
//        Thread tt1 = new Thread(t1);
//        tt1.start();

        new Thread(new UserRunnable("u1")).start();
        new Thread(new UserRunnable("u2")).start();
        new Thread(new UserRunnable("u3")).start();
        new Thread(new UserRunnable("u4")).start();
    }
}
