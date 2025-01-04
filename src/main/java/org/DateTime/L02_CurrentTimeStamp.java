package org.DateTime;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Date;

public class L02_CurrentTimeStamp {
    public static void main(String[] args) {
        /*JAVA 8*/

        // Get Current Timestamp with Instant --> UTC (Universal time scale)
        Instant instant = Instant.now();
        System.out.println(instant);        //2025-01-04T21:36:47.959526700Z

        /*JAVA 7 and earlier*/
        Timestamp timestamp1 = new Timestamp(System.currentTimeMillis());

        Date date = new Date();
        Timestamp timestamp2 = new Timestamp(date.getTime());

        System.out.println(timestamp1);     //2025-01-04 22:38:20.592
        System.out.println(timestamp2);     //2025-01-04 22:38:20.592




    }


}
