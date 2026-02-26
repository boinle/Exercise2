package Assignment10;

import java.util.*;

public abstract class Room implements IRoom {

    private String ID;
    private String name;
    private double baseCost;

    public Room() {
    }

    public Room(String ID, String name, double baseCost) {
        this.ID = ID;
        this.name = name;
        this.baseCost = baseCost;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }
    Scanner sc = new Scanner(System.in);

    @Override
    public void addRoom() {
        System.out.println("id: ");
        setID(sc.nextLine());
        System.out.println("name: ");
        setName(sc.nextLine());
        System.out.println("baseCost: ");
        setBaseCost(sc.nextDouble());

    }

    @Override
    public void updateRoom() {
        sc.nextLine();
        System.out.println("name: ");
        setName(sc.nextLine());
        System.out.println("baseCost: ");
        setBaseCost(sc.nextDouble());
    }

    @Override
    public void displayDetails() {
        System.out.println("id: " + getID() + ",name: " + getName() + ", baseCost: " + getBaseCost());
    }

}
