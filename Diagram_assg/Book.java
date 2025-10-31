package Diagram_assg;

import java.util.*;

// Book class — independent entity
class Book {
    private String title;
    private String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Display book details
    public void displayBookInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

// Library class — aggregates multiple Book objects
class Library {
    private String name;
    private ArrayList<Book> books;

    // Constructor
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Display all books in the library
    public void showLibraryBooks() {
        System.out.println("\nLibrary: " + name);
        if (books.isEmpty()) {
            System.out.println("No books in this library.");
        } else {
            for (Book b : books) {
                b.displayBookInfo();
            }
        }
    }
}

// Main class
public class LibraryAggregationExample {
    public static void main(String[] args) {
        // Create independent Book objects
        Book b1 = new Book("The Alchemist", "Paulo Coelho");
        Book b2 = new Book("Clean Code", "Robert C. Martin");
        Book b3 = new Book("1984", "George Orwell");

        // Create libraries
        Library cityLibrary = new Library("City Library");
        Library collegeLibrary = new Library("College Library");

        // Add books to libraries
        cityLibrary.addBook(b1);
        cityLibrary.addBook(b2);

        collegeLibrary.addBook(b2); // same book can exist in multiple libraries
        collegeLibrary.addBook(b3);

        // Display books in each library
        cityLibrary.showLibraryBooks();
        collegeLibrary.showLibraryBooks();
    }
}
