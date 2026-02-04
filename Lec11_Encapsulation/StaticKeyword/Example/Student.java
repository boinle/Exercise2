package Lec11_Encapsulation.StaticKeyword.Example;

public class Student {

    int rolino;
    String name;
    static String college = "DTU";

    static void change() {
        college = "BBDIT";
    }

    Student(int r, String n) {
        rolino = r;
        name = n;
    }

    void display() {
        System.out.println(rolino + " " + name + " " + college);
    }

    public static void main(String[] args) {
        Student.change();

        Student s1 = new Student(111, " Nguyen");
        Student s2 = new Student(222, "Bon");

        s1.display();
        s2.display();
    }
}
