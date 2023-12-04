package day11;

import java.util.HashSet;
import java.util.Set;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Person) {
            Person temp = (Person)obj;
            return name.equals(temp.name) && age == temp.age;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Person = [name = " + name + ", age = " + age + "]";
    }
}
public class collection_set_ex03 {

    public static void main(String[] args) {
        Set set = new HashSet();
        Person ps = new Person("aaa",10);

        set.add(new String("happy"));
        set.add(new String("happy"));
        set.add(ps);
        set.add(new Person("David",10));
        set.add(new Person("David", 20));
        set.add(new Person("David", 30));
        set.add(new Person("David",10));

        for(Object item : set) {
            System.out.println(item.toString());
        }
    }
}
