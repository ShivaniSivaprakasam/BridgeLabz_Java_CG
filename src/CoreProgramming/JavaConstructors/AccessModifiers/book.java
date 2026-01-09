package CoreProgramming.JavaConstructors.AccessModifiers;
class BookInfo {

    public String ISBN;
    protected String title;
    private String author;

    BookInfo(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void displayBook() {
        System.out.println("ISBN   : " + ISBN);
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
    }
}

class EBook extends BookInfo {

    EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void displayEBookDetails() {
        System.out.println("EBook ISBN  : " + ISBN);
        System.out.println("EBook Title : " + title);
    }
}

public class book {
    public static void main(String[] args) {

        BookInfo book = new BookInfo("978-0134685991", "Effective Java", "Joshua Bloch");
        book.displayBook();

        book.setAuthor("J. Bloch");
        System.out.println("\nUpdated Author: " + book.getAuthor());

        System.out.println("\nEBook Details:");
        EBook ebook = new EBook("978-1492078005", "Java: The Complete Reference", "Herbert Schildt");
        ebook.displayEBookDetails();
    }
}
