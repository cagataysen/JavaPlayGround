package org.quickSort;

public class QuickSort {

    /*
    *
    * Choose random pivot in the array
    * Lets say you chose the last element
    * Move all numbers smaller than that pivot to the left, vice versa
    *
    *
    * recursively quick sort left and right sides again
    *
    * so choose again pivot for left, and right sides.
    *
    * apply quick sort.
    *
    * */


    public static void main(String[] args) {
        int[] array = {3, 6, 8, 10, 1, 2, 1};
        quickSort(array, 0, array.length - 1);
        System.out.println(java.util.Arrays.toString(array));
    }

    private static void quickSort(int[] array, int lowIndex, int highIndex) {

        //choose pivot. Choose for ex last element

        if (lowIndex < highIndex) {
            // Choose pivot
            int pivot = array[highIndex];

            // Partition the array
            int partitionIndex = partition(array, lowIndex, highIndex, pivot);

            // Recursively apply quicksort to the left and right subarrays
            quickSort(array, lowIndex, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, highIndex);
        }
    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static int partition(int[] array, int lowIndex, int highIndex, int pivot) {
        int leftPointer = lowIndex;
        int rightPointer = highIndex - 1;

        while (leftPointer < rightPointer) {
            // Walk from the left until we find a number greater than the pivot, or hit the right pointer
            while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            // Walk from the right until we find a number less than the pivot, or hit the left pointer
            while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }

            swap(array, leftPointer, rightPointer);
        }

        // Fix an issue where the last value could potentially be out of order
        if (array[leftPointer] > array[highIndex]) {
            swap(array, leftPointer, highIndex);
        } else {
            leftPointer = highIndex;
        }

        return leftPointer;
    }



}
