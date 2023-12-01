package day09;

class Atm {
    int count;
    static int total;

    public Atm(int amount) {
        count += amount;
        total += amount;
    }

    public void display() {
        System.out.println("count = " + count);
        System.out.println("total = " + total);
    }
}

public class ex03 {
    public static void main(String[] args) {
        Atm a = new Atm(1000);
        a.display();
        Atm a2 = new Atm(2000);
        a.display();
    }
}
