package LeNhatThaoNguyen_2587;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookList bookList = new BookList();
        while (true) { //chạy menu liên tục, chỉ dừng lại khi ng dùng chọn 0
            System.out.println("0. Exit"
                    + "\n1.Add new book"
                    + "\n2.Update book by ID"
                    + "\n3.Delete book by ID"
                    + "\n4.Find book by ID"
                    + "\n5.Display all book "
                    + "\nChoose an option");
            int choice = sc.nextInt();
            sc.nextLine(); //xoá ký tự xuống dòng
            switch (choice) { //xử lý từng chức năng
                case 1:
                    System.out.println("Choose book type: \n1. TextBook \n2. ReferenceBook");
                    int bookType = sc.nextInt();
                    sc.nextLine();

                    if (bookType == 1) { //BookList làm việc với Book, nhưng thực tế có thể là TextBook hoặc ReferenceBook
                        TextBook tb = new TextBook();
                        bookList.addBook(tb);
                    } else if (bookType == 2) {
                        ReferenceBook rb = new ReferenceBook();
                        bookList.addBook(rb);
                    } else {
                        System.out.println("Invalid option");
                    }
                    break;
                case 2:
                    System.out.println("Enter book ID to update");
                    String updateID = sc.nextLine();
                    bookList.updateBook(updateID);
                    break;
                case 3:
                    System.out.println("Enter book ID to delete: ");
                    String deleteID = sc.nextLine();
                    bookList.deleteBookByID(deleteID);
                    break;
                case 4:
                    System.out.println("Enter book ID to find: ");
                    String findID = sc.nextLine();
                    Book foundBook = bookList.findBookByID(findID);
                    if (foundBook != null) {
                        foundBook.displayBook();
                    }
                    break;
                case 5:
                    bookList.displayAllBooks();
                    break;
                case 0:
                    System.out.println("Exit");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

}
