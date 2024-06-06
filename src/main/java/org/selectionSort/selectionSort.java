package org.selectionSort;

import java.util.Arrays;

public class selectionSort {



    /*
    * Selection Sort -->
    * 1- We need to find smallest element
    *
    * 2- After finding it, we need to swap this smallest with index i to the beginning.
    *
    * 3- Repeat until it will be sorted.
    *
    * */

    /*As you see we are swapping in Arrays. Eventho they are dynamic, it supports swaps. */

    public static void selectionSort(int[] arr) {

        //Define minimum and its index
        for(int i = 0; i < arr.length; i++) {

            int min = arr[i];    //starting element min = arr[0]
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


    //int a and int b are indexes, so a is on the left index, b is smallest elements index  and b will be replaced to the beginning
    // a > b
    // 1, 3, a, 16, 26, b
    // after swap 1, 3, b, 16, 26, a

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }



    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };

        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }


}
