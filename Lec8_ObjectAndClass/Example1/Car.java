package Lec8_ObjectAndClass.Example1;

public class Car {

    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Car model: " + model + ", Year: " + year);
    }
}
