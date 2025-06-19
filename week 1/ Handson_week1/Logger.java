public class Logger {
    // Static variable to hold single instance
    private static Logger instance;

    // Private constructor to prevent instantiation
    private Logger() {
        System.out.println("Logger initialized.");
    }

    // Public method to return the single instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); // Lazy initialization
        }
        return instance;
    }

    // Sample method to log a message
    public void log(String message) {
        System.out.println("[LOG]: " + message);
    }

    // Main method to test singleton behavior
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("Logging from logger1");

        Logger logger2 = Logger.getInstance();
        logger2.log("Logging from logger2");

        // Check if both logger1 and logger2 are the same instance
        System.out.println("Are both loggers the same instance? " + (logger1 == logger2));
    }
}

