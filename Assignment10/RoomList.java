package Assignment10;

import java.util.*;

public class RoomList {

    ArrayList<Room> list = new ArrayList<>();

    public void addRoom(Room room) {
        list.add(room);
    }

    public void updateRoom(String ID) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getID().equals(ID)) {
                list.get(i).updateRoom();
                return;
            }
        }
        System.out.println("Not found ID: " + ID);
    }

    public void deleteRoom(String ID) {
        if (list.isEmpty()) { //neu danh sach trong
            System.out.println("0 room");
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getID().equals(ID)) {
                list.remove(i);
                return;
            }
        }
        System.out.println("Not found ID: " + ID);
    }

    public void findRoomByID(String ID) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getID().equals(ID)) {
                list.get(i).displayDetails();
                return;
            }
        }
        System.out.println("Not found ID: " + ID);
    }

    public void displayAllRooms() {
        for (Room room : list) {
            room.displayDetails();
        }
    }

    public void countRooms() {
        int numberOfMeetingRoom = 0;
        int numberOfBedRoom = 0;
        for (Room room : list) {
            if (room instanceof MeetingRoom) { //kiem tra xem co dung phong hop ko
                numberOfMeetingRoom++;
            } else if (room instanceof BedRoom) { // kiemtra xem co dung phong ngu k0
                numberOfBedRoom++;
            }
        }
        System.out.println("MeetingRoom: " + numberOfMeetingRoom + "\nBedRoom: " + numberOfBedRoom);
    }
}
