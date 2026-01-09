package CoreProgramming.JavaConstructors.Level1;
class Book {
    String title;
    String author;
    double price;
    public Book() {
        title = "Not Assigned";
        author = "Unknown";
        price = 0.0;
    }
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void displayDetails() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : " + price);
    }
}

public class BookStore {
    public static void main(String[] args) {
        Book book1 = new Book();
        System.out.println("Book created using Default Constructor:");
        book1.displayDetails();
        System.out.println();
        Book book2 = new Book("Atomic Habits", "James Clear", 450);
        System.out.println("Book created using Parameterized Constructor:");
        book2.displayDetails();
    }
}
