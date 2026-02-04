package Lec11_Encapsulation.Example2;

public class Person1 {

    public String name;
    private double weight;

    public void setWeight(double weight) {
        if (weight < 0) { //không dùng this.weight vì là giá trị cũ
            System.out.println("Weight can not negative");
        } else {
            this.weight = weight;
        }

    }

    public double getWeight() {
        return weight;
    }
}
