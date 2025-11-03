class Book {
    String title;
    int publicationYear;

    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
}

class Author extends Book {
    String name;
    String bio;

    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Published Year: " + publicationYear);
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}

class LibraryDemo {
    public static void main(String[] args) {
        Author authorData = new Author(
            "Learning Java Inheritance",
            2024,
            "Code Simplifier",
            "Dedicated to minimal and functional programming."
        );
        authorData.displayInfo();
    }
}
