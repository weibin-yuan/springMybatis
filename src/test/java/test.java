import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @title:
 * @package
 * @description:
 * @author: Yuan
 * @date:
 * @version: V1.0
 */
public class test {
    private static final Logger rootLogger = LogManager.getRootLogger();
    private static final Logger nameLogger = LogManager.getLogger("name");
    private static final Logger parentLogger = LogManager.getLogger(test.class);
    public static void main(String[] args) {
        rootLogger.warn("rootLogger:warn");
        rootLogger.error("rootLogger:error");
        rootLogger.info("rootLogger:info");
        nameLogger.warn("nameLogger:warn");
        nameLogger.error("nameLogger:error");
        nameLogger.info("nameLogger:info");
        parentLogger.warn("parentLogger:warn");
        parentLogger.error("parentLogger:error");
        parentLogger.info("parentLogger:info");
    }
}
