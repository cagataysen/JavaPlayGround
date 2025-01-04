package org.DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class L04_DifferenceBetweenDates {
    public static void main(String[] args) {

        /** ChronoUnit.between() for all time units*/
        LocalDate dateOfBirth = LocalDate.of(1998, Month.AUGUST, 10);
        LocalDate currentDate = LocalDate.now();

        long diffInDays = ChronoUnit.DAYS.between(dateOfBirth, currentDate);
        long diffInMonths = ChronoUnit.MONTHS.between(dateOfBirth, currentDate);
        long diffInYears = ChronoUnit.YEARS.between(dateOfBirth, currentDate);

        System.out.println(diffInDays + " " + diffInMonths + " " + diffInYears);



        LocalDateTime dateTime = LocalDateTime.of(1998, 8, 10, 7, 30);
        LocalDateTime dateTime2 = LocalDateTime.now();

        long diffInNano = ChronoUnit.NANOS.between(dateTime, dateTime2);
        long diffInSeconds = ChronoUnit.SECONDS.between(dateTime, dateTime2);
        long diffInMilli = ChronoUnit.MILLIS.between(dateTime, dateTime2);
        long diffInMinutes = ChronoUnit.MINUTES.between(dateTime, dateTime2);
        long diffInHours = ChronoUnit.HOURS.between(dateTime, dateTime2);

        System.out.println(diffInNano + " " + diffInSeconds + " " + diffInMilli + " " + diffInMinutes + " " + diffInHours);



        /**Period.Between() for Days, Months, Years*/
        LocalDate endofCentury = LocalDate.of(1998, 8, 10);
        LocalDate now = LocalDate.now();

        Period diff = Period.between(endofCentury, now);

        System.out.printf("Difference is %d years, %d months and %d days old",
                diff.getYears(), diff.getMonths(), diff.getDays());



        /**Duration.between() for hours minutes and seconds
        LocalDateTime dateTime = LocalDateTime.of(1988, 7, 4, 0, 0);
        LocalDateTime dateTime2 = LocalDateTime.now();

        int diffInNano = java.time.Duration.between(dateTime, dateTime2).getNano();
        long diffInSeconds = java.time.Duration.between(dateTime, dateTime2).getSeconds();
        long diffInMilli = java.time.Duration.between(dateTime, dateTime2).toMillis();
        long diffInMinutes = java.time.Duration.between(dateTime, dateTime2).toMinutes();
        long diffInHours = java.time.Duration.between(dateTime, dateTime2).toHours();
         */


    }
}
