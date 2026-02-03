package Lec10_AbtractClassAndInterface.AbstractClass.All;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Barks barks");
    }

}
