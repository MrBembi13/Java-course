package util.loggers;

import java.util.logging.Logger;

public class UseLogger {
    private static final Logger LOGGER = Logger.getLogger(UseLogger.class.getName());

    public void infoLogger(){
        LOGGER.info("All are good!!!");
    }

    public void errorLogger (){
        LOGGER.warning("error");
    }
}
