package Assignment11;

import java.util.Scanner;

public class Car extends Vehicle {

    Scanner sc = new Scanner(System.in);
    private int numberOfSeats;
    private String fuelType;

    public Car() {
    }

    public Car(String id, String brand, String model, int rentalDays, double rentalPricePerDay) {
        super(id, brand, model, rentalDays, rentalPricePerDay);
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public void addVehicle() {
        super.addVehicle();
        System.out.println("NumberOfSeats: ");
        setNumberOfSeats(sc.nextInt());
        System.out.println("FuelType: ");
        setFuelType(sc.nextLine());
    }

    @Override
    public void updateVehicle() {
        super.updateVehicle();
        System.out.println("NumberOfSeats: ");
        setNumberOfSeats(sc.nextInt());
        System.out.println("FuelType: ");
        setFuelType(sc.nextLine());
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("NumberOfSeats: " + getNumberOfSeats() + ", fueltype: " + getFuelType());

    }

}
