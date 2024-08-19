package org.LoggerLogging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SimpleLogging {

    private static final Logger logger = Logger.getLogger(SimpleLogging.class.getName());

    public static void main(String[] args) {
        logger.info("This is an info message");
        logger.warning("This is a warning message");
        logger.severe("This is a severe error message");


        try {
            throw new Exception("This is an exception");
        } catch (Exception e) {
            logger.log(Level.SEVERE,"Exception occured", e);
        }


    }

}
