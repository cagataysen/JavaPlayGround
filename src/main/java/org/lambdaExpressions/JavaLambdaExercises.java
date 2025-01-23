package org.lambdaExpressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class JavaLambdaExercises {
    /**
     * Write a Java program to implement a lambda expression to find the sum of two integers.
     */
    interface SumCalculator{
        int sum(int a, int b);
    }

    /*
    public static void main(String[] args) {
        SumCalculator sumCalculator = (x,y) -> x + y;
        int result = sumCalculator.sum(7, 6);

        System.out.println(result);
    }
*/

    /**
     * Write a Java program to implement a lambda expression to check if a given string is empty.
     */
/*
    public static void main(String[] args) {
        // Lambda expression to check if a given string is empty
        Predicate<String> isEmptyString = str -> str.isEmpty();

        // Test cases
        String str1 = ""; // empty string
        String str2 = "Java lambda expression!"; // non-empty string

        // Check if the strings are empty using the lambda expression
        System.out.println("String 1:" + str1);
        System.out.println("String 1 is empty: " + isEmptyString.test(str1));
        System.out.println("\nString 2:" + str2);
        System.out.println("String 2 is empty: " + isEmptyString.test(str2));
    }
*/

    /**
     *Write a Java program to implement a lambda expression to convert a list of strings
     * to uppercase and lowercase.
     */
/*
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Red", "Green", "Blue", "PINK");


        stringList.replaceAll(str -> str.toLowerCase()); //to lower
        System.out.println("Lower Cases:");
        stringList.forEach(s -> System.out.println(s)); //to print

        stringList.replaceAll(str -> str.toUpperCase());
        System.out.println("\nUpper Cases:");
        stringList.forEach(s -> System.out.println(s)); //to print
    }
*/

    /**
     Write a Java program to implement a lambda expression to filter out even and odd numbers
     from a list of integers.
     */
/*
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(11, 23, 98, 34, 15, 32, 42, 80, 99, 100);

        List<Integer> evenNumbers = nums.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());
        List<Integer> oddNumbers = nums.stream().filter(a -> a % 2 == 1).collect(Collectors.toList());

        System.out.println(evenNumbers);
        System.out.println(oddNumbers);

    }
*/

    /**
     * Write a Java program to implement a lambda expression to sort a list of strings
     * in alphabetical order
     */

    /*
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "cagatay", "orhan", "aleks", "krakow", "beko");

        //List<String> sortedWords = words.stream().sorted().toList();
        //System.out.println(sortedWords);

        words.sort((str1, str2) -> str1.compareToIgnoreCase(str2));  ////words.sort(String::compareToIgnoreCase);
        System.out.println(words);
    }
     */

    /**
     * Write a Java program to implement a lambda expression to find the average of a list of doubles
     */

    public static void main(String[] args) {
        List<Double> doubleList = Arrays.asList(2.3, 4.5, 52.22, 10.4, 10.08, 22.5, 29.0);

        double average = doubleList.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);

        System.out.println(average);
    }




}
