package org.EffectiveJava.Chapter3.item14;

import java.util.Comparator;

public class NameComparison implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
