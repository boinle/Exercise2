package Lec11_Encapsulation.JavaAccessModifier.test2;

import Lec11_Encapsulation.JavaAccessModifier.test1.rule5.AccessModifier1;

public class AccessModifier3_rule5 {

    public void display() {
        AccessModifier1 object = new AccessModifier1();
        System.out.println(object.pbl);
    }

    public static void main(String[] args) {
        AccessModifier1 object = new AccessModifier1();
        object.display();
    }
}
