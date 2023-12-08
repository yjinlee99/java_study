package day15;

public class UserThread extends Thread{

    String name;

    public UserThread(String name) {
        this.name = name;
    }

    @Override
    public void run() { // 스레드 실행부(구현부)
        System.out.println(name);
        for(int i=0; i<10; i++) {
            if(i==3) {
                try {
                    sleep(3000); //1초
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(name);
            }
            System.out.println(i);
        }
    }


}
