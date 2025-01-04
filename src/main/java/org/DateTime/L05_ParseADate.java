package org.DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class L05_ParseADate {
    /**
     * Custom Patterns with DateTimeFormatter
     */
    static final String CUSTOM_PATTERN = "MM-dd-yyyy";
    static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern(CUSTOM_PATTERN);

    public static LocalDate isValidLocalDate(String dateStr, DateTimeFormatter dateFormatter) {

        LocalDate date = null;
        try {
            date = LocalDate.parse(dateStr, dateFormatter);

        } catch (DateTimeParseException e) {
            e.printStackTrace();
        }
        return date;
    }


    public static void main(String[] args) {

        /** Default Pattern 'yyy-MM-dd'*/
        LocalDate localDate = LocalDate.parse("2023-02-08");
        System.out.println(localDate);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(formatter.format(localDate));

        /*
        Assertions.assertNotNull(localDate);
        Assertions.assertEquals(8, localDate.getDayOfMonth());
        Assertions.assertEquals(2, localDate.getMonthValue());
        Assertions.assertEquals(2023, localDate.getYear());
        */









    }


}
