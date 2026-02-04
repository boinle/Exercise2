
package Lec11_Encapsulation.FinalKeyword.Example2;

public class Honda extends Bike{
    void run(){
        System.out.println("running sàely with 100kmph"); //error
    }
    public static void main(String[] args) {
        Honda honda = new Honda();
        honda.run();
    }
}
