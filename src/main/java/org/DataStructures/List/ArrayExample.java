package org.DataStructures.List;

public class ArrayExample {
    public static void main(String[] args) {
        // Creating an array of strings
        String[] myArray = new String[10];

        // Initializing the array
        myArray[0] = "Apple";
        myArray[1] = "Banana";
        myArray[2] = "Cherry";
        myArray[3] = "Date";
        myArray[4] = "Elderberry";
        myArray[5] = "Fig";
        myArray[6] = "Grape";
        myArray[7] = "Honeydew";
        myArray[8] = "Kiwi";
        myArray[9] = "Lemon";

        // Print the array
        for (String fruit : myArray) {
            System.out.println(fruit);
        }

        myArray[9] = "THE VALUE OF AN ARRAY CAN BE CHANGED";

        // Print the array
        for (String fruit : myArray) {
            System.out.println(fruit);
        }
    }
}
