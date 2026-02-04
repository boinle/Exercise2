package Lec11_Encapsulation.JavaAccessModifier.test2;

import Lec11_Encapsulation.JavaAccessModifier.test1.rule4.AccessModifier1;

public class AccessModifier2_rule4 extends AccessModifier1 {

    @Override
    public void display() {
        AccessModifier1 object = new AccessModifier1();
        System.out.println(object.pvt);
        System.out.println(pro);
        System.out.println(object.pbl);
    }

    public static void main(String[] args) {
        AccessModifier1 object = new AccessModifier1();
        object.display();
    }
}
