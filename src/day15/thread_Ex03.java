package day15;

public class thread_Ex03 {
    public static void main(String[] args) {
        long id = Thread.currentThread().getId();

        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);



        System.out.println("현재 스레드 ID : " + id);
        System.out.println("현재 스레드 Priority : " + id);
    }
}
