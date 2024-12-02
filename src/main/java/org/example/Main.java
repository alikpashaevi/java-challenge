package org.example;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        while (true) {
            System.out.println("\nLibrary Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Display available books");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Book Title: ");
                    String title = sc.next();
                    System.out.println("Enter Book Author: ");
                    String author = sc.next();
                    lib.addBook(title, author);
                    break;
                case 2:
                    lib.displayAvailableBooks();
                    break;
                case 3:
                    System.out.println("Enter a book name to borrow:");
                    title = sc.next();
                    lib.borrowBook(title);
                    break;
                case 4:
                    System.out.println("Enter book name to return:");
                    title = sc.next();
                    lib.returnBook(title);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");

            }
        }
    }
}