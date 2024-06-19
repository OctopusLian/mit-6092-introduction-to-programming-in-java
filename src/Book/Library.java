package Book;


import java.util.ArrayList;
import java.util.List;

public class Library {
    // Add the missing implementation to this class
    String address;
    List<Book> books;

    // Creates a new Library
    public Library(String address) {
        this.address = address;
        this.books = new ArrayList<>();
    }

    // Adds a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Prints the library's address
    public void printAddress() {
        System.out.println(address);
    }

    // Prints the titles of all available books in the library
    public void printAvailableBooks() {
        boolean found = false;
        for (Book book : books) {
            if (!book.isBorrowed()) {
                System.out.println(book.getTitle());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No book in catalog");
        }
    }

    // Borrows a book from the library
    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                if (!book.isBorrowed()) {
                    book.borrowed();
                    System.out.println("You successfully borrowed " + title);
                    return;
                } else {
                    System.out.println("Sorry, this book is already borrowed.");
                    return;
                }
            }
        }
        System.out.println("Sorry, this book is not in our catalog.");
    }

    // Returns a book to the library
    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                book.returned();
                System.out.println("You successfully returned " + title);
                return;
            }
        }
        System.out.println("Sorry, this book is not in our catalog.");
    }

    // Prints the opening hours
    public static void printOpeningHours() {
        System.out.println("Libraries are open daily from 9 AM to 5 PM.");
    }

    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();

    }
}
