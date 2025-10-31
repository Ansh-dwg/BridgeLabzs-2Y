public class Book {
    
    public String title;
    public String author;
    public final String isbn;

    public static String libraryName = "City Central Library";

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void displayBookDetails() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("ISBN: " + this.isbn);
    }

    public String getIsbn() {
        return this.isbn;
    }

    public static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }
}

class LibrarySystem {
    
    public static void main(String[] args) {
        Book.displayLibraryName();

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-3-16-148410-0");
        Object book2 = new Book("1984", "George Orwell", "978-0-45-152493-5");
        Object notABook = "A random string";

        System.out.println("\n--- Book 1 Details ---");
        if (book1 instanceof Book) {
            book1.displayBookDetails();
            System.out.println("Book 1 ISBN (getter): " + book1.getIsbn());
        }

        System.out.println("\n--- Book 2 Details ---");
        if (book2 instanceof Book) {
            ((Book) book2).displayBookDetails();
        }

        System.out.println("\n--- Object Check ---");
        if (!(notABook instanceof Book)) {
            System.out.println("Object 'notABook' is not an instance of Book.");
        }
    }
}
