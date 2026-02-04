package Lec11_Encapsulation.JavaAccessModifier.test1.rule5;

public class AccessModifier1 {

    private int pvt = 1;
    int df = 2;
    protected int pro = 3;
    public int pbl = 4;

    public void display() {
        System.out.println(pvt);
        System.out.println(df);
        System.out.println(pro);
        System.out.println(pbl);
    }
}