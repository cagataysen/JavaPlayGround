package org.insertionSort;

import java.util.Arrays;

public class InsertionSort {

    /*
    * Insertion Sort -->
    * O(n^2)   for large data set its bad
    * less steps than bubble sort
    *
    *
    * 1- Start with index 1 to iterate
    * 2- Sort the left side of the array and shift
    * 3- temp is i
    * 4- while loop takes the j and checks all the left side if there is any thing to be sorted
    * 5- Then you are swapping and go on.
    *
    * */



    public static void insertionSort(int[] array){
        for(int i = 1; i < array.length; i++){
            int temp = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > temp){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }
    }


    public static void main(String[] args) {
        int[] array = new int[]{7,6,10,5,2,1,4,3,0,8,9};

        insertionSort(array);

        System.out.println(Arrays.toString(array));
    }
}


