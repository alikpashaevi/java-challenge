package org.example;

import java.util.ArrayList;
import java.util.Scanner;

class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }
    public void addBook(String title, String author) {
        books.add(new Book(title, author));
        System.out.println("Book added: " + title);
    }

    public void displayAvailableBooks() {
        System.out.println("Available Books:");
        boolean found = false;
        for (Book book : books) {
            if(!book.isBorrowed()) {
                System.out.println(book);
                found = true;
            }
        }
        if(!found) {
            System.out.println("No available books");
        }
    }

    public void borrowBook(String title) {
        for (Book book : books) {
            if(book.getTitle().equals(title)) {
                if (!book.isBorrowed()) {
                    book.borrowBook();
                    System.out.println("You borrowed: " + title);
                    return;
                } else {
                    System.out.println("This book is already borrowed.");
                    return;
                }
            }
        }
        System.out.println("Book not found.");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if(book.getTitle().equals(title)) {
                if (book.isBorrowed()) {
                    book.returnBook();
                    System.out.println("You returned: " + title);
                    return;
                } else {
                    System.out.println("This book is not borrowed.");
                    return;
                }
            }
        }
        System.out.println("Book not found.");
    }
}
