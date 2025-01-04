package org.DateTime;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class L01_CurrentDateAndTime {

    public static void main(String[] args) {

        //Get current date
        LocalDate today = LocalDate.now();
        System.out.println(today);

        // Get current time
        LocalTime now = LocalTime.now();
        System.out.println(now);

        // Get current date and time
        LocalDateTime instance = LocalDateTime.now();
        System.out.println(instance);  // Immutable & Thread-Safe instance

        // Get current date and time in GMT
        ZonedDateTime tzInstance = ZonedDateTime.now(ZoneId.of("GMT"));
        System.out.println(tzInstance);


        // Formatted Date and Time
        LocalDateTime instance2 = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm");
        String formattedString = formatter.format(instance2);


        System.out.println("///////////////////////////////////////////////");
        /*  BEFORE JAVA 8 - FORMATTING */

        Date date = new Date();
        Calendar cal = Calendar.getInstance();

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm");
        System.out.println(sdf.format(date));
        System.out.println(sdf.format(cal.getTime()));







    }

}
