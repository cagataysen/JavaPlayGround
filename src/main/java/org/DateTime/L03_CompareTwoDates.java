package org.DateTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class L03_CompareTwoDates extends Thread{
    public static void main(String[] args) throws InterruptedException {

        //LocalDate instances comparison
        LocalDate today = LocalDate.now();
        LocalDate anotherDay = LocalDate.of(2018, 01, 10);

        System.out.println(today.isEqual(anotherDay));
        System.out.println(today.isBefore(anotherDay));
        System.out.println(today.isAfter(anotherDay));

        int diff = today.compareTo(anotherDay);
        if(diff > 0) {
            System.out.println(today + " is greater than " + anotherDay);
        } else if (diff < 0) {
            System.out.println(today + " is less than " + anotherDay);
        } else {
            System.out.println(today + " is equal to " + anotherDay);
        }


        //LocalDateTime instances comparison
        LocalDateTime instance = LocalDateTime.now();
        // To have different time part in both instances
        sleep(100);
        LocalDateTime anotherInstance = LocalDateTime.now();

        // Compare only date part
        boolean isEqual = instance.toLocalDate()
                .isEqual(anotherInstance.toLocalDate());
        System.out.println(isEqual);    //true

        // Compare date and time parts
        System.out.println(instance.isEqual(anotherInstance)); // false
        System.out.println(instance.isAfter(anotherInstance)); // false
        System.out.println(instance.isBefore(anotherInstance)); // true




        //example
        LocalDate firstDay = LocalDate.of(1998, 8, 10);
        LocalDate secondDay = LocalDate.of(1999, 9, 1);

        System.out.println("Differences as a day is: " +
                Math.abs(Duration.between(firstDay.atStartOfDay(), secondDay.atStartOfDay()).toDays()));

        System.out.println("Differences as a day is: " +
                Math.abs(ChronoUnit.DAYS.between(secondDay, firstDay)));

        System.out.println(firstDay.compareTo(secondDay)); //-1
        System.out.println(secondDay.compareTo(firstDay)); //1
        //System.out.println(secondDay.compareTo(firstDay)); 0 if both dates are equal




    }
}
