package Lec11_Encapsulation.FinalKeyword.Example3;

public class Honda extends Bike {

    voud run() {
        System.out.println("running safely with 100kmph");
    }

    public static void main(String[] args) {
        Honda honda = new Honda();
        honda.run();
    }
}
