package org.EffectiveJava.Chapter3.item14;

//Consider implementing Comparable

import java.util.ArrayList;
import java.util.Collections;

public class ItemFourteenTest {
    public static void main(String[] args) {
        ArrayList<Book> listOfBooks = new ArrayList<Book>();

        listOfBooks.add(new Book("atomic habbits", 500));
        listOfBooks.add(new Book("5am club", 600));
        listOfBooks.add(new Book("secret", 200));

        Collections.sort(listOfBooks);

        System.out.println("Order1");
        for (Book book : listOfBooks) {
            System.out.println(book.toString());
        }





        //Ordering two
        System.out.println("Ordering 2:");
        NameComparison accordingToName = new NameComparison();
        Collections.sort(listOfBooks, accordingToName);
        for (Book book : listOfBooks) {
            System.out.println(book.toString());
        }

    }
}
