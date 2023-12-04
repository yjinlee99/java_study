package day11.collection_list_quiz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Customers> list = new ArrayList<>();
        int n = 0;
        System.out.println("프로그램을 시작합니다.");
        while(n != 5) {
            System.out.println("1) 고객 추가 2) 고객 삭제 3) 고객 리스트 출력 4) 고객 수정 5) 프로그램 종료");
            switch (sc.nextInt()) {
                case 1 :
                    list.add(new Customers().add());
                    break;

                case 2 :
                    System.out.println("삭제 할 고객의 이름을 입력 하세요");
                    String delname = sc.next();
                    Iterator<Customers> it = list.iterator();
                    while (it.hasNext()) {
                        Customers c = (Customers) it.next();
                        if (c.name.equals(delname)) {it.remove();}
                    }
                    break;

                case 3:
                    for(Customers item : list) {
                        item.print();
                    }
                    break;

                case 4:
                    System.out.println("수정 할 고객의 이름을 입력 하세요");
                    String modname = sc.next();
                    Iterator i = list.iterator();
                    int j = 0;
                    while (i.hasNext()) {
                        Customers m = (Customers) i.next();
                        if(m.name.equals(modname)) break;
                        j++;
                    }
                    list.set(j, new Customers().add());
                    break;

                case 5: n = 5; break;
                default :
                    System.out.println("1~5까지의 숫자만 입력하세요");
                    break;
            }
        }
    }
}
