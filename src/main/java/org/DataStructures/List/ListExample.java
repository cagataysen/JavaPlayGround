package org.DataStructures.List;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String args[]) {
        List<String> list = new ArrayList<>();

        List<Integer> l1 = new ArrayList<Integer>();

        l1.add(0, 1);
        l1.add(1, 2);
        l1.add(2, 2);

        List<Integer> l2 = new ArrayList<Integer>();

        l2.add(3);
        l2.add(4);
        l2.add(5);

        l1.addAll(1,l2);

        System.out.println("l1 = " + l1);

        ArrayList<String> arList = new ArrayList<String>();


        List<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Cherry");
        myList.add("Date");
        myList.add("Elderberry");
        myList.add("Fig");
        myList.add("Grape");
        myList.add("Apple"); // Duplicate element

        System.out.println("myList: " + myList);





    }
}