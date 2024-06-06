package org.binarySearchPlaying;

public class BinarySearchPlay
{
    public static int binarySearch(int numberToFind, int[] arr){


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

        int lowest = 0;
        int highest = arr.length - 1;

        while(lowest < highest){

            int middlePosition = (arr[lowest] + arr[highest]) / 2;

            int middleNumber = arr[middlePosition];

            if(numberToFind == middleNumber){
                return numberToFind;
            }
            if(numberToFind > middleNumber){
                lowest = middlePosition + 1;
            }
            if(numberToFind < middleNumber){
                highest = middlePosition - 1 ;
            }

        }

        return -1;
    }


    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Binary Search Play: " + binarySearch(12, array));
    }

}
