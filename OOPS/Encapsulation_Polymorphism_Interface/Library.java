abstract class LibraryItem {
    private String itemId;
    private String title;
    protected String author;

    LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    abstract int getLoanDuration();

    void getItemDetails() {
        System.out.println("Item ID: " + itemId + ", Title: " + title);
        System.out.println("Author/Creator: " + author);
        System.out.println("Type: " + getClass().getSimpleName() + ", Loan Duration: " + getLoanDuration() + " days");
    }
}

interface Reservable {
    void reserveItem(String borrowerName, String personalId);
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    private boolean isAvailable = true;
    private String currentBorrowerId = "";

    Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    int getLoanDuration() {
        return 14; 
    }

    @Override
    public void reserveItem(String borrowerName, String personalId) {
        if (checkAvailability()) {
            this.isAvailable = false;
            this.currentBorrowerId = personalId.substring(0, 4) + "***"; 
            System.out.println("Reserved: Book " + getTitle() + " for " + borrowerName);
        } else {
            System.out.println("Reservation Failed: Book " + getTitle() + " is currently on loan.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }

    @Override
    void getItemDetails() {
        super.getItemDetails();
        System.out.println("Status: " + (isAvailable ? "Available" : "On Loan (Secured Borrower ID: " + currentBorrowerId + ")"));
    }
}

class Magazine extends LibraryItem implements Reservable {
    private boolean isAvailable = true;
    private String currentBorrowerId = "";

    Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    int getLoanDuration() {
        return 7; 
    }

    @Override
    public void reserveItem(String borrowerName, String personalId) {
        if (checkAvailability()) {
            this.isAvailable = false;
            this.currentBorrowerId = personalId.substring(0, 4) + "***";
            System.out.println("Reserved: Magazine " + getTitle() + " for " + borrowerName);
        } else {
            System.out.println("Reservation Failed: Magazine " + getTitle() + " is currently on loan.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }

    @Override
    void getItemDetails() {
        super.getItemDetails();
        System.out.println("Status: " + (isAvailable ? "Available" : "On Loan (Secured Borrower ID: " + currentBorrowerId + ")"));
    }
}

class DVD extends LibraryItem {

    DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    int getLoanDuration() {
        return 3; 
    }
}

public class Library {
    public static void main(String[] args) {
        LibraryItem book = new Book("L001", "Java Programming", "J. Gosling");
        LibraryItem magazine = new Magazine("L002", "Tech Weekly #25", "Various");
        LibraryItem dvd = new DVD("L003", "The Great Coding Adventure", "A. Director");

        ((Reservable)book).reserveItem("Mark Smith", "12345678"); 
        
        LibraryItem[] allItems = {book, magazine, dvd};

        System.out.println("--- Library Inventory Status (Polymorphism) ---");
        
        for (LibraryItem item : allItems) {
            item.getItemDetails();
            System.out.println("------------------------------------------");
        }
    }
}
