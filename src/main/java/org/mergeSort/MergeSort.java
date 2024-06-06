package org.mergeSort;

public class MergeSort {


    /*
    * Merge Sort -->
    *  O(n.log n)
    * Uses more space but faster than bubble, selection, insertion
    *
    * I wish you all with this one to implement without looking at it, god bless you :)
    *
    *
    * */

    private static void mergeSort(int[] inputArray) {
        int inputLength = inputArray.length;

        if (inputLength < 2) {
            return;
        }

        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = inputArray[i];
        }
        for (int i = midIndex; i < inputLength - midIndex; i++) {
            rightHalf[i - midIndex] = inputArray[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        //Merge two sorted arrays left + right

    }

    private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                inputArray[k] = leftHalf[i];
                i++;
            }
            else{
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }

    }

}
