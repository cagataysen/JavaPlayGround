package org.selectionSort;

import java.util.Arrays;

public class selectionSort {

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };

        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }



    public static void selectionSort(int[] arr) {

        //Define minimum and its index
        for(int i = 0; i < arr.length; i++) {

            int min = arr[i];
            int indexOfMin = i;

            //check all others to find minimum
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < min) {
                    min = arr[j];
                    indexOfMin = j;
                }
            }

            //swap the minimum to the beginning
            swap(arr, i, indexOfMin);

        }


    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }



}
