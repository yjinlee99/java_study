package day11.collection_list_quiz;

import java.util.Scanner;

public class Customers {
    String name;
    String address;
    String tel;
    String field;

    public Customers() {

    }

    public Customers(String name, String address, String tel, String field) {
        this.name = name;
        this.address = address;
        this.tel = tel;
        this.field = field;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public Customers add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력 하세요");
        name = sc.next();
        System.out.println("주소를 입력 하세요");
        address = sc.next();
        System.out.println("전화 번호를 입력 하세요");
        tel = sc.next();
        System.out.println("필드를 입력 하세요");
        field = sc.next();

        return this;
    }

    public void print() {
        System.out.println("이름 : " + name + ", 주소 : " + address + ", 전화 번호 : " + tel + ", 필드 : " + field);
    }
}
