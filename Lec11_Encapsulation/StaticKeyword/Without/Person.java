package Lec11_Encapsulation.StaticKeyword.Without;

public class Person {

    private String name;
    private int count = 0;

    public Person(String n) {
        name = n;
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Nguyen");
        Person p2 = new Person("Bon");
        Person p3 = new Person("Co");
    }
}
