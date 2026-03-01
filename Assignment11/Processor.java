package Assignment11;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VehicleList list = new VehicleList();

        while (true) {
            System.out.println("0. Exit"
                    + "\n1. Add a new car"
                    + "\n2. Add a new truck"
                    + "\n3. Update vehicle by Id"
                    + "\n4. Delete vehicle by Id"
                    + "\n5. Find vehicle by Id"
                    + "\n6. Display all vehicles"
                    + "\nChoose an option");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    Car car = new Car();
                    list.addVehicle(car);
                case 2:
                    Truck truck = new Truck();
                    list.addVehicle(truck);
                case 3:
                    System.out.print("Enter Vehicle Id to update: ");
                    String updateId = sc.nextLine();
                    list.updateVehicle(updateId);
                    break;
                case 4:
                    System.out.print("Enter Vehicle Id to delete: ");
                    String deleteId = sc.nextLine();
                    list.deleteVehicleById(deleteId);
                    break;
                case 5:
                    System.out.print("Enter Vehicle Id to find: ");
                    String findId = sc.nextLine();
                    Vehicle foundVehicle = list.findVehicleById(findId);
                    if (foundVehicle != null) {
                        foundVehicle.displayDetails();
                    }
                    break;
                case 6:
                    list.displayAllVehicles();
                    break;
                case 0:
                    System.out.println("Exit");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again");
            }
        }

    }
}
