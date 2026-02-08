package LeNhatThaoNguyen_2587;

import java.util.Date;
import java.util.Scanner;

public class TextBook extends Book {

    private String status;

    public TextBook(String bookID, String publisher, Date entryDate, double unitPrice, double quantity, String status) {
        super(bookID, publisher, entryDate, unitPrice, quantity);
        this.status = status;
    }

    public TextBook() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void addBook() {
        Scanner scanner = new Scanner(System.in);
        super.addBook(); //To change body of generated methods, choose Tools | Templates.
        System.out.print("Enter Status: ");
        setStatus(scanner.nextLine());
        System.out.println("TextBook added successfully.");
    }

    @Override
    public void updateBook(String id) {
        if (getBookID().equals(id)) {
            Scanner scanner = new Scanner(System.in);
            super.updateBook(id);
            System.out.print("Enter new Status: ");
            setStatus(scanner.nextLine());
            System.out.println("TextBook updated successfully.");
        } else {
            System.out.println("TextBook with ID " + id + " not found.");
        }
    }

    @Override
    public void displayBook() {
        super.displayBook(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Status: " + getStatus());
    }
}
