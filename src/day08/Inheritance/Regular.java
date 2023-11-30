package day08.Inheritance;

public class Regular extends Employee{
    protected  int sal;

    public Regular() {
    }

    public Regular(int id, String name, String dept, String tel, int sal) {
        super(id, name, dept, tel);
        this.sal = sal;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public void display() {
        super.display();
        System.out.println("급여 : "+sal);
    }
}
