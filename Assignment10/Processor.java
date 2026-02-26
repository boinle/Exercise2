package Assignment10;

import java.util.*;

public class Processor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RoomList list = new RoomList();
        int next = 1;

        do {
            System.out.println("0. Exit program. "
                    + "\n1. Add a room "
                    + "\n2. Update Room by ID"
                    + "\n3. Find Room by ID"
                    + "\n4. Delete Room by ID"
                    + "\n5. Display All Rooms"
                    + "\n6. Count each room individually");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 0:
                    System.out.println("Exit program");
                    break;

                case 1:
                    System.out.print("Enter a MeetingRoom(1)/ BedRoom(2): ");
                    switch (sc.nextInt()) {
                        case 1:
                            MeetingRoom m = new MeetingRoom();
                            m.addRoom();
                            list.addRoom(m);
                            break;
                        case 2:
                            BedRoom b = new BedRoom();
                            b.addRoom();
                            list.addRoom(b);
                            break;
                    }
                    System.out.println("Sucess");
                    break;

                case 2:
                    sc.nextLine();
                    System.out.print("Enter ID to update: ");
                    list.updateRoom(sc.nextLine());
                    break;

                case 3:
                    sc.nextLine();
                    System.out.print("Enter ID to find: ");
                    list.findRoomByID(sc.nextLine());
                    break;

                case 4:
                    sc.nextLine();
                    System.out.print("Enter ID to delete: ");
                    list.deleteRoom(sc.nextLine());
                    System.out.println("Success");
                    break;

                case 5:
                    System.out.println("All rooms: ");
                    list.displayAllRooms();
                    break;

                case 6:
                    list.countRooms();
                    break;
                default:
            }
            if (choice == 0) {
                break;
            }
            System.out.println("Continue ? 1 yes / 0 no: ");
            next = sc.nextInt();
        } while (next != 0);
    }

}
