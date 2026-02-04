package Lec11_Encapsulation.JavaAccessModifier.test1.rule3;

public class AccessModifier2 {

    public void display() {
        AccessModifier1 object = new AccessModifier1();
        System.out.println(object.pvt);
        System.out.println(object.df);
        System.out.println(object.pro);
        System.out.println(object.pbl);
    }
}
