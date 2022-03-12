package com.techelevator;

/**
 * Bookstore
 */
public class Bookstore {

    public static void main(String[] args) {

        System.out.println("Welcome to the Tech Elevator Bookstore");
        System.out.println();

        // Step Three: Test the getters and setters

        // Step Five: Test the Book constructor
        Book threeMusketeers = new Book("The Three Musketeers", "Alexandre Dumas", 12.95);

        Book childhoodEnd = new Book("Childhood's End", "Arthur C. Clark", 5.99);

        System.out.println(threeMusketeers.bookInfo());
        System.out.println(childhoodEnd.bookInfo());

        // Step Nine: Test the ShoppingCart class

    }
}