package day08.Inheritance;

import quiz.oop.Score;

public class Employee {
    protected int id;
    protected String name;
    protected String dept;
    protected String tel;

    public Employee() {
        id = 0;
        name = " ";
    }

    public Employee(int id, String name, String dept, String tel) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.tel = tel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void display() {
        System.out.println("사번 : "+id+", 이름 : "+name+", 부서 : "+dept +", 연락처 :"  +tel);
    }
}
