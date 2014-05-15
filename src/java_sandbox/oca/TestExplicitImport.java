package java_sandbox.oca;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * Determine which classes need imported
 */
public class TestExplicitImport {
    public static void main(String[] args) throws IOException {
        /* Ensure directory has been created */
        new File("logs").mkdir();
        /* Get the date to be used in the filename */
        DateFormat df = new SimpleDateFormat("yyyMMddhhmmss");
        Date now = new Date();
        String date = df.format(now);
        /* Set up the filename in the logs directory */
        String logFileName = "logs\\testlog-" + date + ".txt";
        /* Set up Logger */
        FileHandler myFileHandler = new FileHandler(logFileName);
        myFileHandler.setFormatter(new SimpleFormatter());
        Logger ocajLogger = Logger.getLogger("OCAJ Logger");
        ocajLogger.setLevel(Level.ALL);
        ocajLogger.addHandler(myFileHandler);
        /* Log Message */
        ocajLogger.info("\nThis is a logged information message.");
        /* Close the file */
        myFileHandler.close();
    }
}
