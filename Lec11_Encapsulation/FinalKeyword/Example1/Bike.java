package Lec11_Encapsulation.FinalKeyword.Example1;

public class Bike {

    final int speedLimit = 90; //giá trị cuối

    void run() {
        speedLimit = 400; //error
    }

    public static void main(String[] args) {
        Bike obj = new Bike();
        obj.run();
    }
}
