package LeNhatThaoNguyen_2587;

import java.util.ArrayList;

public class BookList { //quản lý danh sách

    ArrayList<Book> bookList = new ArrayList<>();

    public void addBook(Book book) { //Nhận vào 1 đối tượng sách
        book.addBook(); //gọi hàm addBook đúng theo loại sách
        bookList.add(book); //sau khi nhập xong thông tin thì thêm vào danh sách
        System.out.println("Added");
    }

    public void updateBook(String id) {
        for (Book book : bookList) { //duyệt từng sách 
            if (book.getBookID().equals(id)) { //so sánh id
                book.updateBook(id);
                return; //found -> update -> thoát hàm
            }
        }
        System.out.println("Not found ID: " + id); //trường hợp k trùng
    }

    public void deleteBookByID(String id) {
        // boolean removed = bookList.removeIf(book -> book.getBookId().equals(id));
        boolean removed = bookList.removeIf(book -> book.getBookID().equals(id));
        for (Book object : bookList) {
            if (id.equals(object.getBookID())) {
                bookList.remove(object);
                System.out.println("Deleted ID: " + id);
            } else {
                System.out.println("Not found ID: " + id);
            }
        }
    }

    public Book findBookByID(String id) { //tìm sách
        for (Book book : bookList) {
            if (book.getBookID().equals(id)) {
                return book; //trả về book
            }
        }
        System.out.println("Not found ID: " + id);
        return null; //null nếu không tìm thấy
    }

    public void displayAllBooks() {
        if (bookList.isEmpty()) {
            System.out.println("Empty");
        } else {
            for (Book book : bookList) {
                book.displayBook();

            }

        }

    }
}
