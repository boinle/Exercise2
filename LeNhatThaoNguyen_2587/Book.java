package LeNhatThaoNguyen_2587;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Book implements IBook { //Book là abstract vì nó chỉ đóng vai trò lớp cha, dùng để kế thừa, không tạo đối tượng trực tiếp

    private String bookID; //mã sách
    private String publisher;//nxb
    private Date entryDate; //Ngày nhập
    private Double unitPrice; //Đơn giá
    private Double quantity;//Số lượng

    public Book() { //constructor mặc định
    }

    public Book(String bookID, String publisher, Date entryDate, Double unitPrice, Double quantity) {
        //chứa tham số và gán sẵn dữ liệu ban đầu vào
        this.bookID = bookID;
        this.publisher = publisher;
        this.entryDate = entryDate;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String getBookID() { //get lấy dữ liệu
        return bookID;
    }

    public void setBookID(String bookID) { //set gán dữ liệu
        this.bookID = bookID;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }
    // Getter Setter giúp bảo vệ dữ liệu và kiểm soát việc truy cập thuộc tính

    public void addBook() {
        try { //try-catch để tránh lỗi khi người dùng nhập sai định dạng ngày
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter book id: ");
            setBookID(scanner.nextLine());
            System.out.print("Enter publisher: ");
            setPublisher(scanner.nextLine());
            System.out.print("Enter price: ");
            setUnitPrice(scanner.nextDouble());
            System.out.print("Enter quantity: ");
            setQuantity(scanner.nextDouble());
            scanner.nextLine();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            System.out.print("Enter entryDate: ");
            String entryDateString = scanner.nextLine();
            setEntryDate(sdf.parse(entryDateString));
        } catch (ParseException e) {
            System.out.println(e);
        }
    }

    public void updateBook(String id) {
        if (this.bookID.equals(id)) { //chỉ cập nhật đúng sách có id đúng
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter publisher: ");
                setPublisher(scanner.nextLine());
                System.out.print("Enter price: ");
                setUnitPrice(scanner.nextDouble());
                System.out.print("Enter quantity: ");
                setQuantity(scanner.nextDouble());
                scanner.nextLine();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                System.out.print("Enter entryDate: ");
                String entryDateString = scanner.nextLine();
                setEntryDate(sdf.parse(entryDateString));
            } catch (ParseException e) {
                System.out.println(e);
            }
        }
    }

    public void displayBook() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //format ngày
        System.out.println("ID: " + getBookID() + ", publisher: " + getPublisher() + ",entryDate: " + sdf.format(entryDate) + ", unitPrice: " + getUnitPrice() + ", quantity: " + getQuantity());
    }

}
