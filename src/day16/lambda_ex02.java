package day16;

interface Message {
    int something(int x);
}

class Person {
    public void greeting(Message msg) {
        int su = msg.something(80);
        System.out.println("number is : "+su);
    }
}
public class lambda_ex02 {
    public static void main(String[] args) {
        Person p = new Person();

        p.greeting(new Message() {
            public int something(int x) {
                System.out.println(("parametere value :" + x));
                return x;
            }
        });

        System.out.println("------------------------------");
        p.greeting( x-> {
            System.out.println("parameter vlaue : " + x);
            return x;
        });
    }
}
