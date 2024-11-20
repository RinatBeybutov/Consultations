package DIP;

public class LoggerFileImpl implements ILogger {

    @Override
    public void log(String message) {
        System.out.println("Log message to file: " + message);
    }
}
