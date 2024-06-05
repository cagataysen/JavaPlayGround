package org.binarySearchPlaying;

public class BinarySearchPlay
{
    public static int binarySearch(int numberToFind, int[] arr){

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
