package org.DataStructures.List;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> arList = new ArrayList<>();
        arList.add("Apple");
        arList.add("Banana");
        arList.add("Cherry");
        arList.add("Date");
        arList.add("Elderberry");
        arList.add("Fig");
        arList.add("Grape");
        arList.add("Apple"); // Duplicate element

        System.out.println(arList);
    }
}
