package Assignment11;

import java.util.Scanner;

public class Truck extends Vehicle {

    Scanner sc = new Scanner(System.in);
    private double loadCapacity;
    private double distance;

    public Truck() {
    }

    public Truck(String id, String brand, String model, int rentalDays, double rentalPricePerDay) {
        super(id, brand, model, rentalDays, rentalPricePerDay);
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public void addVehicle() {
        super.addVehicle();
        System.out.println("LoadCapacity: ");
        setLoadCapacity(sc.nextDouble());
        System.out.println("Distance: ");
        setDistance(sc.nextDouble());
    }

    @Override
    public void updateVehicle() {
        super.updateVehicle();
        System.out.println("LoadCapacity: ");
        setLoadCapacity(sc.nextDouble());
        System.out.println("Distance: ");
        setDistance(sc.nextDouble());
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("LoadCapacity: " + getLoadCapacity() + ", Distance: " + getDistance());
    }

}
