package Assignment10;

import java.util.Scanner;

public class BedRoom extends Room {

    Scanner sc = new Scanner(System.in);
    private int numberOfBeds;

    public BedRoom() {
    }

    public BedRoom(String ID, String name, double baseCost) {
        super(ID, name, baseCost);
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    @Override
    public void addRoom() {
        super.addRoom();
        System.out.println("numberOfBeds: ");
        setNumberOfBeds(sc.nextInt());
    }

    @Override
    public void updateRoom() {
        super.updateRoom();
        System.out.println("numberOfBeds: ");
        setNumberOfBeds(sc.nextInt());
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(", numberOfBeds: " + getNumberOfBeds());
    }

}
