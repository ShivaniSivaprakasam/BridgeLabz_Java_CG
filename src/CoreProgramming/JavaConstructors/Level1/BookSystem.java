package CoreProgramming.JavaConstructors.Level1;
import java.util.Scanner;
import java.util.Scanner;

class BookInfo {
    private String title;
    private String author;
    private double price;
    private boolean available;
    public BookInfo(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }
    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("The book is already borrowed.");
        }
    }
    public void displayDetails() {
        System.out.println("Title       : " + title);
        System.out.println("Author      : " + author);
        System.out.println("Price       : " + price);
        System.out.println("Availability: " + (available ? "Available" : "Not Available"));
    }
}

public class BookSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter book title: ");
        String title = input.nextLine();

        System.out.print("Enter author name: ");
        String author = input.nextLine();

        System.out.print("Enter book price: ");
        double price = input.nextDouble();

        Book book = new Book(title, author, price);

        BookInfo bookInfo=new BookInfo(title, author, price);

        System.out.println("\nBook Details:");
        bookInfo.displayDetails();

        System.out.println("\nBorrowing the book");
        bookInfo.borrowBook();

        System.out.println("\nUpdated Book Details:");
        bookInfo.displayDetails();
    }
}
