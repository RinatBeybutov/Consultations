package DIP;

public class LoggerConsoleImpl {

    public void log(String message) {
        System.out.println(message);
    }

    public void error(String message) {
        System.out.println("Error!: " + message);
    }
}
