package Assignment10;

import java.util.*;

public class MeetingRoom extends Room {

    private int capacity;

    public MeetingRoom() {
    }

    public MeetingRoom(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    Scanner sc = new Scanner(System.in);

    @Override
    public void addRoom() {
        super.addRoom();
        System.out.println("capacity: ");
        setCapacity(sc.nextInt());
    }

    @Override
    public void updateRoom() {
        super.updateRoom();
        System.out.println("capacity: ");
        setCapacity(sc.nextInt());
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(", capacity: " + getCapacity());
    }

}
