package LeNhatThaoNguyen_2587;

import java.util.Date;
import java.util.Scanner;

public class ReferenceBook extends Book {

    private double tax; //thuế

    public ReferenceBook(String bookID, String publisher, Date entryDate, double unitPrice, double quantity, double tax) {
        super(bookID, publisher, entryDate, unitPrice, quantity);
        this.tax = tax;

    }

    public ReferenceBook() {
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    @Override
    public void addBook() {
        Scanner scanner = new Scanner(System.in);
        super.addBook(); //To change body of generated methods, choose Tools | Templates.
        System.out.print("Enter Tax: ");
        setTax(scanner.nextDouble());
        System.out.println("ReferenceBook added successfully.");
    }

    public void updateBook(String id) {
        if (getBookID().equals(id)) {
            Scanner scanner = new Scanner(System.in);
            super.updateBook(id);
            System.out.print("Enter new Tax: ");
            setTax(scanner.nextDouble());
            System.out.println("ReferenceBook updated successfully.");
        } else {
            System.out.println("Not found ID " + id);
        }
    }

    public void displayBook() {
        super.displayBook();
        System.out.println("Tax: " + getTax());
    }
}
