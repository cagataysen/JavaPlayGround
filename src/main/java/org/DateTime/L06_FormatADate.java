package org.DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class L06_FormatADate {
    //Use inbuilt pattern constants
    DateTimeFormatter inBuiltFormatter1 = DateTimeFormatter.ISO_DATE_TIME;
    DateTimeFormatter inBuiltFormatter2 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
    //Define your own custom patterns
    DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy 'at' hh:mma z");
    //Using FormatStyle
    //DateTimeFormatter customFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);

}
class FormattingDates {

    public static final String ZDT_PATTERN = "yyyy-MM-dd HH:mm:ss a z";
    public static final DateTimeFormatter ZDT_FORMATTER
            = DateTimeFormatter.ofPattern(ZDT_PATTERN);

    public static final String LDT_PATTERN = "yyyy-MM-dd HH:mm:ss a";
    public static final DateTimeFormatter LDT_FORMATTER
            = DateTimeFormatter.ofPattern(LDT_PATTERN);

    public static final String LD_PATTERN = "yyyy-MM-dd";
    public static final DateTimeFormatter LD_FORMATTER
            = DateTimeFormatter.ofPattern(LD_PATTERN);

    public static void main(String[] args) {
        String instanceString = ZDT_FORMATTER.format(ZonedDateTime.now());
        System.out.println(instanceString);

        String dateTimeString = LDT_FORMATTER.format(LocalDateTime.now());
        System.out.println(dateTimeString);

        String dateString = LD_FORMATTER.format(LocalDate.now());
        System.out.println(dateString);

        /**
         * 2025-01-04 23:20:56 pm CET
         * 2025-01-04 23:20:56 pm
         * 2025-01-04
         */
    }
}