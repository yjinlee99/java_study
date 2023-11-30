package day08.Inheritance;

public class Sales extends Regular{
    private int comm;

    public Sales() {

    }

    public Sales(int id, String name, String dept, String tel, int sal, int comm) {
        super(id, name, dept, tel, sal);
        this.comm = comm;
    }

    public int getComm() {
        return comm;
    }

    public void setComm(int comm) {
        this.comm = comm;
    }

    public void display() {
        super.display();
        System.out.println("커미션 : " + comm);
    }
}
