package org.binarySearchTree;

public class BinarySearch {

    /*
     * Binary Search -->
     * 0- We need Sorted elements to apply this.
     *
     * 1- Initialize lowest and highest
     *    set "low" to the starting index (0)
     *    set high to the ending index which is array.length - 1
     *
     * 2- Find Middle index
     *
     * 3- Check the middle element
     *    if the middle element is target, return the middle index
     *    if the middle element is less than target, set low to mid + 1
     *    if the middle element is greater than target, set high to mid - 1
     *
     * */


    private static int binarySearch(int[] numbers, int numberToFind) {
        int low = 0;
        int high = numbers.length - 1;

        while (low <= high){
            int middlePosition = (low + high) / 2;
            int middleNumber = numbers[middlePosition];

            if (numberToFind == middleNumber){
                return middlePosition;
            }
            if (numberToFind < middleNumber){
                high = middlePosition - 1;
            }
            else {
                low = middlePosition + 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] ints = {1, 2, 4, 5, 7, 9, 11};

        System.out.println("0 is at position: " + binarySearch(ints, 0));
        System.out.println("1 is at position: " + binarySearch(ints, 1));
        System.out.println("2 is at position: " + binarySearch(ints, 2));
        System.out.println("3 is at position: " + binarySearch(ints, 3));
        System.out.println("4 is at position: " + binarySearch(ints, 4));
        System.out.println("5 is at position: " + binarySearch(ints, 5));
        System.out.println("6 is at position: " + binarySearch(ints, 6));
        System.out.println("7 is at position: " + binarySearch(ints, 7));
        System.out.println("8 is at position: " + binarySearch(ints, 8));
        System.out.println("9 is at position: " + binarySearch(ints, 9));
        System.out.println("10 is at position: " + binarySearch(ints, 10));

    }

}