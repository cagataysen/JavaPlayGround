package org.EffectiveJava.Chapter4.item18;

import java.util.ArrayList;
import java.util.List;

public class TestDrive {
    public static void main(String[] args) {
        Book book1 = new Book("Atomic Habbits");
        Book book2 = new Book("5am Club");

        List<Book> listOfBooks = new ArrayList<Book>();

        listOfBooks.add(book1);
        listOfBooks.add(book2);

        Library library = new Library(listOfBooks);

        List<Book> allBooksInLibrary = library.getBooks();

        for (Book book: allBooksInLibrary) {
            System.out.println(book.getName());
        }
    }
}
