package org.DataStructures.List;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        mySet.add("Apple");
        mySet.add("Banana");
        mySet.add("Cherry");
        mySet.add("Date");
        mySet.add("Elderberry");
        mySet.add("Fig");
        mySet.add("Grape");
        mySet.add("Apple"); // Duplicate element

        System.out.println(mySet); // Apple will appear only once
    }
}
