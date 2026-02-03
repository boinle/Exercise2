package Lec9_InheritanceAndPolymorphism.RuntimePolymorphism;

public class Cat extends Animal {

    @Override
    void makeSound() {
        System.out.println("Meows meows");
    }

}
