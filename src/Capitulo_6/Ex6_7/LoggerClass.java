package Capitulo_6.Ex6_7;

import java.util.logging.Logger;

class LoggerClass {

    Logger logger = Logger.getLogger(getClass().getName());

    public void showMessage(String message) {
        // ...
        logger.info(message);  // Compliant, output via logger
        // ...
    }
}
