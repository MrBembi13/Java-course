package util.loggers;

import org.apache.log4j.Logger;

public class UseLogger {
    private static final Logger LOGGER = Logger.getLogger(UseLogger.class);

    public void infoLogger(){
        LOGGER.info("All are good!!!");
    }

    public void errorLogger (){
        LOGGER.error("error");
    }
}
