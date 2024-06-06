package org.bubbleSort;

import java.util.Arrays;

public class BubbleSort
{
    public static void bubbleSort(int[] arr){

        /*
        * Bubble Sort -->
        * O(n^2 complexity)
        *
        * 1- Compare i and i+1
        * 2- Swap if needed
        * 3- Flag if you swapped because iteration will be stopped if there is no comparison anymore
        *
        * */

        boolean swapped = true;

        while (swapped) {

            swapped = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }

            }
        }
        }

    public static void main(String[] args) {
        int[] arr = {131,21,34,444,54,33365,76,854,9};

        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }


}
