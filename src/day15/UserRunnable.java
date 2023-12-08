package day15;

public class UserRunnable implements Runnable{

    String name;

    public UserRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("runnable " + name + " start");

        for(int i=1; i<11; i++) {
            if(i==1){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(name);
            }
            System.out.println(i);
        }
    }
}
